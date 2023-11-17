import java.util.ArrayList;

public class GestorPersonas {
	
	public static void main(String[] args){
		
		System.out.println("Uso de DTOs");
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		Persona persona1 = new Persona();
		persona1.setNombre("Ana");
		persona1.setEdad(18);
		
		Persona persona2 = new Persona();
		persona2.setNombre("Juan");
		persona2.setEdad(25);
		
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		
		for (int i = 0; i < listaPersonas.size(); i++){
			
			Persona p = listaPersonas.get(i);
			System.out.println(p.getNombre());
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
