<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Blackboard"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">

		<asset:javascript src="application.js"/>
		<g:layoutHead/>
	</head>
	<body>
		<div id="myLogo" role="banner"><a href="/LearnOnline/"><asset:image src="Blackboard_logo.png" alt="Grails"/></a></div>
		
		<g:layoutBody/><!-- vamos que esto me llama al index.gsp -->
		<div class="container">
			<div class="row">
				<div class="col-md-7"><g:render template="loginform"/></div><br>
			    <g:if test="${!session.user}">
				<div class = "reg">Not registered yet?<g:link controller="User" action="register"> Click Here!</g:link>.</div>
		        </g:if>
		<g:if test="${session.user}">
			<h2>Content</h2>
			<ul>
				<li><h4><g:link controller="Course" action="list">Courses List</g:link></h4></li>
				<g:if test="${session.user.role == 'professor'}">
				<li><h4><g:link controller="User" action="list">Users List</g:link></h4></li>
			    </g:if>	
				<li><h4><g:link controller="Course" action="enrol">Enrol in a course</g:link></h4></li>
				<li><h4><g:link controller="Course" action="drop" id="${session.user.id}">Drop a course</g:link></h4></li>
				<li><h4><g:link controller="User" action="detail" id="${session.user.id}">See your courses</g:link></h4></li>
			</ul>
		</g:if>
				
		</div>
		</div>		
		<div class="footer" role="contentinfo"></div>
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>

	</body>
</html>
