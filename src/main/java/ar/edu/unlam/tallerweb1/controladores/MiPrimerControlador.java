package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiPrimerControlador
{
    @RequestMapping(path = "/miprimerurl", method = RequestMethod.GET)
    public ModelAndView irAVista1()
    {
        return new ModelAndView("miprimervista");
    }

    @RequestMapping(path = "/segundavista", method = RequestMethod.GET)
    public ModelAndView irAVista2(@RequestParam(value="op1") Double val1,
                                  @RequestParam(value="op2") Double val2)     //segundavista?op1=1&op2=3
            {
                ModelMap model = new ModelMap();
                Double resultado = val1 + val2;
                model.put("mensaje1","Mi primer mensaje del modelo");
                model.put("mensaje2","Mi segundo mensaje del modelo");
                model.put("valor1", val1);
                model.put("valor2", val2);
                model.put("resultado", resultado);
                return new ModelAndView("segundavista", model);
                //RECORDAR SIEMPRE PASAR EL MODELO CREADO JUNTO CON EL RETURN DE LA VISTA
            }

    //@RequestMapping(path= "/segundavista/categoria/{nombreCategoria}")
    //public ModelAndView mostrarVista2(@PathVariable(value="nombreCategoria") String nombre){
    //    ModelMap modelo = new ModelMap();
    //    modelo.put("nombre", nombre);
    //    return new ModelAndView("vista2", modelo);

    //}
}

