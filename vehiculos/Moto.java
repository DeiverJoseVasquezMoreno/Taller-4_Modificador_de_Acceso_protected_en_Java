package vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    protected void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
