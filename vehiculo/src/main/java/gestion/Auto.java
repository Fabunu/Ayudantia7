package  gestion;

public class Auto extends Vehiculo {
	private int numero_de_puertas;

	public Auto() {}
	
	public Auto(String marca, String modelo, int año, double precio, int numero_de_puertas) {
		super(marca, modelo, año, precio);
		this.numero_de_puertas = numero_de_puertas;
	}

    public int getNumero_de_puertas() {
        return numero_de_puertas;
    }

    public void setNumero_de_puertas(int numero_de_puertas) {
        this.numero_de_puertas = numero_de_puertas;
    }

	@Override

	public String mostrarDetalles() {
		return super.mostrarDetalles() + ", Numero de puertas: " + numero_de_puertas;
	}
}