class UrlMappings {

	static mappings = {
		//"/admin/report/$action?/$id?(.${format})?"(controller: 'report')
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
