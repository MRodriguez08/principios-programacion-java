
/**
* Programa: Estructura Do..While
*
* El objetivo de este programa es utilizar la estructura
* de control iterativa "Do..While".
*
* @author: Mauricio Rodriguez
*/
public class EstructuraDoWhile {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Estructura de Control DO..WHILE  #########");
		System.out.println("");
		
		System.out.println("Comenzando ejecucion del do..while...");
		
		int indiceDoWhile = 0;
		do {
			System.out.println("Valor indice: " + indiceDoWhile);
			indiceDoWhile++;
		} while(indiceDoWhile < 10);
		
		System.out.println("Finalizada ejecucion del do..while...");
		
	}
	

}