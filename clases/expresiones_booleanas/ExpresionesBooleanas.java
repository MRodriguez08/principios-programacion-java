public class ExpresionesBooleanas {

	public static void main(String[] args){
		
		String usuario = "admin";
		String contrasenia = "muysegura";
		
		boolean usuarioEsAdmin = usuario.equals("admin");
		boolean largoContraseniaEsOk = contrasenia.length() > 15;
		
		// OR -> ||
		boolean faltaAlgunDato = usuario.equals("") || contrasenia.equals("");
		
		// AND -> &&
		boolean loginOK = usuario.equals("admin") && contrasenia.equals("extrasegura");
	
		// NOT -> !
		boolean muestroMensajeError = !loginOK;
		
		/* Otras operaciones: 
		* == (chequear igualdad)
		* > : mayor que
		* < : menor que
		* >= : mayor o igual
		* <= : menor o igual
		*/
		boolean  cincoEsMayorQueCuatro = 5 > 4;
		
		System.out.println("usuarioEsAdmin: " + usuarioEsAdmin);
		System.out.println("largoContraseniaEsOk: " + largoContraseniaEsOk);
		System.out.println("faltaAlgunDato: " + faltaAlgunDato);
		System.out.println("loginOK: " + loginOK);
		System.out.println("muestroMensajeError: " + muestroMensajeError);
		System.out.println("cincoEsMayorQueCuatro: " + cincoEsMayorQueCuatro);
		
		
	}
	

}