package com.utn.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();

	}
/**
 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("usuario");

		String password = request.getParameter("contrasenia");

		if (user.equals("cualquier")) {

			HttpSession session = request.getSession();

			session.setAttribute("user", user);

			RequestDispatcher rd = request.getRequestDispatcher("Pagina1.jsp");

			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("NewFile.html");

			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
