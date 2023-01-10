import java.util.Scanner;

public class Menu {

	int opcion = 0;
	Scanner leer = new Scanner(System.in);
	
	public static void main(String[] args) {
		Menu miMenu = new Menu();
		while(miMenu.opcion!=4) {
			miMenu.pintaMenu();
			miMenu.leerOpcion();
			miMenu.seleccionandoOpcion();
		}
	}

	private void pintaMenu() {
		System.out.println("****** MENU ******");
		System.out.println("------------------");
		System.out.println("1. Conversor decimal-binario");
		System.out.println("2. Calculadora");
		System.out.println("3. Analizador de frase");
		System.out.println("4. Salir");
		System.out.println("");
		System.out.println("Introduce una opcion:");
	}
	
	private int leerNumero() {
		return Integer.parseInt(leer.nextLine());
	}
	
	private void leerOpcion() {
		opcion = leerNumero();
	}
	
	private void seleccionandoOpcion () {
		if (opcion == 1) {
			OpcionConvertirBinario numeroBinario = new OpcionConvertirBinario(leer);
			numeroBinario.convertirBinario();
		}
		else if (opcion == 2) {
			OpcionCalculadora calculadora = new OpcionCalculadora(leer);
			calculadora.calcular();
		}
		else if (opcion == 3) {
			OpcionAnalizarFrase frase = new OpcionAnalizarFrase(leer);
			frase.analizarFrase();
		}
		else if (opcion == 4) {
			OpcionSalir salida = new OpcionSalir();
			salida.salir();
		}
		else {
			OpcionNoValida opcionNoValida = new OpcionNoValida ();
			opcionNoValida.noEsValida();
		}
	}
}