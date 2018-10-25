package com.utn.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.utn.model.Persona;
import com.utn.model.PersonaDAO;

public class PersonaDAOBJDBCImpl implements PersonaDAO {

	private Connection con = null; 
	private PreparedStatement stmt2 = null;
	private PreparedStatement stmt = null; 
	private ResultSet rs = null;
	
	
	@Override
	public int crearPersona(Persona people) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/magio?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			con = DriverManager.getConnection(url, "root", "asd123");
			//stmt2 = con.prepareStatement("SELECT * FROM persona WHERE Nombre = ?");
		//stmt2.setString(1, people.getNombre());
		//rs = stmt2.executeQuery();
		//if (rs.next()) {
			//return -1;
		//}else {
			stmt = con.prepareStatement(
					"INSERT INTO persona (Nombre, DNI, Apellido) VALUES (?, ?, ?)");
			stmt.setString(1, people.getNombre());
			stmt.setInt(2, people.getDni());
			stmt.setString(3, people.getApellido());
			
			return stmt.executeUpdate();
					
		//}
		
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		
		} finally {
 			try {
 				stmt.close();
 				con.close();
 			} catch (SQLException e) {
 				e.printStackTrace();
 			}
 		}
		return -2;
		
		}
 	
		
	
	
	@Override
	public Persona verPersona(Persona people) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/magio?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			con = DriverManager.getConnection(url, "root", "asd123");
			stmt2 = con.prepareStatement("SELECT * FROM persona WHERE DNI = ?");
		stmt2.setLong(1, people.getDni());
		rs = stmt2.executeQuery();
		
		if(rs.next()) {
			people.setApellido(rs.getString("Apellido"));
			people.setDni(rs.getInt("DNI"));
			people.setNombre(rs.getString("Nombre"));
			
			return people;
		}else {
			
			return null;
		}
		
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		
		} finally {
 			try {
 				stmt.close();
 				con.close();
 			} catch (SQLException e) {
 				e.printStackTrace();
 			}
 		}
		
		return people;
	}
	
	@Override
	public ArrayList<Persona> verTodasLasPersonas() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/magio?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			con = DriverManager.getConnection(url, "root", "asd123");
			stmt2 = con.prepareStatement("SELECT * FROM persona");
			rs = stmt2.executeQuery();
			ArrayList <Persona> personas = new ArrayList <Persona>();
			while(rs.next()) {
				Persona people = new Persona();
				people.setApellido(rs.getString("Apellido"));
				people.setNombre(rs.getString("Nombre"));
				people.setDni(rs.getInt("DNI"));
				personas.add(people);
							
			}
			return personas;
		
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		
		} finally {
 			try {
 				stmt.close();
 				con.close();
 			} catch (SQLException e) {
 				e.printStackTrace();
 			}
 		}
		return null;
		
		
	}
	} 
	

