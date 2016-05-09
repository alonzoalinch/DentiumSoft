package com.dentium.datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dentium.entidades.OdontologoEL;

public class OdontologoDAO {
		
			//Singleton
			public static OdontologoDAO _Instancia;
			private OdontologoDAO(){};
			public static OdontologoDAO Instancia(){
				if(_Instancia==null){
					_Instancia = new OdontologoDAO();
				}
				return _Instancia;
			}
			//endSingleton
			
			public ArrayList<OdontologoEL> ListarOdontologo() throws Exception{		
				Connection conexion = Conexion.Instancia().Conectar();
				ArrayList<OdontologoEL> lista = new ArrayList<OdontologoEL>();
				try {
					CallableStatement cst = conexion.prepareCall("{call sp_listarOdontologo()}");
					ResultSet rs = cst.executeQuery();
					while(rs.next()){
						OdontologoEL odontologo = new OdontologoEL();
						odontologo.setId(rs.getInt("id"));
						odontologo.setNombre(rs.getString("nombre"));
						odontologo.setApellidoPaterno(rs.getString("apellido_paterno"));
						odontologo.setApellidoMaterno(rs.getString("apellido_materno"));
						odontologo.setDni(rs.getString("dni"));
						odontologo.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
						odontologo.setTelefono(rs.getString("telefono"));
						odontologo.setDireccion(rs.getString("direccion"));
						odontologo.setNumeroRegistro(rs.getString("nro_registro"));
						lista.add(odontologo);
					}
				} catch (Exception e) {
					throw e;
				}finally{conexion.close();}
				return lista;
			}
		
			public boolean InsertarOdontologo(OdontologoEL odontologo, String Usuario) throws Exception{		
				Connection conexion = Conexion.Instancia().Conectar();
				Boolean inserto = false;
				try {
					CallableStatement cst = conexion.prepareCall("{call sp_insertarOdontologo(?,?,?,?,?,?,?,?,?)}");
					cst.setString(1, odontologo.getNombre());
					cst.setString(2, odontologo.getApellidoPaterno());
					cst.setString(3, odontologo.getApellidoMaterno());
					cst.setString(4, odontologo.getDni());
					cst.setDate(5, odontologo.getFechaNacimiento());
					cst.setString(6, odontologo.getTelefono());
					cst.setString(7, odontologo.getDireccion());
					cst.setString(8, odontologo.getNumeroRegistro());
					cst.setString(9, Usuario);
					int i = cst.executeUpdate();
					if(i>0){ inserto = true; }
				} catch (Exception e) {
					throw e;
				}finally{conexion.close();}
				return inserto;
			}
	
			public OdontologoEL DevolverOdontologo(int id) throws Exception{
				Connection conexion = Conexion.Instancia().Conectar();
				OdontologoEL odontologo = null;
				try {
					CallableStatement cst = conexion.prepareCall("{call sp_devolverOdontologo(?)}");
					cst.setInt(1, id);
					ResultSet rs = cst.executeQuery();
					if(rs.next()){
						odontologo = new OdontologoEL();
						odontologo.setId(rs.getInt("id"));
						odontologo.setNombre(rs.getString("nombre"));
						odontologo.setApellidoPaterno(rs.getString("apellido_Paterno"));
						odontologo.setApellidoMaterno(rs.getString("apellido_Materno"));
						odontologo.setDni(rs.getString("dni"));
						odontologo.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
						odontologo.setTelefono(rs.getString("telefono"));
						odontologo.setDireccion(rs.getString("direccion"));
						odontologo.setNumeroRegistro(rs.getString("nro_registro"));
						}
				} catch (Exception e) {
					throw e;
				}finally{conexion.close();}
				return odontologo;
			}

			public boolean EditarOdontologo(OdontologoEL odontologo, String Usuario) throws Exception{		
				Connection conexion = Conexion.Instancia().Conectar();
				Boolean edito = false;
				try {
					CallableStatement cst = conexion.prepareCall("{call sp_editarOdontologo(?,?,?,?,?,?,?,?,?,?)}");
					cst.setInt(1, odontologo.getId());
					cst.setString(2, odontologo.getNombre());
					cst.setString(3, odontologo.getApellidoPaterno());
					cst.setString(4, odontologo.getApellidoMaterno());
					cst.setString(5, odontologo.getDni());
					cst.setDate(6, odontologo.getFechaNacimiento());
					cst.setString(7, odontologo.getTelefono());
					cst.setString(8, odontologo.getDireccion());
					cst.setString(9, odontologo.getNumeroRegistro());
					cst.setString(10, Usuario);
					int i = cst.executeUpdate();
					if(i>0){ edito = true; }
				} catch (Exception e) {
					throw e;
				}finally{conexion.close();}
				return edito;
			}

			public boolean EliminarOdontologo(OdontologoEL odontologo) throws Exception{
				Connection conexion = Conexion.Instancia().Conectar();
				Boolean inserto = false;
				try{
					CallableStatement cst = conexion.prepareCall("{call sp_eliminarOdontologo(?)}");
					cst.setInt(1, odontologo.getId());
					int i = cst.executeUpdate();
					if(i>0){
						inserto = true;}
					}catch(Exception e){
						throw e;
					}finally{conexion.close();}
				return inserto;
			}	

}


