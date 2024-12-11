package holamundo;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		
		// Declaramos el Scanner.
		Scanner scanner = new Scanner(System.in);
		
		// Pedimos al usuario un nombre.
		System.out.print("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();
		
		// Monstramos el saludo y el nombre introducido.
		System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
		
	}

}
