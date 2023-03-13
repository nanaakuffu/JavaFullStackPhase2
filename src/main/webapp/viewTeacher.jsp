<%@page import="java.util.Iterator"%>
<%@page import="com.entity.Teacher"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View list of teachers</title>
</head>
<body>
<%
Object obj = request.getAttribute("listOfTeachers");
List<Teacher> ll = (List)obj;

Iterator<Teacher> li = ll.iterator();
while(li.hasNext()){
	Teacher t = li.next();
	%>
		<div>
			<span>Teacher Id : <%=t.getId() %> Teacher Name :<%=t.getTeacherName() %></span>
		</div>
	<% 
}
%>
</body>
</html>