import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        double saldo = 1000;                    
        double monto;                             
        System.out.println("Bienvenido al Cajero");

        while (saldo > 0) {

            System.out.println("\nSaldo actual: S/" + saldo);
            System.out.print("¿Cuánto deseas retirar? (O digita 0 para salir): ");
            monto = teclado.nextDouble(); 
            if (monto == 0) {
                System.out.println("Saliendo del sistema");
                break; 
            }
            if (monto < 0) {
                System.out.println("Error: No puedes retirar montos negativos");
            } 
            else if (monto > saldo) {
                System.out.println("Error: Fondos insuficientes.");
            }
            else {
                saldo = saldo - monto; 
                System.out.println("¡Retiro exitoso!");
            }
        }
        System.out.println("\n-");
        System.out.println("Operación terminada.");
        System.out.println("Tu saldo final es: S/" + saldo);
        System.out.println("");

        
    }
}