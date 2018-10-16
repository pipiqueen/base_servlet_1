package com.utn.model;

import java.util.ArrayList;

public interface PersonaDAO {

	
	public int crearPersona (Persona persona);
	
	public Persona verPersona (Persona people); 
	
	public ArrayList<Persona> verTodasLasPersonas();
}
