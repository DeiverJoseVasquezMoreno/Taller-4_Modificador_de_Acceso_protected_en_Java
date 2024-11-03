package pruebas;

import vehiculos.Moto;

public class TestVehiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("Motocicleta", "Yamaha", 250);
        // moto.tipo; // Error de compilación: The field Vehiculo.tipo is not visible
        // moto.mostrarDetalles(); // Error de compilación: The method mostrarDetalles() from the type Moto is not visible
    }
}
