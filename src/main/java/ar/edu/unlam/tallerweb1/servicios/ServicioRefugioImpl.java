package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Refugio;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioRefugio;

@Service("servicioRefugio")
@Transactional
public class ServicioRefugioImpl implements ServicioRefugio {

	private RepositorioRefugio repositorioRefugio;
	private ServicioRefugioImpl servicioRefugio;
	
	@Autowired
	public ServicioRefugioImpl(RepositorioRefugio servicioRefugioDao){
		this.repositorioRefugio = servicioRefugioDao;
	}
	
	
	@Override
	public void agregarRefugio(Refugio refugio) {
		repositorioRefugio.guardar(refugio);

	}

	@Override
	public Refugio buscarRefugio(Long id) {
		return repositorioRefugio.buscar(id);
	}
	
    @Override
	public List<Refugio> listarTodos(){
		return repositorioRefugio.buscarTodos();
	}
	
}
