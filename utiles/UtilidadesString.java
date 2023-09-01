import java.util.Scanner;

/**
* * Programa: Utilidades String
* 
* Esta clase pretende demostrar el uso de algunas de las funcionalidades
* mas importantes de la clase String.
* 
* @author: Mauricio Rodriguez
*/
public class UtilidadesString {
	
  public static void main(String[] args) {
	  
	// Imprimimos el cabezal
	System.out.println("");
	System.out.println("######### Utilidades String #########");
	System.out.println("");

    Scanner input = new Scanner(System.in);

	/* mostramos mensaje para solicitar nombre al usuario */
    System.out.print("Ingrese el texto a analizar: ");

	// almacenamos el texto ingresado en una variable "texto"
    String texto = input.nextLine();
	
	/*
	* .equals("este es un texto") devuelve true si el texto es igual
	* al String "este es un texto", falso si no lo es.
	*/
	boolean esIgualAEsteEsUnTexto = texto.equals("este es un texto");
	System.out.println("Texto es 'este es un texto': " + esIgualAEsteEsUnTexto);
	
	/*
	* .isEmpty() devuelve true si el texto es vacío,
	* falso si no lo es.
	*/
	boolean textoEsVacio = texto.isEmpty();
	System.out.println("El texto es vacio: " + textoEsVacio);
	
	// .length() devuelve el largo del texto en caracteres
	int largoTexto = texto.length();
	System.out.println("El largo del texto es: " + largoTexto);
	
	/* .contains("algunValor") devuelve true si el texto contiene el 
	* String "algunValor", false si no lo contiene
	*/
	boolean contieneTextoJava = texto.contains("Java");
	System.out.println("El texto contiene la palabra 'Java': " + contieneTextoJava);
	
	/*
	* .replaceAll("Java", "JAVAAAAAAAA") reemplaza todas las palabras "Java"
	* encontradas en el texto por la palabra "JAVAAAAAAAA"
	*/
	String textoModificado = texto.replaceAll("Java", "JAVAAAAAAAA");
	System.out.println("Texto Modificado: " + textoModificado);
	
    input.close();
  }
  
}