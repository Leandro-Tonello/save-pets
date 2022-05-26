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
    public ModelAndView registrarRefugio(@ModelAttribute("datosRefugio") DatosRefugio datosRefugio) throws InterruptedException, ApiException, IOException {
	    ModelMap model = new ModelMap();
	    servicioRefugio.agregarRefugio(datosRefugio);
	    return mostrarRefugios();
    }


    @RequestMapping(path="/mapa-refugios", method = RequestMethod.GET)
    public ModelAndView mostrarMapaRefugios() throws InterruptedException, ApiException, IOException {
        ModelMap model = new ModelMap();
        model.put("refugios", servicioRefugio.listarTodos());
        return new ModelAndView("vistaMapaRefugios", model);
    }

    @RequestMapping(path = "/mostrar-refugios", method = RequestMethod.GET)
    public ModelAndView mostrarRefugios(){
        ModelMap modelo = new ModelMap();
        modelo.put("listaDeRefugios", servicioRefugio.listarTodos());
        return new ModelAndView("Refugios",modelo);
    }
    
    @RequestMapping(path = "/buscarRefugio", method = RequestMethod.GET)
    public ModelAndView buscarRefugio(){
        ModelMap modelo = new ModelMap();
        modelo.put("datosRefugio", new DatosMascota());
        return new ModelAndView("buscarRefugio", modelo);
    }
    
    @RequestMapping(path = "/buscarRefugio", method = RequestMethod.POST)
    public ModelAndView buscarRefugio(@ModelAttribute("datosRefugio") DatosRefugio datosRefugio){
        ModelMap modelo = new ModelMap();
        modelo.put("listaDeRefugios", servicioRefugio.buscarRefugio(datosRefugio.getNombre()));
        return new ModelAndView("buscarRefugio", modelo);
    }
}
