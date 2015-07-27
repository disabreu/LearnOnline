package learnonline

class CourseController {

	/*
	 * Action for courses list 
	 */
	def list = { ->
			
		def allCourses = Course.findAll()
		
			render(view:"list", model:[courses:allCourses])
		
	}
	
	def detail = { ->
		
		def selectedCourse = Course.findById(params.id)
		render(view:"detail", model:[course:selectedCourse])
		
	}
	
	def enrol = { ->
		
	def courses = Course.findAll()
	//message = "Enrol in one of the following courses."
		
	  render(view:"enrol", model:[courses:courses])

	}
	
	def putCourseOnUser = { ->
			
            def hola = 0
            def allCourses = Course.findAll()			
			//render(view:"list", model:[courses:allCourses])//get all courses from the user save into and array.
     		def selectedCourse = Course.findById(params.id)
			User currentUser = User.findById(session.user.id)
			def userCourses = currentUser.courses

			for(item in userCourses){
				
				if(item == selectedCourse){
					
					hola = 1
					
				} else {
						
				}	
			}
			
			if(hola == 1){
				
			  def message = "You are already enroled in this course, select another one."
			  render(view:"putCourseOnUser", model:[message: message])
			
			} 
			
			if (hola == 0) {
			//add course
				
			  currentUser.addToCourses(selectedCourse)
			  currentUser.save(flush:true) //update user on the database
			  //important to make currentUser the session.user?
			  session.user = currentUser
			  def message = "You are now enroled in the course selected."
			  render(view:"putCourseOnUser", model:[message:message])
			}

	}
	
	def drop = { ->
		
		def selectedUser = User.findById(params.id)
		render(view:"drop", model:[user:selectedUser])
		
		

	}
	
	def removeFromUser = { ->
		
		def hola = 0
		def allCourses = Course.findAll()
		//render(view:"list", model:[courses:allCourses])//get all courses from the user save into and array.
		def selectedCourse = Course.findById(params.id)
		User currentUser = User.findById(session.user.id)

		  currentUser.removeFromCourses(selectedCourse)
		  currentUser.save(flush:true) //update user on the database
		  session.user = currentUser
		  render(view:"drop", model:[user:currentUser])
		

	}
	
}

