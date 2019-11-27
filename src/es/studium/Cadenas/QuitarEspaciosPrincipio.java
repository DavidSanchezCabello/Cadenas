package es.studium.Cadenas;

import java.util.Scanner;

public class QuitarEspaciosPrincipio
{

	public static void main(String[] args)
	{
		String cadena1;
		String cadena2="";
		boolean letra=false;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un texto");
		cadena1 = teclado.nextLine();

		/*cadena2 = cadena1.trim();
		System.out.println("La frase sin espacios queda de la siguiente manera: " + cadena2);*/
		
		for (int i=0;i<cadena1.length();i++) {
			if(!letra) { //Si aún no he encontrado letras
				if (cadena1.charAt(i) != ' ') {//Si es una letra
					letra = true;
					cadena2=cadena2+cadena1.charAt(i); 	//concatena
					System.out.println(cadena2);
								
				}
				else {
					cadena2=cadena2+cadena1.charAt(i);
					System.out.println(cadena2);
				}
				
			}
		
			
		}
		
		

		teclado.close();

	}

}
