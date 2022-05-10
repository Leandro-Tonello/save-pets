package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.controladores.DatosRefugio;
import ar.edu.unlam.tallerweb1.modelo.Refugio;

public interface ServicioRefugio {

	Refugio agregarRefugio(DatosRefugio datosRefugio);
	Refugio buscarRefugio(Long id);
	List<Refugio> listarTodos();
}
