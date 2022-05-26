package ar.edu.unlam.tallerweb1.controladores;

import javax.persistence.ManyToOne;

import ar.edu.unlam.tallerweb1.modelo.Refugio;

public class DatosMascota {

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

    public DatosMascota(){}

    public DatosMascota(Long id, String nombre, String especie, Integer edad, String imagen, String descripcion, String direccion, String coordenadas, Boolean rescatado, Refugio refugio) {
        this.id= id;
        this.nombre= nombre;
        this.especie=especie;
        this.edad=edad;
        this.imagen=imagen;
        this.descripcion=descripcion;
        this.direccion=direccion;
        this.coordenadas=coordenadas;
        this.rescatado=rescatado;
        this.refugio=refugio;
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
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
