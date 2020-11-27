/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nuevo;

import java.sql.*;

public class ConexionBD {
 Connection conexion;

	public Connection conexion(){
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conexion = DriverManager.getConnection("jdbc:mysql://localhost/ark_breeding","Venecio","");
		System.out.println("Conectado :D");
		}catch(ClassNotFoundException | SQLException e){
			System.out.println(e.getMessage());	
			}return conexion;
	}
			Statement createStatment(){
			throw new UnsupportedOperationException("No soportado");


                        }
}