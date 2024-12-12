package holamundo;

import java.util.Scanner;

	/*
	 * 
	 *  El programa pregunta e imprime el nombre que ha
		introducido el usuario. 
	 *		
	 *	@autor David
	 *	@version 1.0
	 *
	 */


public class HolaMundo {

	/* El metodo principal es lo que contiene todo el codigo del programa 
	y para que lo muenstre*/
	
	public static void main(String[] args) {
		
		// Declaramos el Scanner.
		Scanner scanner = new Scanner(System.in);
		
		// Pedimos al usuario un nombre.
		System.out.print("Ingresa tu nombre: ");
		String nombre = scanner.nextLine(); // Sirve para leer lo que introduce el usuario
		
		// Monstramos el saludo y el nombre introducido.
		System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
		
		// Cambio realizado desde rama desarollo.
		// Comentario después de realizar fusión.
		// Este cambio se realiza desde GitHub.
		// Cambio realizado después de hacer el pull.
	}

}
