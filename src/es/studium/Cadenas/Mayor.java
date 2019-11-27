package es.studium.Cadenas;

import java.util.Scanner;

public class Mayor
{

	public static void main(String[] args)
	{
		String mi_cadena[] = new String[5];
		int i;
		String mayor;
		
		Scanner teclado = new Scanner(System.in);
		
		for (i = 0; i <= 4; i++)
		{
			System.out.println("Introduzca palabra número "+ (i+1));
			mi_cadena[i] = teclado.next();
		}
		mayor=mi_cadena[0];
		for (i = 1; i <= 4; i++) {
			
				if(mayor.compareTo(mi_cadena[i])<0) {
					
					mayor=mi_cadena[i];
					
			}
				
			}System.out.println("La mayor de todas alfabeticamente es: "+ mayor);
			teclado.close();

}}
