package com.transportapp.transportapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_id;
	private String emp_tipo_documento;
	private Integer emp_num_documento;
	private String emp_nombre;
	private String emp_direccion;
	private String emp_ciudad;
	private String emp_departamento;
	private String emp_pais;
	private Integer emp_telefono;
	
	@ManyToOne
	@JoinColumn(name = "emp_rel_id", referencedColumnName = "rel_id")
	private RepresentanteLegal emp_rel_id;
	
	public Empresa() {
		
	}
	public Empresa(Long emp_id, String emp_tipo_documento, Integer emp_num_documento, String emp_nombre, String emp_direccion,
			String emp_ciudad, String emp_departamento, String emp_pais, Integer emp_telefono, RepresentanteLegal emp_rel_id) {
		super();
		this.emp_id = emp_id;
		this.emp_tipo_documento = emp_tipo_documento;
		this.emp_num_documento = emp_num_documento;
		this.emp_nombre = emp_nombre;
		this.emp_direccion = emp_direccion;
		this.emp_ciudad = emp_ciudad;
		this.emp_departamento = emp_departamento;
		this.emp_pais = emp_pais;
		this.emp_telefono = emp_telefono;
		this.emp_rel_id = emp_rel_id;
	}
	
	@Column(name = "emp_id", nullable = false)
	public Long getId() {
		return emp_id;
	}
	public void setId(Long emp_id) {
		this.emp_id = emp_id;
	}
	
	@Column(name = "emp_tipo_documento", nullable = false)
	public String getTipoDocumento() {
		return emp_tipo_documento;
	}
	public void setTipoDocumento(String emp_tipo_documento) {
		this.emp_tipo_documento = emp_tipo_documento;
	}
	
	@Column(name = "emp_num_documento", nullable = false)
	public Integer getNumDocumento() {
		return emp_num_documento;
	}
	public void setNumDocumento(Integer emp_num_documento) {
		this.emp_num_documento = emp_num_documento;
	}
	
	@Column(name = "emp_emp_nombre", nullable = false)
	public String getNombre() {
		return emp_nombre;
	}
	public void setNombre(String emp_nombre) {
		this.emp_nombre = emp_nombre;
	}
	
	@Column(name = "emp_emp_direccion", nullable = false)
	public String getDireccion() {
		return emp_direccion;
	}
	public void setDireccion(String emp_direccion) {
		this.emp_direccion = emp_direccion;
	}
	
	@Column(name = "emp_ciudad", nullable = false)
	public String getCiudad() {
		return emp_ciudad;
	}
	public void setCiudad(String emp_ciudad) {
		this.emp_ciudad = emp_ciudad;
	}
	
	@Column(name = "emp_departamento", nullable = false)
	public String getDepartamento() {
		return emp_departamento;
	}
	public void setDepartamento(String emp_departamento) {
		this.emp_departamento = emp_departamento;
	}
	
	@Column(name = "emp_pais", nullable = false)
	public String getPais() {
		return emp_pais;
	}
	public void setPais(String emp_pais) {
		this.emp_pais = emp_pais;
	}
	
	@Column(name = "emp_telefono", nullable = false)
	public Integer getTelefono() {
		return emp_telefono;
	}
	public void setTelefono(Integer emp_telefono) {
		this.emp_telefono = emp_telefono;
	}
	
	@Column(name = "emp_rel_id", nullable = false)
	public RepresentanteLegal getRepresentanteLegal() {
		return emp_rel_id;
	}
	public void setRepresentanteLegal(RepresentanteLegal emp_rel_id) {
		this.emp_rel_id = emp_rel_id;
	}
	
	

}
