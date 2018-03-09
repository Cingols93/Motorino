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

@WebServlet("/registrati")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(RegisterServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = (User) req.getSession().getAttribute("user");
		if (user != null)
			logger.info(user + " from session");
		req.getRequestDispatcher("register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String nickname = request.getParameter("nickname");
		String eta = request.getParameter("eta");
		String indirizzo = request.getParameter("indirizzo");
		// String foto = request.getParameter("foto");
		// String dataIscrizione = request.getParameter("dataIscrizione");
		// String listaMoto = request.getParameter("listaMoto");
		// String credito = request.getParameter("credito"); 
		
		// try {

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUsername(nickname);
		user.setPassword(eta);
		
		// user.setUsername(foto);
		// user.setPassword(dataIscrizione);
		// user.setUsername(listaMoto);
		user.setCredito(1000F);
		
		UserManager.saveUser(user);
		
		response.sendRedirect("login");
		// } catch (Exception e) {
		// logger.warning(e.getMessage());
		// }

	}

}