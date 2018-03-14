package it.consoft.nameless.servlet;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.consoft.nameless.entity.MotoManager;
import it.consoft.nameless.model.Moto;
import it.consoft.nameless.model.MotoComposta;
import it.consoft.nameless.model.User;

/**
 * Servlet implementation class MotoServlet
 */
@WebServlet(value = "/shop")
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShopServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String s = generateHTMLShop();
		request.setAttribute("listMoto", s);
		request.getRequestDispatcher("shop.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Moto m = MotoManager.getMotoById(Integer.parseInt(request.getParameter("aggiungiMoto")));
		User u = (User) request.getAttribute("user");
		MotoComposta mc = new MotoComposta();
		mc.setUser(u);
		mc.setMoto(m);
		u.addToCarrello(mc);
		request.setAttribute("user", u);
		response.sendRedirect("ordine");
	}

	private String generateHTMLShop() {
		String s = "";
		Iterator<Moto> iter = MotoManager.getAll().iterator();
		while (iter.hasNext()) {
			Moto m = (Moto) iter.next();
			s += "<div class=\"col-xs-12 col-sm-6 col-lg-3\"><div class=\"panelItem panelItem-primary\">";
			s += "<form method=\"post\" action=\"ordine\"";
			s += "<div class=\"panelItem-heading\">" + m.getMarca() + " " + m.getModello() + "</div>";
			s += "<div class=\"panelItem-body\">";
			s += "<img src=\"https://images.ctfassets.net/0icl5m35md89/4cGjVvpQQokGmGkAuKUUM2/80910703a834a97c79aee5cb601bb577/Panigale-V4-MY18-Red-02-Slider-Gallery-1920x1080.jpg\"\r\n"
					+ "				class=\"img-responsive\" style=\"width: 100%\" alt=\"Image\">";
			s += "</div>";
			s += " <div class=\"panelItem-footerCon\"><div class=\"panelItem-footer\">" + " &euro; " + m.getPrezzo()
					+ "</div><div class=\"panelItem-footerDx\"><button class=\"btn-buy btn-sel-piu\" type=\"button\" value=\""
					+ m.getId()
					+ "\" data-toggle=\"tooltip\" data-original-title=\"Remove this user\" name=\"aggiungiMoto\"><a href=\"#\" class=\"\">Compra</span></a></button></div></div>";
			s += "</form></div></div>";
		}
		return s;
	}

}
