package cl1.cibertec.edu.pe.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl1.cibertec.edu.pe.interfaceServices.IEmpleadosService;
import cl1.cibertec.edu.pe.modelo.Empleado;

@Controller
public class EmpleadoController {
	
	@Autowired
	private IEmpleadosService servicio;
	
	//Metodo de Listado
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Empleado> LEmpleado = servicio.Listado();
		m.addAttribute("listEmp",LEmpleado);
		return "index";	
	}
	
	// Método agregar
	@GetMapping("/nuevo")
	public String agregar(Model m) {
	m.addAttribute("addemp", new Empleado());
	return "form";
	}
}
