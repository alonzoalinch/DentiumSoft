package com.dentium.datos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	//Singleton
		public static Conexion _Instancia;
		private Conexion(){};
		public static Conexion Instancia(){
			if(_Instancia==null){
				_Instancia = new Conexion();
			}
			return _Instancia;
		}
		//endSingleton	
		
		public Connection Conectar() throws Exception{
			Connection conexion = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conexion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+
							"databaseName=DentiumDB", "sa", "123456");
			} catch (Exception e) {
				throw e;
			}
			return conexion;
		}
}
