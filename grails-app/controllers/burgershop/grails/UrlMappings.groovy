package burgershop.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(action: 'index')
//        "/home"(controller: 'home', action: 'index')
//        "/shop"(controller: 'home', action: 'shop')
        //"/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
