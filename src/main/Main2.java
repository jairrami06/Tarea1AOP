package main;

import SingletonAOP.RegistradoraAOP;
import SingletonPOO.Cliente;
import SingletonPOO.Registradora;
import SingletonPOO.Restaurante;


public class Main2 {
	
	public static void main(String[] args) {
		
		Restaurante restaurante1= new Restaurante();
		Cliente cliente1= new Cliente("Cristian");
		
		restaurante1.dejarPasar(cliente1);
		//Registro con mi singleton
		RegistradoraAOP.getInstance().registrar();;
		
		

	}

}
