import java.util.Scanner;

public class Activity05While {

	public static void main(String[] args) {
		
		int edad = 0;
		int contador = 0;
		int acumulador = 0;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Tecleeme la edad como número entero, y pulse 0 para terminar.");
		edad = leer.nextInt();
		
		while (edad != 0) {
			contador++;
			acumulador += edad;
			
			System.out.println("Tecleeme la edad como número entero, y pulse 0 para terminar.");
			edad = leer.nextInt();	
		}
		
		System.out.println("Edades procesadas :" + contador);
		System.out.println("Las edades suman : " + acumulador);
	}

}
