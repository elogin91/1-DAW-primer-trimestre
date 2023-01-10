import java.util.Scanner;

public class Activity05WhileIf {

	public static void main(String[] args) {
		
		int edad = 0;
		int contadorMayores = 0;
		int contadorMenores = 0;
		int acumuladorMayores = 0;
		int acumuladorMenores = 0;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Tecleeme la edad como número entero, y pulse 0 para terminar.");
		edad = leer.nextInt();
		
		while (edad != 0) {
			
			if(edad>=18) {
			contadorMayores++;
			acumuladorMayores += edad;
			}
			else {
				contadorMenores++;
				acumuladorMenores += edad;
			}
			
			System.out.println("Tecleeme la edad como número entero, y pulse 0 para terminar.");
			edad = leer.nextInt();	
		}
		
		System.out.println("Edades mayores de edad procesadas :" + contadorMayores);
		System.out.println("Edades menores de edad procesadas :" + contadorMenores);
		System.out.println("Las edades de mayores de edad suman : " +acumuladorMayores);
		System.out.println("Las edades de menores de edad suman : " +acumuladorMenores);
	}


}
