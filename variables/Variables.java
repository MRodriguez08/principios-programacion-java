
/**
* Programa: Variables
*
* El objetivo de este programa es Definir y utilizar variables
*
* @author: Mauricio Rodriguez
*/
public class Variables {
	
	/*
		Este metodo main sirve para definir e inicializar
		una variable del tipo String.
		Luego de definirla la imprime en consola.
	*/
	public static void main(String[] argumentos){
		
		// Imprimimos el cabezal
		System.out.println("");
		System.out.println("######### Variables #########");
		System.out.println("");
		
		// Esto es una declaracion e inicializacion de una variable
		String unaVariableConValorInicial = "Hola Mundo!"; 
		
		// imprimo el valor de la variable *unaVariableConValorInicial*
		System.out.println(unaVariableConValorInicial);
		
		// Declaracion de una variable con el nombre "unaVariableSinValorInicial"
		// sin valor inicial
		String unaVariableSinValorInicial;
		
		// Asignacion de valor "Algun Valor" a la variable "unaVariableSinValorInicial"
		unaVariableSinValorInicial = "Algun Valor";
		
		// Imprimo el valor de la variable "unaVariableSinValorInicial"
		System.out.println(unaVariableSinValorInicial);
		
		// asignacion de valor "Ahora es otro valor!" a aa variable "unaVariableSinValorInicial"
		unaVariableSinValorInicial = "Ahora es otro valor!";
	
		// Imprimo el valor de la variable "unaVariableSinValorInicial"
		System.out.println(unaVariableSinValorInicial);
		
	}
	
}