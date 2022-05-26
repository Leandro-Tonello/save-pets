package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;
import ar.edu.unlam.tallerweb1.modelo.Mascota;

public interface RepositorioMascota {
    void guardar(Mascota mascota);
    List<Mascota> buscar(String nombre);
    List<Mascota> buscarTodos();
}
