package com.utn.model;

import com.utn.controller.PersonaDAOBJDBCImpl;

public class PersonaDAOFactory {
	
	public PersonaDAO createPersonaDAO() {
		return new PersonaDAOBJDBCImpl();
	}
}
