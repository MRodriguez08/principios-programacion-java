public class ExpresionesBooleanas {

	public static void main(String[] args){
		
		String usuario = "admin";
		String contrasenia = "muysegura";
		
		boolean usuarioEsAdmin = admin.equals("admin");
		boolean largoContraseniaEsOk = contrasenia.length() > 15;
		
		// OR -> ||
		boolean faltaAlgunDato = usuario.equals("") || contrasenia.equals("");
		
		// AND -> &&
		boolean loginOK = usuario.equals("admin") && contrasenia.equals("extrasegura");
	
		boolean muestroMensajeError = !loginOk;
	
	}
	

}