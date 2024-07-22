
<%@ include file="common/header.jspf" %>

	<%@ include file="common/navigation.jspf" %>
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
		
		
		<%@ include file="common/footer.jspf" %>
	<script type="text/javascript">
$('#target').datepicker({
    format: 'yyyy-mm-dd',
});
</script>
	