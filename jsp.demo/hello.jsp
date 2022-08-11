<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CALCULATE</title>
</head>
<body>

<%
int s1=Integer.parseInt(request.getParameter("a"));
int s2=Integer.parseInt(request.getParameter("b"));
int s3=Integer.parseInt(request.getParameter("c"));
int s4=Integer.parseInt(request.getParameter("d"));
out.print("sum is:"+(s1+s2+s3+s4)+"<br>");


%>




</body>
</html>