package SingletonAOP;

//import SingletonPOO.Registradora;

public class RegistradoraAOP {

	
private static RegistradoraAOP regisa = new RegistradoraAOP();
	
	private RegistradoraAOP () {}
	
	
	public static RegistradoraAOP getInstance(){
	      return regisa;
	   }
	
	public void registrar() {
		System.out.println("Registrar, archivo.txt");
	}
}
