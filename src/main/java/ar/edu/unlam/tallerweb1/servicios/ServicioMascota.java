package ar.edu.unlam.tallerweb1.servicios;

import java.io.IOException;
import java.util.List;

import ar.edu.unlam.tallerweb1.controladores.DatosMascota;
import ar.edu.unlam.tallerweb1.modelo.Mascota;
import com.google.maps.errors.ApiException;

public interface ServicioMascota {

    Mascota agregarMascota(DatosMascota datosMascota) throws InterruptedException, ApiException, IOException;
    Mascota agregarMascotaARefugio(DatosMascota datosMascota);
    List<Mascota> listarTodos();
    List<Mascota> buscarMascota(String nombre);
}
