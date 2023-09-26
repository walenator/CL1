package cl1.cibertec.edu.pe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl1.cibertec.edu.pe.interfaceServices.IEmpleadosService;
import cl1.cibertec.edu.pe.interfaces.IEmpleado;
import cl1.cibertec.edu.pe.modelo.Empleado;

@Service
public class EmpleadoService implements IEmpleadosService{
	
	@Autowired
	private IEmpleado data;
	
	@Override
	public List<Empleado> Listado() {
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> ver(int id) {
		return data.findById((double) id);
	}

	@Override
	public int grabar(Empleado a) {
		int res = 0;
		Empleado ObjA = data.save(a);
		if(!ObjA.equals(null))res = 1;
		return res;
	}

}
