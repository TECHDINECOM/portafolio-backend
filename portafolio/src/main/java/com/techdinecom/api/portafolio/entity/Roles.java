package com.techdinecom.api.portafolio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.validation.constraints.*;

@Entity
@Table(name = "tbl_roles")
public class Roles implements Serializable{
	
	private static final long serialVersionUID = 1417044352291743272L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	@Column(nullable = false)
	@NotBlank(message="- El campo no puede estar vacio.")
	private String rol;
	
	@Column(nullable = false)
	@NotBlank(message="- El campo no puede estar vacio.")
	private String txtvisible;
	
	@Column(nullable = false)
	@NotBlank(message="- El campo no puede estar vacio.")
	private String descripcion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public String getTxtvisible() {
		return txtvisible;
	}

	public void setTxtvisible(String txtvisible) {
		this.txtvisible = txtvisible;
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", rol=" + rol + ", txtvisible=" + txtvisible + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((rol == null) ? 0 : rol.hashCode());
		result = prime * result + ((txtvisible == null) ? 0 : txtvisible.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Roles other = (Roles) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		if (txtvisible == null) {
			if (other.txtvisible != null)
				return false;
		} else if (!txtvisible.equals(other.txtvisible))
			return false;
		return true;
	}
	



		
	
	
}