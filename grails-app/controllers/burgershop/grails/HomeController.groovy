package burgershop.grails

import grails.converters.JSON
import net.anotheria.moskito.aop.annotation.Monitor



@Monitor
class HomeController {


    def index() {
        render(view: 'home.gsp')
    }


    def shop() {
        def items = ShopableItem.findAll()
        if (!items) {
            new ShopableItem(name: "wheat", price: 585, category: Category.BREAD).save()
            new ShopableItem(name: "wholemeal", price: 285, category: Category.BREAD).save()
            new ShopableItem(name: "brioche", price: 585, category: Category.BREAD).save()
            new ShopableItem(name: "burned", price: 585, category: Category.BREAD).save()
            new ShopableItem(name: "leibniz", price: 1085, category: Category.BREAD).save()
            new ShopableItem(name: "cow", price: 1385, category: Category.MEAT).save()
            new ShopableItem(name: "pork", price: 1185, category: Category.MEAT).save()
            new ShopableItem(name: "lamb", price: 1585, category: Category.MEAT).save()
            new ShopableItem(name: "dog", price: 585, category: Category.MEAT).save()
            new ShopableItem(name: "rat", price: 10, category: Category.MEAT).save()
            new ShopableItem(name: "mushrooms", price: 285, category: Category.EXTRAS).save()
            new ShopableItem(name: "broccoli", price: 185, category: Category.EXTRAS).save()
            new ShopableItem(name: "cheese", price: 85, category: Category.EXTRAS).save()
            new ShopableItem(name: "sauce", price: 85, category: Category.EXTRAS).save()
            new ShopableItem(name: "cockroach", price: 2085, category: Category.EXTRAS).save()
        }
        items = ShopableItem.findAll()
        [items: items as JSON]
    }

    def order() {
        def order = params
        [order: order]
    }
}
