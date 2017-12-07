package burgershop.grails

class HomeController {

    def index() {
        render(view: 'home.gsp')
    }

    def clickShop() {
//        redirect (action:'shop')
        //def items = []
        def items = ShopableItem.findAll()
        if (!items) {
            def item = new ShopableItem(name: "wheat", price: 585, category: "BREAD")
            item.save()
            item = new ShopableItem(name: "wholemeal", price: 285, category: "BREAD")
            item.save()
            item = new ShopableItem(name: "brioche", price: 585, category: "BREAD")
            item.save()
            item = new ShopableItem(name: "burned", price: 585, category: "BREAD")
            item.save()
            item = new ShopableItem(name: "leibniz", price: 1085, category: "BREAD")
            item.save()


            item = new ShopableItem(name: "cow", price: 1385, category: "MEAT")
            item.save()
            item = new ShopableItem(name: "pork", price: 1185, category: "MEAT")
            item.save()
            item = new ShopableItem(name: "lamb", price: 1585, category: "MEAT")
            item.save()
            item = new ShopableItem(name: "dog", price: 585, category: "MEAT")
            item.save()
            item = new ShopableItem(name: "dog", price: 10, category: "MEAT")
            item.save()

            item = new ShopableItem(name: "mushrooms", price: 285, category: "EXTRAS")
            item.save()
            item = new ShopableItem(name: "broccoli", price: 185, category: "EXTRAS")
            item.save()
            item = new ShopableItem(name: "cheese", price: 85, category: "EXTRAS")
            item.save()
            item = new ShopableItem(name: "sauce", price: 85, category: "EXTRAS")
            item.save()
            item = new ShopableItem(name: "cockroach", price: 2085, category: "EXTRAS")
            item.save()
        }


        items = ShopableItem.findAll()
        chain(action: "shop", model: [items: items])
        //redirect(action: 'shop')
    }

    def shop() {
        def items = chainModel ? chainModel.get("items") ?: [] : []
        render(view: 'shop.gsp')
    }
}
