package com.utn.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utn.model.Persona;
import com.utn.model.PersonaDAO;
import com.utn.model.PersonaDAOFactory;

/**
 * Servlet implementation class PruebaServlet
 */
@WebServlet("/PruebaServlet")
public class PruebaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
		Persona people = new Persona(); 
		String nombre = request.getParameter("nombre");
		int dni = Integer.parseInt(request.getParameter("dni"));
		String apellido = request.getParameter("apellido");
		people.setDni(dni);
		people.setApellido(apellido);
		people.setNombre(nombre);
		
		PersonaDAO personaDAO = new PersonaDAOFactory().createPersonaDAO();
		personaDAO.crearPersona(people);
		
	
		
		
		ArrayList<Persona> personas2 = personaDAO.verTodasLasPersonas();
		
		
		request.setAttribute("magio", personas2);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
