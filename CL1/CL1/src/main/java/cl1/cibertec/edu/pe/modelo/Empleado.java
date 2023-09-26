package cl1.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdEmpleado;
    private String Apellidos;
    private String Nombres;
    private int Edad;
	private char sexo;
    private double salario;
    
    // Constructores
	public Empleado() {
	}


	public Empleado(int idEmpleado, String apellidos, String nombres, int edad, char sexo, double salario) {
		IdEmpleado = idEmpleado;
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}

	// Getters & Setters
	public int getIdEmpleado() {
		return IdEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getNombres() {
		return Nombres;
	}


	public void setNombres(String nombres) {
		Nombres = nombres;
	}


	public int getEdad() {
		return Edad;
	}


	public void setEdad(int edad) {
		Edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
    
    
}
