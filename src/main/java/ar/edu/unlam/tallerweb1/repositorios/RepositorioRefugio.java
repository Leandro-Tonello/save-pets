package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Refugio;

public interface RepositorioRefugio {
	void guardar(Refugio refugio);
	Refugio buscar(Long id);
	List<Refugio> buscarTodos();
}
