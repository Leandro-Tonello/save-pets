package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.controladores.DatosMascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Mascota;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioMascota;

@Service("ServicioMascota")
public class ServicioMascotaImpl implements ServicioMascota{

    private RepositorioMascota repositorioMascota;
    private ServicioMascotaImpl servicioMascota;

    @Autowired
    public ServicioMascotaImpl(RepositorioMascota repositorioMascota){
        this.repositorioMascota = repositorioMascota;
    }

    @Override
    public Mascota agregarMascota(DatosMascota datosMascota) {
        Mascota nuevaMascota = new Mascota(datosMascota);
        repositorioMascota.guardar(nuevaMascota);
        return nuevaMascota;
    }

    @Override
    public Mascota buscarMascota(Long id) {
        return repositorioMascota.buscar(id);
    }

    @Override
    public List<Mascota> listarTodos() {
        return repositorioMascota.buscarTodos();
    }
}
