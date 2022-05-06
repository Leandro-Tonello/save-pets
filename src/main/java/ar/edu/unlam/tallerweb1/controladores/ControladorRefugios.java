package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Refugio;
import ar.edu.unlam.tallerweb1.servicios.MapaService;
import com.google.maps.errors.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioRefugio;

import java.io.IOException;
import java.util.List;

@Controller
public class ControladorRefugios {

    private MapaService mapaService;
	private ServicioRefugio servicioRefugio;

	@Autowired
	public ControladorRefugios(ServicioRefugio servicioRefugio, MapaService mapaService){
		this.servicioRefugio=servicioRefugio;
		this.mapaService = mapaService;
	}

    @RequestMapping(path="/mapa-refugios", method = RequestMethod.GET)
    public ModelAndView probarMapApi() throws InterruptedException, ApiException, IOException {
        ModelMap model = new ModelMap();
        List<Refugio> refugios = servicioRefugio.listarTodos();
        //String direccion = "Curupayti 1320, Moron, Provincia de Buenos Aires";
        String direccion = refugios.get(0).getDireccion();

        String coordenadas = mapaService.convertirDireccionACoordenadas(direccion);
        model.put("coordenadas", coordenadas);
        return new ModelAndView("vistaMapaRefugios", model);
    }

    @RequestMapping(path = "/mostrar-refugios", method = RequestMethod.GET)
    public ModelAndView mostrarRefugios(){
        ModelMap modelo = new ModelMap();
        modelo.put("listaDeRefugios", servicioRefugio.listarTodos());
        return new ModelAndView("Refugios",modelo);
    }
    
    @RequestMapping(path = "/mostrar-animales", method = RequestMethod.GET)
    public ModelAndView mostrarAnimales(){
        ModelMap modelo = new ModelMap();
        modelo.put("listaDeAnimales", servicioRefugio.listarTodos());
        return new ModelAndView("Refugios",modelo);
    }
	
}
