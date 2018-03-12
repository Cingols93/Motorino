<%
	if (session.getAttribute("user") == null) {
		session.invalidate();
		response.sendRedirect("login");
	}
%>