package gestion;

import java.util.ArrayList;
import java.util.List;

public class Automotora {
	private List<Vehiculo> vehiculos;
	
	public Automotora() {
		vehiculos = new ArrayList<>();
	}

	public String agregarAuto(String marca, String modelo, int año, double precio, int numero_de_puertas) {
		Auto auto = new Auto(marca, modelo, año, precio, numero_de_puertas);
		vehiculos.add(auto);
		return "Auto agregado: " + auto.getMarca() + "" + auto.getModelo();
	}

	public String listarAutos() {
		StringBuilder listaAutos = new StringBuilder("Lista de autos:\n");
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Auto) {
				listaAutos.append(vehiculo.mostrarDetalles()).append("\n");
			}
		}
		return listaAutos.toString();
	}

	public String mostrarDetallesAuto() {
		StringBuilder mostrarDetallesAuto = new StringBuilder("Detalles de cada auto:\n");
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Auto) {
				mostrarDetallesAuto.append(vehiculo.mostrarDetalles()).append("\n");
        	}
    	}
    	return mostrarDetallesAuto.toString();
	}	

	public String agregarCamion(String marca, String modelo, int año, double precio, int capacidad_carga) {
		Camion camion = new Camion(capacidad_carga, marca, modelo, año, precio);
		vehiculos.add(camion);
		return "Camion agregado: " + camion.getMarca() + camion.getModelo();
	}

	public String listarCamiones() {
		StringBuilder listaCamiones = new StringBuilder("Lista de autos:\n");
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Camion) {
				listaCamiones.append(vehiculo.mostrarDetalles()).append("\n");
			}
		}
		return listaCamiones.toString();
	}

	public String mostrarDetallesCamion() {
		StringBuilder mostrarDetallesCamion = new StringBuilder("Detalles de cada camion:\n");
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Camion) {
				mostrarDetallesCamion.append(vehiculo.mostrarDetalles()).append("\n");
			}
		}
		return mostrarDetallesCamion.toString();
	}

	public String agregarBicicleta(String marca, String modelo, int año, double precio, String tipo_bici) {
		Bicicleta bicicleta = new Bicicleta(tipo_bici, marca, modelo, año, precio);
		vehiculos.add(bicicleta);
		return "Bicicleta agregada: " + bicicleta.getMarca() + bicicleta.getModelo();
	}

	public String listarBicicletas() {
		StringBuilder listaBicicleta = new StringBuilder("Lista de bicicletas:\n");
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Bicicleta) {
				listaBicicleta.append(vehiculo.mostrarDetalles()).append("\n");
			}
		}
		return listaBicicleta.toString();
	}

	public String mostrarDetallesBicicleta() {
		StringBuilder mostrarDetallesBicicleta = new StringBuilder("Detalles de cada bicicleta:\n");
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Bicicleta) {
				mostrarDetallesBicicleta.append(vehiculo.mostrarDetalles()).append("\n");
			}
		}
		return mostrarDetallesBicicleta.toString();
	}

	public void cargarDatos(String rutaArchivo) {
        GestorDeDatos gestor = new GestorDeDatos();
        List<Vehiculo> datosCargados = gestor.leerDatos(rutaArchivo);
        if (datosCargados != null) {
            vehiculos = datosCargados;
        }
    }

	public void guardarDatos(String rutaArchivo) {
        GestorDeDatos gestor = new GestorDeDatos();
        gestor.guardarDatos(rutaArchivo, vehiculos);
    }
}