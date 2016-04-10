package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.CartItems;
import repository.Pizzas;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

	private static final long serialVersionUID = 390819157893539334L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("cartItems", new CartItems((Integer) req.getSession().getAttribute("userId")).asList());
		getServletContext().getRequestDispatcher("/cartPage.jsp").forward(req, resp);
	}
	
}
