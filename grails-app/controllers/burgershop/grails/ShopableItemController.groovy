package burgershop.grails


import net.anotheria.moskito.aop.annotation.Monitor


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional


@Transactional(readOnly = true)
@Monitor
class ShopableItemController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 20, 100)
        respond ShopableItem.list(params), model: [shopableItemCount: ShopableItem.count()]
    }

    def show(ShopableItem shopableItem) {
        respond shopableItem
    }

    def create() {
        respond new ShopableItem(params)
    }

    @Transactional
    def save(ShopableItem shopableItem) {
        if (shopableItem == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (shopableItem.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond shopableItem.errors, view: 'create'
            return
        }

        shopableItem.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'shopableItem.label', default: 'ShopableItem'), shopableItem.id])
                redirect shopableItem
            }
            '*' { respond shopableItem, [status: CREATED] }
        }
    }

    def edit(ShopableItem shopableItem) {
        respond shopableItem
    }

    @Transactional
    def update(ShopableItem shopableItem) {
        if (shopableItem == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (shopableItem.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond shopableItem.errors, view: 'edit'
            return
        }

        shopableItem.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'shopableItem.label', default: 'ShopableItem'), shopableItem.id])
                redirect shopableItem
            }
            '*' { respond shopableItem, [status: OK] }
        }
    }

    @Transactional
    def delete(ShopableItem shopableItem) {

        if (shopableItem == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        shopableItem.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'shopableItem.label', default: 'ShopableItem'), shopableItem.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'shopableItem.label', default: 'ShopableItem'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
