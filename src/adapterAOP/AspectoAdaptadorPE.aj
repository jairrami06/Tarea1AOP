package adapterAOP;

public aspect AspectoAdaptadorPE {
    private PrestobarbaElectrico pe = new PrestobarbaElectrico();

    pointcut llamadorasurar(AdaptadorPrestElect adaptador) : execution(void AdaptadorPrestElect.rasurar()) && this(adaptador);

    before(AdaptadorPrestElect adaptador) : llamadorasurar(adaptador) {
        pe.encender();
        pe.rasurar();
        pe.apagar();
    }
    
    pointcut llamadomant(AdaptadorPrestElect adaptador) : execution(void AdaptadorPrestElect.mantenimiento()) && this(adaptador);

    before(AdaptadorPrestElect adaptador) : llamadomant(adaptador) {
        pe.cambiarHojas();
    	pe.cargarBateria();
    }
}
