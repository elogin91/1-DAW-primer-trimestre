import java.util.Scanner;

public class OpcionConvertirBinario {
	int numero;
	Boolean datosValidos = true;

	public OpcionConvertirBinario(Scanner leer) {
		try {
			System.out.println("Introduce un número decimal:");
			numero = Integer.parseInt(leer.nextLine());
		} catch (Exception e) {
			System.out.println("Los datos introducidos no son válidos.");
			datosValidos = false;
		}
	}

	void convertirBinario() {
		if(datosValidos) {
			System.out.println("El número " + numero + " en binario es " + Integer.toBinaryString(numero));
		}
	}
}
