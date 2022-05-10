package ar.edu.unlam.tallerweb1.controladores;

public class DatosMascota {

    //nombre especie edad imagen descripcion direccion

    //private String nombre;
    private String especie;
    //private Integer edad;
    //private String imagen;
    //private String descripcion;
    private String direccion;

   /* public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

   /* public Integer getEdad() {
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
    }*/

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public DatosMascota(){}

   /* public DatosMascota(String nombre, String especie, Integer edad, String direccion, String descripcion, String imagen){
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad=edad;
        this.especie=especie;
        this.imagen=imagen;
    }*/

    public DatosMascota(String especie, String direccion){
        this.especie = especie;
        this.direccion = direccion;
    }
}
