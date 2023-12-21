<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details Portal</title>
</head>
<body>
    <h1>Product Details Portal</h1>
    <form action="productDetails.jsp" method="GET">
        <label for="productId">Enter Product ID: </label>
        <input type="text" id="productId" name="productId" required>
        <input type="submit" value="Get Details">
    </form>
</body>
</html>
