package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Mascota;
import ar.edu.unlam.tallerweb1.servicios.MapaService;
import com.google.maps.errors.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioMascota;

import java.io.IOException;
import java.util.List;

@Controller
public class ControladorMascotas {

    private MapaService mapaService;
    private ServicioMascota servicioMascota;


    @Autowired
    public ControladorMascotas(ServicioMascota servicioMascota, MapaService mapaService){
        this.servicioMascota=servicioMascota;
        this.mapaService=mapaService;
    }

    @RequestMapping(path = "/registrar-mascota", method = RequestMethod.GET)
    public ModelAndView mostrarFormularioRegistroMascota(){
        ModelMap model = new ModelMap();
        model.put("datosMascota", new DatosMascota());
        return new ModelAndView("registrar-mascota", model);
    }

    @RequestMapping(path="/registrar-mascota", method = RequestMethod.POST)
    public ModelAndView registrarMascota(@ModelAttribute("datosMascota") DatosMascota datosMascota) throws InterruptedException, ApiException, IOException {
        ModelMap model = new ModelMap();
        servicioMascota.agregarMascota(datosMascota);
        return mostrarMapaMascotas();
    }

    @RequestMapping(path="/mapa-mascotas", method = RequestMethod.GET)
    public ModelAndView mostrarMapaMascotas() throws InterruptedException, ApiException, IOException{
        ModelMap model = new ModelMap();
        model.put("mascotas", servicioMascota.listarTodos());
        return new ModelAndView("vistaMapaMascotas", model);
    }


}
