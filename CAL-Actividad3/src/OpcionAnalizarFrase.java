import java.util.Scanner;

public class OpcionAnalizarFrase {
	String palabra;
	public OpcionAnalizarFrase(Scanner leer) {
		System.out.println("Introduce una palabra:");
		palabra=leer.nextLine();
	}
	
	void analizarFrase() {

		String consonantes="";
		String vocales="";
		
		
		//Busco y copio consonantes y vocales (solo considero las acentuaciones comunes en español)
		//No copio números, ni caracteres especiales, ya que no son vocales ni consonantes.
		for(int i = 0; i < palabra.length(); i++) {

			String letra  = palabra.substring(i,i+1);
			if(esVocal(letra)) {
				vocales += letra;
			}
			else if(esConsonante(letra)) {
				consonantes += letra;
			}
		}
		pintandoTablaResultado(palabra,consonantes, vocales);
	}
	
	private boolean esVocal(String letra) {
		return letra.toLowerCase().matches("[aeiouáéíóúü]");
	}
	
	private boolean esConsonante(String letra) {
		return letra.toLowerCase().matches("[a-z&&[^aeiou]]");
	}

	private void pintandoTablaResultado(String palabra, String consonantes, String vocales) {
		System.out.println("PALABRA             CONSONANTES         VOCALES             LONGITUD");
		System.out.println("-------------------------------------------------------------------------");
		pintaRegistro(palabra);
		pintaRegistro(consonantes);
		pintaRegistro(vocales);
		pintaRegistro(String.valueOf(palabra.length()));

		System.out.println();
		System.out.println();
	}

	private void pintaRegistro(String palabra) {
		System.out.print(palabra);
		for(int j=1;j<=(20-palabra.length());j++) {
			System.out.print(" ");
		}
	}

}
