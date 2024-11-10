package gestion;

public class Camion extends Vehiculo {
	private int capacidad_carga;

	public Camion() {}
    public Camion(int capacidad_carga, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.capacidad_carga = capacidad_carga;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

	@Override
	public String mostrarDetalles() {
		return super.mostrarDetalles() + ", Capacidad de carga: " + capacidad_carga + "toneladas";
	}

}