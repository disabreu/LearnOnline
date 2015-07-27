package learnonline

class UserController {
	
	def salt = "2014grails" 
	
	def list = { ->
		
		def allUsers= User.findAll()
		
			render(view:"list", model:[users:allUsers])

	}
	
	def detail = { ->
		
		def selectedUser = User.findById(params.id)
		render(view:"detail", model:[user:selectedUser])
				
	}
	
	
	def register = { ->
		
		//register will redirect me to a registration page.
		def roles = ["student", "professor"]
		
		render(view:"register", model:[roles:roles])

	}
	
	def createUser = { ->
		
		//when form submitted
		def formSubmitted = params.submit
		//take params
		if(formSubmitted) {
			def userName = params.name
			def userLastName = params.lastname
			def userEmail = params.email
			def userUsername = params.username
			String userPassword = params.password
			def userRole = params.role
			
			User newUser
			def message = ""
			
			if(userName && userLastName && userEmail && userUsername && userPassword && userRole) {
				User a = User.findByUsername(userUsername)
				
				if(a) { // The user already exists! we cannot create it
					message = "The username you chose already exists. Please provide a different username."
				} else {
					message = "New user created"
					//give your user an ID
					int previousUser = User.count()
					newUser = new User(id:(previousUser+1), username:userUsername, password:(userPassword + salt).encodeAsSHA1().toString(), name:userName, lastName:userLastName, role:userRole, email:userEmail)
					session.user = newUser
					newUser.save(flush:true)
				}
				
			} else {
				message = "One or more fields were empty! Please complete them."
			}
			def roles = ["student", "professor"]
			render(view:"register", model:[user:newUser, message:message, roles:roles])
		}
		
		
	}
	
	def login() {
		

		User user = User.findByUsernameAndPassword(params.username, (params.password.toString() + salt).encodeAsSHA1().toString())
		if(user) {
			session.user = user 
		}
		
		redirect(uri:"/")
		
	}
	
	def logout() {
		
		session.invalidate()
		redirect(uri:"/")
		

	}
	
    def index() { }
}
