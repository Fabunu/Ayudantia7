package gestion;

public class Bicicleta extends Vehiculo {
	private String tipo_bici;

	public Bicicleta() {}
    public Bicicleta(String tipo_bici, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.tipo_bici = tipo_bici;
    }

    public String getTipo_bici() {
        return tipo_bici;
    }

    public void setTipo_bici(String tipo_bici) {
        this.tipo_bici = tipo_bici;
    }

	@Override
	public String mostrarDetalles() {
		return super.mostrarDetalles() + ", Tipo de bicicleta: " + tipo_bici;
	}


}