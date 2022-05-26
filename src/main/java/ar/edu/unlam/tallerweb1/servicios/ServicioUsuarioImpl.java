package ar.edu.unlam.tallerweb1.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.controladores.DatosRegistro;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioUsuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioUsuarioImpl;


@Service("servicioUsuario")
@Transactional
public class ServicioUsuarioImpl implements ServicioUsuario {

	private RepositorioUsuario repo;
	
	@Autowired
	public ServicioUsuarioImpl(RepositorioUsuario servicioUsuarioDao){
        this.repo = servicioUsuarioDao;
    }

    public Usuario registrar(DatosRegistro datosRegistro) {
    	if(lasClavesSonDistintas(datosRegistro)){
            throw new ClavesDistintasException();
        }
        if(laClaveTieneLongitudIncorrecta(datosRegistro)){
            throw new ClaveLongitudIncorrectaException();
        }
        if(repo.buscar(datosRegistro.getEmail()) != null){
            throw new UsuarioYaExisteException();
        }
        Usuario nuevoUsuario = new Usuario(datosRegistro);
        repo.guardar(nuevoUsuario);
        return nuevoUsuario;
    }

    public Boolean lasClavesSonDistintas(DatosRegistro datosRegistro) {
        return !datosRegistro.getClave().equals(datosRegistro.getRepiteClave());
    }

    public Boolean laClaveTieneLongitudIncorrecta(DatosRegistro datosRegistro) {
        return datosRegistro.getClave().length() < 8;
    }
    
}
