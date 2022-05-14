package ar.edu.unlam.tallerweb1.servicios;

import java.io.IOException;
import java.util.List;

import ar.edu.unlam.tallerweb1.controladores.DatosRefugio;
import com.google.maps.errors.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.servicios.MapaService;
import ar.edu.unlam.tallerweb1.modelo.Refugio;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioRefugio;

@Service("servicioRefugio")
@Transactional
public class ServicioRefugioImpl implements ServicioRefugio {

	private MapaService mapaService;
	private RepositorioRefugio repositorioRefugio;
	private ServicioRefugioImpl servicioRefugio;
	
	@Autowired
	public ServicioRefugioImpl(RepositorioRefugio servicioRefugioDao, MapaService mapaService){
		this.repositorioRefugio = servicioRefugioDao;
		this.mapaService = mapaService;
	}
	
	
	@Override
	public Refugio agregarRefugio(DatosRefugio datosRefugio) throws InterruptedException, ApiException, IOException {
		Refugio nuevoRefugio = new Refugio(datosRefugio);
		nuevoRefugio.setCoordenadas(mapaService.convertirDireccionACoordenadas(datosRefugio.getDireccion()));
		repositorioRefugio.guardar(nuevoRefugio);
		return nuevoRefugio;
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
