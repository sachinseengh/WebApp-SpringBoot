<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>	
<head>
<link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
	<title>
		Add Todo
		</title>
	</head>
	<body>
		<div class="container">
		
		<h1>Enter your new ToDo!</h1>
		<form:form method="Post" modelAttribute="todo">
		<fieldset class="my-3">
		Description : <form:input type="text" path="description" required = "required"/>
		<form:errors path="description"/>
		<form:input type="hidden" path="username"/>
		<form:input type="hidden" path="id"/>
		<form:input type="hidden" path="done"/>
		</fieldset>
	<fieldset class="my-3">
		Target Date :
		<form:input type="text" path ="target" required="required"/>
		</fieldset>
		<button type="submit"  class ="btn btn-success">Submit</submit>
			
		</form:form>
		</div>
		
		</body>

			<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>	
			<script src="webjars/jquery/3.7.1/dist/jquery.min.js"></script>



</html>