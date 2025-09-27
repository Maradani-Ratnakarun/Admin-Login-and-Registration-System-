<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "Example.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
LoginBean a = (LoginBean)session.getAttribute("abean");
//String x = (String)request.getAttribute("msg");
out.println("Login Sucesss :"+a.getName()+"<br>");

%>
<a href = "add.html">AddBook</a><br>
<a href = "delete">DeleteBook</a><br>
<a href = "update">UpdateBook</a><br>
<a href = "view">ViewBookDeatils</a><br>
</body>
</html>