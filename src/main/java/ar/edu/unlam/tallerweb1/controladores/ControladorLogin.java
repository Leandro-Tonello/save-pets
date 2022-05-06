package ar.edu.unlam.tallerweb1.controladores;


import ar.edu.unlam.tallerweb1.modelo.Refugio;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;
import ar.edu.unlam.tallerweb1.servicios.ServicioRefugio;
import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControladorLogin {

	private ServicioUsuario servicioUsuario;
	private ServicioLogin servicioLogin;
	private ServicioRefugio servicioRefugio;


	@Autowired
	public ControladorLogin(ServicioLogin servicioLogin, ServicioUsuario servicioUsuario, ServicioRefugio servicioRefugio){
		this.servicioUsuario = servicioUsuario;
		this.servicioLogin= servicioLogin;		
		this.servicioRefugio = servicioRefugio;
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		
		Refugio refugio1 = new Refugio ("Ayudacan", "Jerónimo Salguero 151,C1177AEA, C1177 AEA, Buenos Aires","01156179472", 20, 10, "https://lh5.googleusercontent.com/p/AF1QipOQ5VaNKJr6i2dzJp06WMbKdT61pb2fsVdjIOOA=w408-h544-k-no");
		servicioRefugio.agregarRefugio(refugio1);
		Refugio refugio2 = new Refugio ("Mascotas en Adopción Argentina", "Av. Cnel. Díaz 2488, C1425 CABA", "01122607357", 20,10, "https://lh5.googleusercontent.com/p/AF1QipMLT07zQUVwAygjyLVvClji9M3VV4pXjf99AS32=w408-h306-k-no");
		servicioRefugio.agregarRefugio(refugio2);

        servicioUsuario.registrarAdmin();
		return new ModelAndView("redirect:/login");
	}
	
	@RequestMapping("/login")
	public ModelAndView irALogin() {

		ModelMap modelo = new ModelMap();
		modelo.put("datosLogin", new DatosLogin());
		return new ModelAndView("login", modelo);
	}

	@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
	public ModelAndView validarLogin(@ModelAttribute("datosLogin") DatosLogin datosLogin, HttpServletRequest request) {
		ModelMap model = new ModelMap();

		Usuario usuarioBuscado = servicioLogin.consultarUsuario(datosLogin.getEmail(), datosLogin.getPassword());
		if(usuarioBuscado==null){
			model.put("error", "Usuario o clave incorrecta");
		}
		else if(usuarioBuscado.getEmail()=="admin"&&usuarioBuscado.getPassword()=="admin") {
//			request.getSession().setAttribute("ADMIN", usuarioBuscado.getRol());
			return new ModelAndView("redirect:/mostrar-refugios");
		}else{
//				request.getSession().setAttribute("ROL", usuarioBuscado.getRol());
				return new ModelAndView("redirect:/mostrar-refugios");
		}
		return new ModelAndView("login", model);
	}
	
}