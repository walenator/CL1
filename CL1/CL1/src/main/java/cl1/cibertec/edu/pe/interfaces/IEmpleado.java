package cl1.cibertec.edu.pe.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl1.cibertec.edu.pe.modelo.Empleado;

@Repository
public interface IEmpleado extends JpaRepository<Empleado, Double>{

}
