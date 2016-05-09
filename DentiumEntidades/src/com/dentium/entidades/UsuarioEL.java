package com.dentium.entidades;

import java.sql.Date;

public class UsuarioEL {

	private Integer id;
	private String username;
	private String password;
	private Boolean estado;
	private Date fechaRegistro;
	private Date fechaModificacion;
	private UsuarioEL usuarioRegistro;
	private UsuarioEL usuarioModificacion;
	private Date fecha_fin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
}
