package SingletonPOO;

public class Registradora {
	
	private static Registradora regis = new Registradora();
	
	private Registradora () {}
	
	
	public static Registradora getInstance(){
	      return regis;
	   }
	
	public void registrar() {
		
		System.out.println("Registrar, archivo.txt");
	}
	
	
}
