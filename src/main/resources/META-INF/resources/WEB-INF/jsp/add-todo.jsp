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
		Description : <form:input type="text" path="description" required = "required"/>
		<form:errors path="description"/>
		<form:input type="hidden" path="id"/>
		<form:input type="hidden" path="done"/>
		<button type="submit"  class ="btn btn-success">Submit</submit>
			
		</form:form>
		</div>
		
		</body>

			<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>	
			<script src="webjars/jquery/3.7.1/dist/jquery.min.js"></script>



</html>