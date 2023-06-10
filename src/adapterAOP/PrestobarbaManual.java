package adapterAOP;

public class PrestobarbaManual extends Prestobarba{

	public PrestobarbaManual() {
		super();
	}

	@Override
	public void rasurar() {
		System.out.println("Rasurando");
	}

	@Override
	public void mantenimiento() {
		System.out.println("Cambiando hojas");
	}
}
