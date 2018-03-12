package it.consoft.nameless.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.consoft.nameless.entity.UserManager;
import it.consoft.nameless.model.User;

@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(RegisterServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			request.getRequestDispatcher("registrati.jsp").forward(request, response);
		} else {
			logger.info(user + " from session");
			request.getRequestDispatcher("user.jsp").forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String nickname = request.getParameter("nickname");
		String eta = request.getParameter("eta");
		String indirizzo = request.getParameter("indirizzo");

		User user = new User();

		user.setEmail(email);
		user.setPassword(password);
		user.setNickname(nickname);
		user.setNome(nome);
		user.setCognome(cognome);
		user.setEta(Integer.parseInt(eta));
		user.setIndirizzo(indirizzo);

		user.setCredito(1000F);

		UserManager.saveUser(user);

		response.sendRedirect("login");
	}

}