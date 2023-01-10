import java.util.Scanner;

public class Ejercicio1 {
	//Declaro atributos.
	int lado1, lado2, lado3;
	
	public static void main(String[] args) {
		//Pido por pantalla la longitud de los lados
		System.out.println("Teclee 3 números para establecer los lados del triangulo.");
		Scanner leer= new Scanner(System.in);
		
		//Creo un objeto triangulo
		Ejercicio1 triangulo = new Ejercicio1(leer.nextInt(),leer.nextInt(),leer.nextInt());

		//Compruebo si el objeto triangulo es un triangulo válido
		if (triangulo.esTrianguloValido()) { 
			System.out.println("Mi triangulo es correcto.");
			//Pinto el tipo de triangulo de mi objeto triangulo
			triangulo.pintaTipoTriangulo();
		}
		else {
			System.out.println("El triangulo no es correcto.");
		}
	}
	
	public Ejercicio1(int lado1, int lado2, int lado3) {
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	public boolean esTrianguloValido() {
		 return lado1+lado2>lado3 && lado2+lado3>lado1 && lado3+lado1>lado2;	
	}
	
	public  void pintaTipoTriangulo() {

		if(lado1==lado2 && lado1==lado3) {
			System.out.println("Mi triangulo es EQUILATERO.");
		}
		else if (lado1==lado2 || lado1==lado3 || lado2 == lado3) {
			System.out.println("Mi triangulo es ISOSCELES.");
		}
		else {
			System.out.println("Mi triangulo es ESCALENO.");
		}
	}
}