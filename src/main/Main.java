package main;

public class Main {

	public static void main(String[] args) {
		
		//Adapter POO
		adapterPOO.Prestobarba pm = new adapterPOO.PrestobarbaManual();
		adapterPOO.PrestobarbaElectrico pe = new adapterPOO.PrestobarbaElectrico();
		adapterPOO.Prestobarba adppe = new adapterPOO.AdaptadorPrestElect(pe);
		
		System.out.println("Prestobarba Manual");
		pm.rasurar();
		pm.mantenimiento();
		
		System.out.println("");
		
		System.out.println("Prestobarba Electrico");
		adppe.rasurar();
		adppe.mantenimiento();
		
		
		//Adapter AOP
		adapterAOP.Prestobarba p = new adapterAOP.AdaptadorPrestElect();
		
		p.rasurar();
		
		p.mantenimiento();
	}

}
