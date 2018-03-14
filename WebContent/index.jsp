<%
	if (session.getAttribute("user") == null) {
		session.invalidate();
		response.sendRedirect("login");
	} else response.sendRedirect("user");
%>