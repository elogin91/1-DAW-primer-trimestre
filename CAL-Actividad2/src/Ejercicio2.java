import java.util.Scanner;

public class Ejercicio2 {
	//Declaro un atributo
	int numeroAleatorio;
	public static void main(String[] args) {
		System.out.println("Empezando a jugar... Adivine un número aleatorio del 1 al 40.");
		
		//Creo un objeto que tendrá como atributo un número entero con un valor aleatorio.
		Ejercicio2 juego1 = new Ejercicio2((int)(Math.random()*40+1));
		
		//Empezamos el juego
		juego1.empezarJuego();

	}
	private void empezarJuego() {
	
		Scanner leer= new Scanner(System.in);
		int numeroIntentos = 0, numeroComprobar = 0;

		//Siempre que el numero aleatorio y el numeroComprobar no sean el mismo permaneceré en el bucle
		while(numeroAleatorio != numeroComprobar) {
			//Pido al usuario un número y lo guardo en la variable 
			System.out.println("-----Introduzca un número para hacer un intento-----");
			numeroComprobar=leer.nextInt();
			//Compruebo que el número introducido por el usuario es entre 1 y 40
			if(esNumeroValido(numeroComprobar)) {
				//Aumento el numero de intentos si el numero es valido (1-40)
				numeroIntentos++;
				//Comparo el numero aleatorio y el numero introducido, y actuamos según el caso.
				if (numeroAleatorio>numeroComprobar) {
					System.out.println("El número a adivinar es mayor que el número introducido.");
				}
				else if(numeroAleatorio<numeroComprobar) {
					System.out.println("El número a adivinar es menor que el número introducido.");
				}
				else {
					System.out.println("Finalizando juego y programa...");
					System.out.println("Ha realizado "+numeroIntentos+" intentos.");
					System.out.println("Ha adivinado el número aleatorio " +numeroAleatorio+ ", ENHORABUENA.");
				}
			}
			else {
				System.out.println("Por favor introduzca otro número, solo están permitidos los números del 1 al 40");
			}

		}
	}
	public Ejercicio2(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}
	
	public boolean esNumeroValido(int numeroComprobar) {
		return numeroComprobar>=1 && numeroComprobar<=40;
	}
}
