package Programacion2P2.GuiadoSemana9.vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Datos iniciales de ejemplo
        Propietario propInicial = new Propietario("Carlos Mendoza", "1712345678");
        vehiculos.add(new Automovil("Toyota", "Corolla", 2022, propInicial, 4));

        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DE VEHÍCULOS ===");
            System.out.println("1. Registrar automóvil");
            System.out.println("2. Registrar motocicleta");
            System.out.println("3. Listar todos los vehículos");
            System.out.println("4. Buscar vehículos por documento de propietario");
            System.out.println("5. Salir");

            opcion = leerEnteroEnRango(sc, "Elige una opción (1-5): ", 1, 5);

            switch (opcion) {
                case 1:
                    registrarAutomovil(sc, vehiculos);
                    break;
                case 2:
                    registrarMotocicleta(sc, vehiculos);
                    break;
                case 3:
                    listarVehiculos(vehiculos);
                    break;
                case 4:
                    buscarPorPropietario(sc, vehiculos);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        } while (opcion != 5);

        sc.close();
    }

    private static void registrarAutomovil(Scanner sc, ArrayList<Vehiculo> vehiculos) {
        Propietario propietario = leerPropietario(sc);
        String marca = leerTextoNoVacio(sc, "Marca: ");
        String modelo = leerTextoNoVacio(sc, "Modelo: ");
        int anio = leerEnteroEnRango(sc, "Año (1950-2027): ", 1950, 2027);
        int puertas = leerEnteroEnRango(sc, "Número de puertas (2-6): ", 2, 6);

        vehiculos.add(new Automovil(marca, modelo, anio, propietario, puertas));
        System.out.println("Automóvil registrado correctamente.");
    }

    private static void registrarMotocicleta(Scanner sc, ArrayList<Vehiculo> vehiculos) {
        Propietario propietario = leerPropietario(sc);
        String marca = leerTextoNoVacio(sc, "Marca: ");
        String modelo = leerTextoNoVacio(sc, "Modelo: ");
        int anio = leerEnteroEnRango(sc, "Año (1950-2027): ", 1950, 2027);
        int cilindraje = leerEnteroEnRango(sc, "Cilindraje en cc (50-2500): ", 50, 2500);

        vehiculos.add(new Motocicleta(marca, modelo, anio, propietario, cilindraje));
        System.out.println("Motocicleta registrada correctamente.");
    }

    private static Propietario leerPropietario(Scanner sc) {
        String nombre = leerTextoNoVacio(sc, "Nombre del propietario: ");
        String documento = leerTextoNoVacio(sc, "Documento del propietario: ");
        return new Propietario(nombre, documento);
    }

    private static void listarVehiculos(ArrayList<Vehiculo> vehiculos) {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }
        System.out.println("\n--- Vehículos registrados (" + vehiculos.size() + ") ---");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i).obtenerDatosCompletos());
        }
    }

    private static void buscarPorPropietario(Scanner sc, ArrayList<Vehiculo> vehiculos) {
        String docBuscado = leerTextoNoVacio(sc, "Ingresa el documento del propietario: ");
        boolean encontrado = false;

        for (Vehiculo v : vehiculos) {
            if (v.getPropietario().getDocumento().equalsIgnoreCase(docBuscado)) {
                System.out.println(v.obtenerDatosCompletos());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron vehículos para el documento: " + docBuscado);
        }
    }

    private static String leerTextoNoVacio(Scanner sc, String mensaje) {
        String texto;
        do {
            System.out.print(mensaje);
            texto = sc.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("El campo no puede estar vacío.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    private static int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine().trim();
            try {
                int valor = Integer.parseInt(entrada);
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.println("Ingresa un número entre " + min + " y " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Escribe un número entero.");
            }
        }
    }
}
