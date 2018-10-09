package com.utn.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.utn.model.Persona;
import com.utn.model.PersonaDAO;

public class PersonaDAOBJDBCImpl implements PersonaDAO {

	private Connection con = null; 
	private PreparedStatement stmt2 = null;
	private PreparedStatement stmt = null; 
	private ResultSet rs = null;
	
	
	@Override
	public int crearPersona(Persona people) {
		
			
		
		
		con = null; 
		stmt2 = null;
		stmt = null;
		rs = null;
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
	public int verPersona() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public int borrarPersona() {
		// TODO Auto-generated method stub
		return 0;
	} 
	
}
