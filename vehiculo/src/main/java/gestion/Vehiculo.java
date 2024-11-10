package gestion;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Auto.class, name = "Auto"),
    @JsonSubTypes.Type(value = Camion.class, name = "Camion"),
    @JsonSubTypes.Type(value = Bicicleta.class, name = "Bicicleta")
})

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private double precio;


	public Vehiculo() {}

	public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String mostrarDetalles() {
		return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Precio: $" + precio;
	}
}