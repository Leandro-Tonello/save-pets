package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.controladores.DatosMascota;
import ar.edu.unlam.tallerweb1.modelo.Mascota;

public interface ServicioMascota {

    Mascota agregarMascota(DatosMascota datosMascota);
    Mascota buscarMascota(Long id);
    List<Mascota> listarTodos();

}
