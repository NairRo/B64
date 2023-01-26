<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import= "java.util.*, com.demo.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
</head>
<body>
	<%
		List<Employee> elist = (List<Employee>)request.getAttribute("result");
	%>
	<table border="1" bgcolor="yellow">
		<tr>
			<th>EMP ID</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Salary</th>
		</tr>
		
		<% 
			for (int i=0; i < elist.size(); i++){
				Employee e = elist.get(i);
		%>
		
		<tr>
			<td>&nbsp;<%=e.getId() %>&nbsp;</td>
			<td>&nbsp;<%=e.getName() %>&nbsp;</td>
			<td>&nbsp;<%=e.getDept() %>&nbsp;</td>
			<td>&nbsp;<%=e.getSalary() %>&nbsp;</td>
		</tr>
		<% 
			}
		%>
	</table>
	
	<form action="Delete.jsp" method="post">
		<input type="submit" value="Delete"  />
	</form>
	<form action="Update.jsp" method="post">
		<input type="submit" value="Update"  />
	</form>
	<form action="Register.jsp" method="post">
		<input type="submit" value="Register"  />
	</form>
</body>
</html>