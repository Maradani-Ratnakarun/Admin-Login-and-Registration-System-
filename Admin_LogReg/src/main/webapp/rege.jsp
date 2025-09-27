<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "Example.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean b = (AdminBean)session.getAttribute("sf");
out.println("Registration Success..."+b.getName()); 
%>
</body>
</html>