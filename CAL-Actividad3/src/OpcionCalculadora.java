import java.util.Scanner;

public class OpcionCalculadora {

	Float numero1;
	Float numero2;
	String operador;
	Boolean datosValidos = true;

	public OpcionCalculadora(Scanner leer) {
		try {
			System.out.println("Introduce dos números decimales:");
			numero1 = Float.parseFloat(leer.nextLine());
			numero2 = Float.parseFloat(leer.nextLine());
			System.out.println("Introduce un operador(+ ,- ,* , /, %)");
			operador = leer.nextLine();
		} catch (Exception e) {
			System.out.println("Los datos introducidos no son válidos.");
			datosValidos = false;
		}
	}

	void calcular() {
		Float resultado = 0f;

		if (datosValidos) {
			switch (operador) {
			case "+":
				resultado = numero1 + numero2;
				break;
			case "-":
				resultado = numero1 - numero2;
				break;
			case "*":
				resultado = numero1 * numero2;
				break;
			case "/":
				if (numero2 != 0) {
					resultado = numero1 / numero2;
				} else {
					datosValidos = false;
					System.out.println("No se puede dividir entre 0.");
				}
				break;
			case "%":
				// Operación a realizar modulo
				if (numero2 != 0) {
					resultado = numero1 % numero2;
				} else {
					datosValidos = false;
					System.out.println("No se puede dividir entre 0.");
				}
				break;
			default:
				System.out.println("Operador no válido.");
				datosValidos = false;
			}

			// Cuando existe un error:
			// -Salgo de la OpciónCalculadora volviendo al menu.
			// -No imprimo ningún resultado ya que hay un error en la operación.

			if (datosValidos) {
				System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
			}
		}
	}
}