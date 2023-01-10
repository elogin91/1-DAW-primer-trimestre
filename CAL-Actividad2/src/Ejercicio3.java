import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		String nombre="";
		String sexo="";
		float salario=0;
		int contador=0;
		float sumaSalario=0;
		
		Scanner leer = new Scanner(System.in);
		
		//Sigo ejecutando el proceso si nombre es distinto de FIN/Fin/fin...
		while(!nombre.equalsIgnoreCase("FIN")) {
			System.out.println("-----Introduzca su nombre.-----");
			nombre=leer.nextLine();
			//Pido sexo y salario si nombre es distinto de FIN/Fin/fin...
			if(!nombre.equalsIgnoreCase("FIN")) {

				System.out.println("Introduzca la letra de su sexo: h/H o g/G.");
				sexo= leer.nextLine();
				
				System.out.println("Introduzca su salario anual.");
				salario= Float.parseFloat(leer.nextLine());


				contador++;
				sumaSalario=sumaSalario+salario;

				System.out.println("Su nombre es " +nombre+".");
				System.out.println("Su salario es un " +clasificandoSalario(salario)+".");
				System.out.println("Usted es " +clasificandoGenero(sexo)+".");
			}
		}
		System.out.println("Finalizando programa...");
		System.out.println("Se han introducido " + contador + " nombres.");
		System.out.println("La suma de todos los salarios es " + sumaSalario + ".");
		System.out.println("La media de todos los salarios es " + sumaSalario/contador +".");
	}
	
	//función que determina el sexo
	public static String clasificandoGenero(String generoSeleccionado) {
		switch (generoSeleccionado) {
	    case "h", "H":
	        return "Hombre";
	    case "m", "M":
	    	return "Mujer";
	    default:
	    	return "Sexo Erróneo";
		}
	}
	
	//función que determina el tipo de salario.
	public static String clasificandoSalario(float salario) {
		if (salario < 25000) {
			return "Salario Bajo";
		}
		else if(salario > 25000 && salario <40000) {
			return "Salario Medio";
		}
		else if(salario > 45000) {
			return "Salario Alto";
		}
		else {
			return "Salario no contenplado en las clasificaciones.";
		}
	}
}
