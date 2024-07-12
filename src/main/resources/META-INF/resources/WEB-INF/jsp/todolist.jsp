<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>
			Welcome page
			</title>
		</head>
		<body>
			
			 <h1> Welcome ${name}</h1> 
			
		<!--	<h2>Your to do are ${todos}</h2> -->
				<table border="2">
					
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
				
				
			
			</body>
	</html>