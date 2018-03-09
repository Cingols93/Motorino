package it.consoft.nameless.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.consoft.nameless.model.User;
import it.consoft.nameless.service.UserService;
import it.consoft.nameless.service.UserServiceImpl;

@WebServlet("/saveUser")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	UserService userService = new UserServiceImpl();

	private static final Logger logger = Logger.getLogger(RegisterServlet.class.getName());

	// @Override
	// public void init() throws ServletException {
	// HibernateDao.getSession();
	// userService = new UserServiceImpl();
	// super.init();
	// }

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
		String nickname = request.getParameter("nickname");
		String eta = request.getParameter("eta");
		String foto = request.getParameter("foto");
		String dataIscrizione = request.getParameter("dataIscrizione");
		String listaMoto = request.getParameter("listaMoto");
		String credito = request.getParameter("credito");

		// try {

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUsername(nickname);
		user.setPassword(eta);
		user.setUsername(foto);
		user.setPassword(dataIscrizione);
		user.setUsername(listaMoto);
		user.setPassword(credito);
		userService.saveUser(user);
		response.sendRedirect("login");
		// } catch (Exception e) {
		// logger.warning(e.getMessage());
		// }

	}

}