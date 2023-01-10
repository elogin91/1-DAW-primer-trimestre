
public class Activity04Switch {
	
	public static void main(String[] args) {
		
		int mes = 2;
		
		switch (mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("Mes de 31 días");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("Mes de 30 días");
				break;
			case 2:
				System.out.println("Mes de 28-29 días");
				break;
			default:
				System.out.println("Mes Incorrecto.");
		}
		
		
		String opcion = "alta";

		switch (opcion) {
			case "alta":
				System.out.println("Procesando alta.");
				break;
			case "sumar":
				System.out.println("Sumando----------");
				break;
			default:
				System.out.println("Opción Incorrecta.");
		}
		
	}
}
