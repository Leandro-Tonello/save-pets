package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioRefugio;

@Controller
public class ControladorRefugios {

	private ServicioRefugio servicioRefugio;

	@Autowired
	public ControladorRefugios(ServicioRefugio servicioRefugio){
		this.servicioRefugio=servicioRefugio;
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
