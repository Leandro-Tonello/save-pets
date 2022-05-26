package ar.edu.unlam.tallerweb1.servicios;

import java.io.IOException;
import java.util.List;

import ar.edu.unlam.tallerweb1.controladores.DatosMascota;
import com.google.maps.errors.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Mascota;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioMascota;

@Service("ServicioMascota")
public class ServicioMascotaImpl implements ServicioMascota{

    private RepositorioMascota repositorioMascota;
    private ServicioMascotaImpl servicioMascota;
    private MapaService mapaService;

    @Autowired
    public ServicioMascotaImpl(RepositorioMascota repositorioMascota, MapaService mapaService){
        this.repositorioMascota = repositorioMascota;
        this.mapaService = mapaService;
    }

    @Override
    public Mascota agregarMascota(DatosMascota datosMascota) throws InterruptedException, ApiException, IOException {
        Mascota nuevaMascota = new Mascota(datosMascota);
        nuevaMascota.setCoordenadas(mapaService.convertirDireccionACoordenadas(datosMascota.getDireccion()));
        repositorioMascota.guardar(nuevaMascota);
        return nuevaMascota;
    }
    
    @Override
    public Mascota agregarMascotaARefugio(DatosMascota datosMascota) {
        Mascota nuevaMascota = new Mascota(datosMascota);
        repositorioMascota.guardar(nuevaMascota);
        return nuevaMascota;
    }


    @Override
    public List<Mascota> buscarMascota(String nombre) {
        return repositorioMascota.buscar(nombre);
    }

    @Override
    public List<Mascota> listarTodos() {
        return repositorioMascota.buscarTodos();
    }
}
