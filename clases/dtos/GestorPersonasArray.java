import java.util.ArrayList;

public class GestorPersonasArray {
	
	public static void main(String[] args){
		
		System.out.println("Uso de DTOs");
		
		Persona[] listaPersonas = new Persona[4];
		
		Persona persona1 = new Persona();
		persona1.setNombre("Ana");
		persona1.setEdad(18);
		
		Persona persona2 = new Persona();
		persona2.setNombre("Juan");
		persona2.setEdad(25);
		
		listaPersonas[0] = persona1;
		listaPersonas[1] = persona2;
		
		for (int i = 0; i < listaPersonas.length; i++){
			
			Persona p = listaPersonas[i];
			if (p.getNombre() != null){
				System.out.println(p.getNombre());
			}
		}
		
	}
	
}

class Persona {
	
	private String nombre;
	private int edad;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String n){
		nombre = n;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setEdad(int e){
		edad = e;
	}
	
}
