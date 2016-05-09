package com.dentium.entidades;

import java.sql.Date;

public class OdontologoEL {
	
	private Integer id;
	private UsuarioEL usuario;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String dni;
	private Date fechaNacimiento;
	private String telefono;
	private String direccion;
	private String numeroRegistro;
	private Boolean estado;
	private Date fechaRegistro;
	private Date fechaModificacion;
	private UsuarioEL usuarioRegistro;
	private UsuarioEL usuarioModificacion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UsuarioEL getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEL usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public UsuarioEL getUsuarioRegistro() {
		return usuarioRegistro;
	}
	public void setUsuarioRegistro(UsuarioEL usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}
	public UsuarioEL getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(UsuarioEL usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	

}
