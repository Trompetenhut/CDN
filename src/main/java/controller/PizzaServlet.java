package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.Pizzas;

@WebServlet("/pizzas")
public class PizzaServlet extends HttpServlet {

	private static final long serialVersionUID = 5777403715790463145L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("pizzas", new Pizzas().asList());
		getServletContext().getRequestDispatcher("/pizzasPage.jsp").forward(req, resp);
	}
	
}
