package ar.edu.unlam.tallerweb1.modelo;

import ar.edu.unlam.tallerweb1.controladores.DatosMascota;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String especie;
	private Integer edad;
	private String imagen;
	private String descripcion;
	private String direccion;
	private String coordenadas;
	private Boolean rescatado;
	@ManyToOne
	private Refugio refugio;
	
	public Mascota() {}

	public Mascota(DatosMascota datosMascota){
		this.id=datosMascota.getId();
		this.nombre=datosMascota.getNombre();
		this.especie=datosMascota.getEspecie();
		this.edad=datosMascota.getEdad();
		this.imagen=datosMascota.getImagen();
		this.descripcion=datosMascota.getDescripcion();
		this.direccion=datosMascota.getDireccion();
		this.coordenadas=datosMascota.getCoordenadas();
		this.rescatado=datosMascota.getRescatado();
		this.refugio=datosMascota.getRefugio();
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public Boolean getRescatado() {
		return rescatado;
	}

	public void setRescatado(Boolean rescatado) {
		this.rescatado = rescatado;
	}

	public Refugio getRefugio() {
		return refugio;
	}

	public void setRefugio(Refugio refugio) {
		this.refugio = refugio;
	}
}
