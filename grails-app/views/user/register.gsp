<!DOCTYPE html>
<html>
	<head>

		<title>Register - Learn Online</title>
	</head>
	<body>
		<g:if test="${!session.user}"> <!-- Only print content if the user is NOT logged in! -->
		
				<div class="row">
			  		<div class="col-md-5">
						<g:form class="form-horizontal" role="form" controller="User" action="createUser">
							<legend><h2>Registration</h2></legend>
							<div class="form-group">
								<label class="control-label col-sm-3">Name:</label>
								<div class="col-sm-9">
									<g:field class="form-control" type="text" name="name"/>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-3">Last Name:</label>
								<div class="col-sm-9">
									<g:field class="form-control" type="text" name="lastname"/>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-3">Email:</label>
								<div class="col-sm-9">
									<g:field class="form-control" type="text" name="email"/>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-3">Username:</label>
								<div class="col-sm-9">
									<g:field class="form-control" type="text" name="username"/>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-3">Password:</label>
								<div class="col-sm-9">
									<g:field class="form-control" type="password" name="password"/>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-3">Role:</label>
								<div class="col-sm-9">
									<g:select class="form-control" name="role" from="${roles}"/>
								</div>
							</div>
							<div class="form-group"> 
								<div class="col-sm-offset-3 col-sm-9">
									<g:submitButton class="btn btn-primary" name="submit" value="Register"/>
								</div>
							</div>
						</g:form>
						
					</div>
				</div>		
			<br>
			<br>
	        <h4><g:link uri="/">&lt;&lt;Home&gt;&gt;</g:link></h4>
		</g:if>
		<g:else>
			<br>
			<h3>You are already logged in! You don't need to register</h3>
			<br>
			<br>
			<h4><g:link uri="/">&lt;&lt;Home&gt;&gt;</g:link></h4>
		</g:else>
		
	</body>
</html>