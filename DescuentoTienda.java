public class DescuentoTienda {
    public static void main(String[] args) {

        double montoCompra = 150.0;
        boolean tieneMembresia = true;

        if (montoCompra > 100) {

            if (tieneMembresia) {
                System.out.println("Descuento del 20%");
            } else {
                System.out.println("Descuento del 10%");
            }

        } else {
            System.out.println("No aplica descuento");
        }

    }
}
