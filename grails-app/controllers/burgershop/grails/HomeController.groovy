package burgershop.grails

import grails.converters.JSON

class HomeController {

    def index() {
        render(view: 'home.gsp')
    }

    def clickShop() {
        def items = ShopableItem.findAll()
        if (!items) {
            def item = new ShopableItem(name: "wheat", price: 585, category:  Category.BREAD)
            item.save()
            item = new ShopableItem(name: "wholemeal", price: 285, category: Category.BREAD)
            item.save()
            item = new ShopableItem(name: "brioche", price: 585, category: Category.BREAD)
            item.save()
            item = new ShopableItem(name: "burned", price: 585, category: Category.BREAD)
            item.save()
            item = new ShopableItem(name: "leibniz", price: 1085, category: Category.BREAD)
            item.save()


            item = new ShopableItem(name: "cow", price: 1385, category: Category.MEAT)
            item.save()
            item = new ShopableItem(name: "pork", price: 1185, category: Category.MEAT)
            item.save()
            item = new ShopableItem(name: "lamb", price: 1585, category: Category.MEAT)
            item.save()
            item = new ShopableItem(name: "dog", price: 585, category: Category.MEAT)
            item.save()
            item = new ShopableItem(name: "rat", price: 10, category: Category.MEAT)
            item.save()

            item = new ShopableItem(name: "mushrooms", price: 285, category: Category.EXTRAS)
            item.save()
            item = new ShopableItem(name: "broccoli", price: 185, category: Category.EXTRAS)
            item.save()
            item = new ShopableItem(name: "cheese", price: 85, category: Category.EXTRAS)
            item.save()
            item = new ShopableItem(name: "sauce", price: 85, category: Category.EXTRAS)
            item.save()
            item = new ShopableItem(name: "cockroach", price: 2085, category: Category.EXTRAS)
            item.save()
        }
        items =ShopableItem.findAll()
        chain(action: "shop", model: [items: items])
    }

    def shop() {
        def items = chainModel ? chainModel.get("items") ?: [] : []
        [items: items  as JSON]

    }
}
