package SingletonAOP;
import SingletonAOP.*;
//import SingletonPOO.Registradora;

public aspect SingletonAOP {

pointcut singletonMethods(): within(RegistradoraAOP) && execution(* *(..));
    
    before(): singletonMethods() {
        //RegistradoraAOP.getInstance();
    }
    
    after(): singletonMethods() {
    	//Usa el método del objeto singleton
    	//RegistradoraAOP.getInstance().registrar();
        System.out.println("Registro exitoso!!!");
        
    }
    
   

	
		
}
