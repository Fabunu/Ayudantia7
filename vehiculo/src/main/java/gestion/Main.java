package gestion;

public class Main {
    public static void main(String[] args) {
        Automotora automotora = new Automotora();
        
        // Ruta del archivo JSON
        String rutaArchivo = "/home/fabu/Escritorio/Ayudantia7/vehiculos.json";
        
        // Cargar datos desde el archivo JSON
        automotora.cargarDatos(rutaArchivo);

        // Mostrar los vehículos cargados
        System.out.println(automotora.listarAutos());
        System.out.println(automotora.listarCamiones());
        System.out.println(automotora.listarBicicletas());
    }
}
