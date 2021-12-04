package com.ejemplo.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 5492662782607712446L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable=false)
	private String nombre;
	
	@Column(length = 50, nullable=false)
	private String apellido;
	
	@Column(length = 50,  unique = true, nullable = false)
	private String email;
	
	/*
	 * @Column(nullable=false, unique=true) private Long numeroDocumento;
	 */
	
	/*
	 * @Column(length = 2, nullable=false) private String tipoDocumento;
	 */
	/*
	 * @Column(length = 255) private String presentacion;
	 */
	
	private Boolean esAdmin;
	
	private String fechaRegistro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/*
	public Long getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getPresentacion() { return presentacion; } 
	public void setPresentacion(String presentacion) { this.presentacion = presentacion; }
	*/
	public Boolean getEsAdmin() {
		return esAdmin;
	}
	public void setEsAdmin(Boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String mail) {
		this.email = mail;
	}
	
}
