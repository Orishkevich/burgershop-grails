package burgershop.grails

class ShopableItem {

    int price

    String name

    String category

    static constraints = {
    }

//    static mapping = {
//        category(enumType: "string")
//    }
//
//    enum Category {
//        BREAD("BREAD"), MEAT("MEAT"), EXTRAS("EXTRAS")
//
//        String title
//
//        Category(String title) {
//            this.title = title
//        }
//    }
}
