package com.transportapp.transportapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "representante_legal")
public class RepresentanteLegal {

	@Id
	private Long rel_id;
	private String rel_tipo_documento;
	private String rel_num_documento;
	private String rel_nombre;
	private String rel_direccion;
	private String rel_ciudad;
	private String rel_departamento;
	private String rel_pais;
	private Integer rel_telefono;
	
	public RepresentanteLegal() {
		
	}
	
	
	@Column(name = "rel_id", nullable = false)
	public Long getId() {
		return rel_id;
	}
	public void setId(Long rel_id) {
		this.rel_id = rel_id;
	}
	
	@Column(name = "rel_tipo_documento", nullable = false)
	public String getTipoDocumento() {
		return rel_tipo_documento;
	}
	public void setTipoDocumento(String rel_tipo_documento) {
		this.rel_tipo_documento = rel_tipo_documento;
	}
	
	@Column(name = "rel_num_documento", nullable = false)
	public String getNumDocumento() {
		return rel_num_documento;
	}
	public void setNumDocumento(String rel_num_documento) {
		this.rel_num_documento = rel_num_documento;
	}
	
	@Column(name = "rel_rel_nombre", nullable = false)
	public String getNombre() {
		return rel_nombre;
	}
	public void setNombre(String rel_nombre) {
		this.rel_nombre = rel_nombre;
	}
	
	@Column(name = "rel_rel_direccion", nullable = false)
	public String getDireccion() {
		return rel_direccion;
	}
	public void setDireccion(String rel_direccion) {
		this.rel_direccion = rel_direccion;
	}
	
	@Column(name = "rel_ciudad", nullable = false)
	public String getCiudad() {
		return rel_ciudad;
	}
	public void setCiudad(String rel_ciudad) {
		this.rel_ciudad = rel_ciudad;
	}
	
	@Column(name = "rel_departamento", nullable = false)
	public String getDepartamento() {
		return rel_departamento;
	}
	public void setDepartamento(String rel_departamento) {
		this.rel_departamento = rel_departamento;
	}
	
	@Column(name = "rel_pais", nullable = false)
	public String getPais() {
		return rel_pais;
	}
	public void setPais(String rel_pais) {
		this.rel_pais = rel_pais;
	}
	
	@Column(name = "rel_telefono", nullable = false)
	public Integer getTelefono() {
		return rel_telefono;
	}
	public void setTelefono(Integer rel_telefono) {
		this.rel_telefono = rel_telefono;
	}
}
