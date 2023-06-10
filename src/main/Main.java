package main;
import adapterPOO.*;

public class Main {

	public static void main(String[] args) {
		Prestobarba pm = new PrestobarbaManual();
		PrestobarbaElectrico pe = new PrestobarbaElectrico();
		Prestobarba adppe = new AdaptadorPrestElect(pe);
		
		System.out.println("Prestobarba Manual");
		pm.rasurar();
		pm.mantenimiento();
		
		System.out.println("");
		
		System.out.println("Prestobarba Electrico");
		adppe.rasurar();
		adppe.mantenimiento();
	}

}
