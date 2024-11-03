public class TestEmpleado {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura", 5000.0, "Ventas");
        gerente.mostrarInformacion(); // Accede a los métodos y propiedades protegidas
    }
}
