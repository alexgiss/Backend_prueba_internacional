package in.bushansirgur.springboot.crudapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Employee {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_persona;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String edad;
	@Column
	private Integer numero_cuenta;
	@Column
	private Date fecha_creacion_cuenta;
	@Column
	private Integer id_tipo_persona;

	public Integer getId_tipo_persona() {
		return id_tipo_persona;
	}

	public void setId_tipo_persona(Integer id_tipo_persona) {
		this.id_tipo_persona = id_tipo_persona;
	}

	public Date getFecha_creacion_cuenta() {
		return fecha_creacion_cuenta;
	}

	public void setFecha_creacion_cuenta(Date fecha_creacion_cuenta) {
		this.fecha_creacion_cuenta = fecha_creacion_cuenta;
	}

	public Integer getIdPersona() {
		return id_persona;
	}

	public void setIdPersona(Integer id) {
		this.id_persona = id_persona;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Integer getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(Integer numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id_persona=" + id_persona +
				", nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", edad='" + edad + '\'' +
				", numero_cuenta=" + numero_cuenta +
				", fecha_creacion_cuenta=" + fecha_creacion_cuenta +
				", id_tipo_persona=" + id_tipo_persona +
				'}';
	}


}
