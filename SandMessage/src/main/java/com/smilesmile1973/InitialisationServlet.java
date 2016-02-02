package com.smilesmile1973;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;

public class InitialisationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -474061540421770026L;

	@Override
	public void init() throws ServletException {
		try{
			System.out.println("Initialisation");
			InitialContext initCxt = new InitialContext();
			Context cxt = (Context) initCxt.lookup("java:comp/env");
			DataSource ds = (DataSource) cxt.lookup("jdbc/MyDB");
			Connection con = ds.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sandmessage.person");
			while (rs.next()){
				System.out.println(rs.getString(1));
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
