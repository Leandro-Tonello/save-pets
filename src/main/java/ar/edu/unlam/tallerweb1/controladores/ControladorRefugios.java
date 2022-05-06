package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Refugio;
import ar.edu.unlam.tallerweb1.servicios.MapaService;
import com.google.maps.errors.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	@RequestMapping(path = "/registrar-refugio", method = RequestMethod.GET)
    public ModelAndView mostrarFormularioRegistroRefugio(){
	    ModelMap model = new ModelMap();
	    model.put("datosRefugio", new DatosRefugio());
	    return new ModelAndView("registrar-refugio", model);
    }

    @RequestMapping(path = "/registrar-refugio", method = RequestMethod.POST)
    public ModelAndView registrarRefugio(@ModelAttribute("datosRefugio") DatosRefugio datosRefugio){
	    ModelMap model = new ModelMap();
	    servicioRefugio.agregarRefugio(datosRefugio);
	    return mostrarRefugios();
    }


    @RequestMapping(path="/mapa-refugios", method = RequestMethod.GET)
    public ModelAndView probarMapApi() throws InterruptedException, ApiException, IOException {
        ModelMap model = new ModelMap();
        List<Refugio> refugios = servicioRefugio.listarTodos();
        String direccion = "Florencio Varela 1903, B1754 San Justo, Provincia de Buenos Aires";
        String coordenadas = mapaService.convertirDireccionACoordenadas(direccion);
        model.put("coordenadasDefault", coordenadas);

        for(Refugio refugio : refugios){
            refugio.setDireccion(mapaService.convertirDireccionACoordenadas(refugio.getDireccion()));
        }
        model.put("refugios", refugios);
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
