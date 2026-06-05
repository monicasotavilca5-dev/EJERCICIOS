import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cantidadVentas = 0;
        double totalVendido = 0;
        double ventaMasAlta = 0;
        double ventaMasBaja = 0;
        double montoVenta;

        System.out.println("--- REGISTRO DE VENTAS DIARIAS ---");

        while (true) {
            System.out.print("Venta: ");
            montoVenta = teclado.nextDouble();

            if (montoVenta == 0) {
                break;
            }

            if (montoVenta < 0) {
                System.out.println("Error: El monto de una venta no puede ser negativo.");
                continue; 
            }

            if (cantidadVentas == 0) {
                ventaMasAlta = montoVenta;
                ventaMasBaja = montoVenta;
            } else {
                if (montoVenta > ventaMasAlta) {
                    ventaMasAlta = montoVenta;
                }
                if (montoVenta < ventaMasBaja) {
                    ventaMasBaja = montoVenta;
                }
            }
            totalVendido += montoVenta; 
            cantidadVentas++;        
        }
        System.out.println("\n");
        if (cantidadVentas > 0) {
            double promedio = totalVendido / cantidadVentas;

            System.out.println("Cantidad de ventas: " + cantidadVentas);
            System.out.println("Venta mayor: " + ventaMasAlta);
            System.out.println("Venta menor: " + ventaMasBaja);
            System.out.println("Total vendido: " + totalVendido);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se registraron ventas durante el día.");
        }
        System.out.println("");

        teclado.close();
    }
}