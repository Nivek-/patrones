package com.sidlors.abstracfactory;

public class SqlServerConexion extends Conexion{
		//constructor vacio
		public SqlServerConexion(){
		
		}
		
		@Override
		public String descripcion(){
			return "Conexion de SqlServerConexion";
		}

}