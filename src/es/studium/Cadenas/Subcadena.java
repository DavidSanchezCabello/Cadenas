package es.studium.Cadenas;

import java.util.Scanner;

public class Subcadena
{

	public static void main(String[] args)
	{
		String cadena="";
		int longitud, aux;
		int posicion;
		
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca una cadena");
		cadena = teclado.next();
		
		System.out.println("Introduzca una posicion");
		posicion = teclado.nextInt();
		
		aux=cadena.length();
		System.out.println("Introduzca una longitud de la subcadena (<"+aux+")");
		longitud = teclado.nextInt();
		
		System.out.println("la subcadena es: "+ funSubcadena(cadena,posicion,longitud));
		
		teclado.close();	
			
		}
public static String funSubcadena(String cadena, int posicion, int longitud) {
	

	
	return  (cadena.substring(posicion-1,(posicion+longitud-1)));
	
	
	
	}

}
