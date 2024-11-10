package gestion;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GestorDeDatos {
    private ObjectMapper mapper;

    public GestorDeDatos() {
        mapper = new ObjectMapper();
    }

    public List<Vehiculo> leerDatos(String archivo) {
        try {
            return mapper.readValue(new File(archivo), new TypeReference<List<Vehiculo>>() {});
        } catch (IOException e) {
            System.out.println("Error al leer datos: " + e.getMessage());
            return null;
        }
    }

    public void guardarDatos(String archivo, List<Vehiculo> vehiculos) {
        try {
            mapper.writeValue(new File(archivo), vehiculos);
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
