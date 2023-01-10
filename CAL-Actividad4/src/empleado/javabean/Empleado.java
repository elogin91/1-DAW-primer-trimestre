package empleado.javabean;

public class Empleado {
	private int idEmpleado, idDepartamento;
	private String nombre, apellidos, email;
	private Double salario, complemento;
	private char sexo;
	
	// Default constructor
	public Empleado() {
	}
	
	// Constructor with parameter
	public Empleado(int idEmpleado, int idDepartamento, String nombre, String apellidos, String email, Double salario, Double complemento, char sexo) {
		this.idEmpleado = idEmpleado;
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.salario = salario;
		this.complemento = complemento;
		this.sexo = sexo;
	}
	
	// Getters & Setters
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getComplemento() {
		return complemento;
	}

	public void setComplemento(Double complemento) {
		this.complemento = complemento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", idDepartamento=" + idDepartamento + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", email=" + email + ", salario=" + salario + ", complemento="
				+ complemento + ", sexo=" + sexo + "]";
	}
	
	public double salarioBruto() {
		return complemento+salario;
	}
	public double salarioMensual(int meses) {
		return salarioBruto()/meses;
	}
	
	public String literalSexo() {
		if(sexo == 'h' || sexo == 'H') {
			return "Hombre";
		}
		else if (sexo == 'm' || sexo == 'M') {
			return "Mujer";
		}
		else {
			return "Caracter no válido.";
		}
		
	}
	
	public String obtenerEmail() {

		String primerApellido[] =apellidos.split(" ");
		char primeraLetraNombre = nombre.charAt(0);

		return (primeraLetraNombre + primerApellido[0]).toLowerCase();
		
	}
	
	public String nombreCompleto() {
		return nombre + " " + apellidos;
		
	}
	
}
