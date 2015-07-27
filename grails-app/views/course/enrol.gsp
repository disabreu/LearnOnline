<!DOCTYPE html>
<html>
	<head>

		<title>AddCourse - Learn Online</title>
	</head>
	<body>
		<g:if test="${session.user}"> <!-- Only print content if the user is logged in! -->

			<h2>AddCourse - Learn Online</h2>
			
			<g:if test="${message}">
				<h4>${message}</h4>
			</g:if>
		    
			<g:if test="${courses}">
				<g:each var="course" in="${courses}">
					<h4><g:link controller="Course" action="putCourseOnUser" id="${course.id}">00${course.id} - ${course.name} (${course.creditHours} Credit Hours)</g:link></h4>
					<p><b>Professor:</b> ${course.professor}</p>
					<br>
				</g:each>
			</g:if>		
			<br>
			<br>
	        <h4><g:link uri="/">&lt;&lt;Home&gt;&gt;</g:link></h4>
		</g:if>
		<g:else>
			<br>
			<h3>No courses available at the moment, check in a few hours.</h3>
			<br>
			<br>
			<h4><g:link uri="/">&lt;&lt;Home&gt;&gt;</g:link></h4>
		</g:else>
		
	</body>
</html>