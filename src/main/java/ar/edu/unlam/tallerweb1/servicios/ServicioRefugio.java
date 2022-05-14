package ar.edu.unlam.tallerweb1.servicios;

import java.io.IOException;
import java.util.List;

import ar.edu.unlam.tallerweb1.controladores.DatosRefugio;
import ar.edu.unlam.tallerweb1.modelo.Refugio;
import com.google.maps.errors.ApiException;

public interface ServicioRefugio {

	Refugio agregarRefugio(DatosRefugio datosRefugio) throws InterruptedException, ApiException, IOException;
	Refugio buscarRefugio(Long id);
	List<Refugio> listarTodos();
}
