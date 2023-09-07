/*
* Importamos la clase Scanner para poder utilizarla en el codigo
* Cada vez que utilizamos alguna clase o herramienta especial 
* debemos importarla con la palabra reservada "import" al comienzo del
* codigo.
*/
import java.util.Scanner;

/**
* * Programa: Entrada estandar
* 
* Esta clase pretende demostrar el uso basico de la utilidad Scanner
* Para pedir datos al usuario por Consola.
* 
* @author: Mauricio Rodriguez
*/
public class EntradaEstandar {
	
  public static void main(String[] args) {
	  
	// Imprimimos el cabezal
	System.out.println("");
	System.out.println("######### Hola a Usuario #########");
	System.out.println("");

    /*
	* Declaramos una variable "input" del tipo "Scanner" y
	* la inicializamos con "new Scanner(System.in)" para crear un Scanner.
	*/
    Scanner input = new Scanner(System.in);

	/* mostramos mensaje para solicitar nombre al usuario */
    System.out.print("Ingrese su nombre: ");

    // usamos el método "nextLine" de la clase "Scanner" para ingreso de datos
    String nombre = input.nextLine();
	
	/* mostramos mensaje para solicitar apellido al usuario */
    System.out.print("Ingrese su apellido: ");
	String apellido = input.nextLine();

    // mostramos el dato ingresado previamente por el usuario
    System.out.println("Nombre: " + nombre);
	System.out.println("Apellido: " + apellido);

    /*
	* IMPORTANTE!!!: Cada Scanner se crea, se utiliza y al finalizar
	* se debe CERRAR!!, Dejar un Scanner abierto es un error de programación.
	*/
    input.close();
  }
  
}