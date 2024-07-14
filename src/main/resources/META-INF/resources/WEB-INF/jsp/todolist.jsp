<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	
	<link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
		<title>
			Welcome page
			</title>
		</head>
		<body>
			<div class="container my-3">
			 <h1> Welcome ${name}</h1> 
			
		<!--	<h2>Your to do are ${todos}</h2> -->
				<table class="table my-1">
					
					<thead>
						<tr>
						<th>Id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>IsDone</th>
						
						</tr>
						</thead>
					
						
						<tbody >
							<c:forEach items="${todos}" var ="todo">
								<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.target}</td>
							<td>${todo.done}</td>
								
							</c:forEach>
							</tr>
							</tbody>
					</table>
					<a href="add-todo" class="btn btn-success my-2" >Add ToDo</a>
				</div>
			<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>	
			<script src="webjars/jquery/3.7.1/dist/jquery.min.js"></script>
			</body>
	</html>