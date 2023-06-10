package adapterPOO;

public class AdaptadorPrestElect extends Prestobarba{
	PrestobarbaElectrico pe;
	
	public AdaptadorPrestElect(PrestobarbaElectrico pe) {
		this.pe = pe;
	}

	@Override
	public void rasurar() {
		pe.encender();
		pe.rasurar();
		pe.apagar();
	}

	@Override
	public void mantenimiento() {
		pe.cambiarHojas();
		pe.cargarBateria();
	}
	
	
}
