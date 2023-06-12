package SingletonAOP;

//import SingletonPOO.Registradora;

public aspect SingletonAOP {

pointcut singletonMethods(): within(RegistradoraAOP) && execution(* *(..));
    
    before(): singletonMethods() {
        //RegistradoraAOP.getInstance();
    }
    
    after(): singletonMethods() {
        System.out.println("Registro exitoso!!!");
        
    }
    
   

	
		
}
