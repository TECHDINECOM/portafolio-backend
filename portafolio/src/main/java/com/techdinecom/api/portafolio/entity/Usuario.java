package com.techdinecom.api.portafolio.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import javax.validation.constraints.*;


@Entity
@Table(name = "tbl_usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -8181570322659197586L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column(unique = true, nullable = false)
	@NotNull(message="- El campo no puede estar vacio.")
	@Digits(integer=9,message = "- El campo solo debe contener: mínimo 7 y máximo 9 caracteres de longitud y solo caracteres numericos.", fraction = 0)
	private Long dni;

	@Column(nullable = false)
	@NotBlank(message="- El campo no puede estar vacio.")
	@Size(min=3,max=80,message="- El campo NOMBRES debe tener entre 3 y 80 caracteres alfabeticos.")
	private String nombres;

	@Column(nullable = false)
	@NotBlank(message="- El campo no puede estar vacio.")
	@Size(min=3,max=80,message="- El campo APELLIDOS debe tener entre 3 y 80 caracteres alfabeticos.")
	private String apellidos;

	@Column(unique = true, nullable = false)
	@NotBlank(message="- El campo no puede estar vacio.")
	@Size(min=9,max=150,message="- El campo EMAIL debe tener entre 9 y 150 caracteres.")
	@Pattern(regexp = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$", message = "- Ingrese una dirección de Email válida.")
	private String email;

	@Column(nullable = false)
	@NotBlank(message="- El campo no puede estar vacio.")
	@Size(min=10,max=11,message="- El campo TELEFONO debe tener entre 10 y 11 caracteres.")
	private String telefono;

	@Column(nullable = true)
	@Size(min=0,max=160,message="- El campo INFORMACIÓN DE PERFIL es OPCIONAL y soporta un máximo de 160 caracteres.")
	private String sobremi;
	
	@Column(unique = true, nullable = false)
	@NotBlank(message="- El campo no puede estar vacio.")
	@Pattern(regexp = "^[A-Za-z0-9-_.]{6,16}$", message = "- El campo debe tener caracteres Alfabeticos, Números y al menos un caracter de los siguientes:  - _ .")
	@Size(min=6,max=16,message="- El campo USUARIO debe tener entre 6 y 16 caracteres.")
	private String username;

	@Column(nullable = false, columnDefinition="varchar(250)")
	@NotBlank(message="- El campo no puede estar vacio.")
	@Pattern(regexp = "^(?=.*\\d)(?=.*[@#\\-_$%&+=!\\?*])(?=.*[A-Z])(?=.*[a-z])\\S{8,}$", message = "- El campo Debe tener entre 8 y 25 caracteres y solo se aceptan caracteres Alfabeticos, números o los caracteres:  @ # - _ $ % & + = ! ? *")
	private String password;
	
	@Transient
	private String confirmarPassword;

	@Column(nullable = false, columnDefinition="tinyint(1) default 1")
	private Integer estatus;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tbl_roles_usuario", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private Set<Roles> rol;

	
	/**
	 * CONSTRUCTORES DE ENTIDAD USUARIO 
	 */
	
	public Usuario() {
		super();
	}
	

	public Usuario(Long id) {
		super();
		this.id = id;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSobremi() {
		return sobremi;
	}

	public void setSobremi(String sobremi) {
		this.sobremi = sobremi;
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
	

	public String getConfirmarPassword() {
		return confirmarPassword;
	}


	public void setConfirmarPassword(String confirmarPassword) {
		this.confirmarPassword = confirmarPassword;
	}


	public Integer getEstatus() {
		return estatus;
	}


	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}


	public Set<Roles> getRol() {
		return rol;
	}

	public void setRol(Set<Roles> rol) {
		this.rol = rol;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((confirmarPassword == null) ? 0 : confirmarPassword.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estatus == null) ? 0 : estatus.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((rol == null) ? 0 : rol.hashCode());
		result = prime * result + ((sobremi == null) ? 0 : sobremi.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Usuario other = (Usuario) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (confirmarPassword == null) {
			if (other.confirmarPassword != null)
				return false;
		} else if (!confirmarPassword.equals(other.confirmarPassword))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estatus == null) {
			if (other.estatus != null)
				return false;
		} else if (!estatus.equals(other.estatus))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		if (sobremi == null) {
			if (other.sobremi != null)
				return false;
		} else if (!sobremi.equals(other.sobremi))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", dni=" + dni + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email="
				+ email + ", telefono=" + telefono + ", sobremi=" + sobremi + ", username=" + username + ", password="
				+ password + ", confirmarPassword=" + confirmarPassword + ", estatus=" + estatus + ", rol=" + rol + "]";
	}


	
	
	
	
}