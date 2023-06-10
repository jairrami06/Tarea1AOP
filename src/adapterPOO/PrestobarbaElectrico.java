package adapterPOO;

public class PrestobarbaElectrico {
	private boolean encendido;
	
	public PrestobarbaElectrico() {
		encendido = false;
	}

	public void encender() {
		System.out.println("Encendiendo");
		encendido = true;
	}
	
	public void rasurar () {
		System.out.println("Rasurando");
	}
	
	public void apagar() {
		System.out.println("Apagando");
		encendido = false;
	}
	
	public void cargarBateria() {
		System.out.println("Cargando bateria");
	}
	
	public void cambiarHojas() {
		System.out.println("Cambiando hojas");
	}

}

