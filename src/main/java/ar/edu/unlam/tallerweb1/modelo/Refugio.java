package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Refugio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String direccion;
	private Integer numeroTelefono;
	private Integer capMax;
	private Integer capMin;
	private String imagen;
	
	public Refugio() {}
	
	public Refugio(String nombre, String direccion, Integer numeroTelefono, Integer capMax, Integer capMin, String imagen) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.numeroTelefono=numeroTelefono;
		this.capMax=capMax;
		this.capMin=capMin;
		this.imagen=imagen;
	}

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCapMax() {
		return capMax;
	}

	public void setCapMax(Integer capMax) {
		this.capMax = capMax;
	}

	public Integer getCapMin() {
		return capMin;
	}

	public void setCapMin(Integer capMin) {
		this.capMin = capMin;
	}

	public Integer getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(Integer numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
}
