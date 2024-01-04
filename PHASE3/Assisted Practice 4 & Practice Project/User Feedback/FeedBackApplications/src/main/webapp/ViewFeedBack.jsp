<%@page import="java.util.Iterator"%>
<%@page import="com.FeedBack.entity.Feedback"%>
<%@page import="java.util.List"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>All FeedBack Details!</h3>
<table border="1">
	<tr>
		<th>EmailID</th>
		<th>CustomerName</th>
		<th>CustomerFeedBack</th>
		<th>Rating</th>
	</tr>
	<%
		Object obj = request.getAttribute("feedbacks");
		List<Feedback> listOfProject = (List<Feedback>)obj;
		Iterator<Feedback> li =listOfProject.iterator();
		while(li.hasNext()){
			Feedback p  = (Feedback)li.next();
			%>
			<tr>
				<td><%=p.getEmail()%></td>
				<td><%=p.getCname()%></td>
				<td><%=p.getFeedBacks()%></td>
				<td><%=p.getRating()%></td>
			</tr>
			<%
		}
	%>
</table>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>