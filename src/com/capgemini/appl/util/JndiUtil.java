package com.capgemini.appl.util;


import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.naming.Context;

import com.capgemini.appl.exception.UniversityAdmissionException;

public class JndiUtil {
	private DataSource dataSource;

	public JndiUtil() throws UniversityAdmissionException {
		try {
			Context ctx = new InitialContext();// get referance to remote jndi
		//	ctx=new InitialContext(null);
			dataSource = (DataSource) ctx.lookup("java:/OracleDS");
		} catch (NamingException e) {
			e.printStackTrace();
		//	throw new UserException("PROBLEM IN CONNECTION(FAILED IN JNDI)",e);
		}
	}

	public Connection getConnection() throws SQLException{

		return dataSource.getConnection();

	}

}
