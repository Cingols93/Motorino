<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="it.consoft.nameless.model.User"%>
<%@ include file="session.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="head.jsp"%>
<title>Profilo</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="container">
		<%
			out.write(request.getAttribute("listMoto").toString());
		%>
	</div>
</body>
</html>