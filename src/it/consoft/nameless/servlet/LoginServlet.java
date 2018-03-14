package it.consoft.nameless.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.consoft.nameless.entity.ComponenteManager;
import it.consoft.nameless.entity.MotoManager;
import it.consoft.nameless.entity.UserManager;
import it.consoft.nameless.model.User;

@WebServlet(value="/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(LoginServlet.class.getName());

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LOGIN");
		User user = (User) request.getSession().getAttribute("user");
		MotoManager.filler();
		ComponenteManager.filler();
		if (user != null)
			logger.info(user + " from session");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = UserManager.getUserByUsernameAndPassword(email, password);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("user");
		} else {
			response.sendRedirect("register");
		}
	}
}
