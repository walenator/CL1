package cl1.cibertec.edu.pe.interfaceServices;

import java.util.List;
import java.util.Optional;

import cl1.cibertec.edu.pe.modelo.Empleado;

public interface IEmpleadosService {
	public List<Empleado> Listado();
	public Optional<Empleado> ver(int id);
	public int grabar(Empleado a);
}
