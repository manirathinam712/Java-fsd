<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FeedBack form</title>
</head>
<body>
${requestScope.msg}
<h2>FeedBack</h2>
<form action="SendFeedback" method="post">
<label>EmailID</label>
<input type="text" name="Email"/><br/>
<label>Customer Name</label>
<input type="text" name="Cname"/><br/>
<label>CustomerFeedBacks</label>
<input type="text" name="FeedBacks"/><br/>
<label>Customer Rating</label>
<h5>Rating must be out of 10 </h5>
<input type="text" name="Rating"/><br/>
<input type="submit" value="Send Feedback"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>

</body>
</html>

