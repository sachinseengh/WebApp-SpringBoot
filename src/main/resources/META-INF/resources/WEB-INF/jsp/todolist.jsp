<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
			<div class="container my-3">
			 <h1> Welcome ${name}</h1> 
			
		<!--	<h2>Your to do are ${todos}</h2> -->
				<table class="table my-1">
					
					<thead>
						<tr>
						
						<th>Description</th>
						<th>Target Date</th>
						<th>IsDone</th>
						
						</tr>
						</thead>
					
						
						<tbody >
							<c:forEach items="${todos}" var ="todo">
								<tr>
							
							<td>${todo.description}</td>
							<td>${todo.target}</td>
							<td>${todo.done}</td>
							<td><a href="edit-todo?id=${todo.id}" class="btn btn-primary">Edit</a>
							<a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
								
							</c:forEach>
							</tr>
							</tbody>
					</table>
					<a href="add-todo" class="btn btn-success my-2" >Add ToDo</a>
				</div>
				<%@ include file="common/footer.jspf" %>