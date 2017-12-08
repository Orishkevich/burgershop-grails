package burgershop.grails

import com.google.common.collect.Lists
import grails.converters.JSON

class HomeController {

    def index() {
        render(view: 'home.gsp')
    }

    def clickShop() {
//        redirect (action:'shop')
        //def items = []
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
            item = new ShopableItem(name: "dog", price: 10, category: Category.MEAT)
            item.save()

            item = new ShopableItem(name: "mushrooms", price: 285, category: Category.MEAT)
            item.save()
            item = new ShopableItem(name: "broccoli", price: 185, category: Category.MEAT)
            item.save()
            item = new ShopableItem(name: "cheese", price: 85, category: Category.MEAT)
            item.save()
            item = new ShopableItem(name: "sauce", price: 85, category: Category.MEAT)
            item.save()
            item = new ShopableItem(name: "cockroach", price: 2085, category: Category.MEAT)
            item.save()
        }



        items =ShopableItem.findAll()
        chain(action: "shop", model: [items: items])
        //redirect(action: 'shop')
    }

    def shop() {
        def items = chainModel ? chainModel.get("items") ?: [] : []
        println(items  as JSON)
        [items: items  as JSON]
//        @RequestMapping(value = "/shop.html")
//        public String enterShop(HttpServletRequest request){
//
//            List<ShopableItem> items = service.getShopableItems();
//            log.debug("Items: "+items);
//
//            HashMap<Category, List<ShopItemBean>> beans = new HashMap<Category, List<ShopItemBean>>();
//            for (ShopableItem item : items){
//                ShopItemBean bean = new ShopItemBean();
//                bean.setItem(item.getName());
//                bean.setPrice(item.getPrice());
//
//                String nicePrice = "";
//
//                nicePrice = ""+(item.getPrice()/100);
//                int centPrice = item.getPrice()-(item.getPrice()/100*100);
//                nicePrice += ".";
//                nicePrice += (centPrice<10) ? centPrice == 0 ? "00" : "0"+centPrice :""+centPrice;
//                bean.setNicePrice(nicePrice);
//
//                List<ShopItemBean> itemsForCategory = beans.get(item.getCategory());
//                if (itemsForCategory==null){
//                    itemsForCategory = new ArrayList<ShopItemBean>();
//                    beans.put(item.getCategory(), itemsForCategory);
//                }
//                itemsForCategory.add(bean);
//            }
//
//            for (Category c : Category.values()){
//                request.setAttribute(c.name(), beans.get(c));
//            }
//
//
//            return "shop";
//        }


        //render(view: 'shop.gsp')
    }
}
