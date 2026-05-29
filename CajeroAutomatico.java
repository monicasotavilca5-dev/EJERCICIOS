import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int saldo = 1000;
        int opcion;

        while (true) {

            System.out.println("\nSeleccione una opción");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Su saldo es: " + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese monto a depositar: ");
                    int deposito = sc.nextInt();

                    saldo = saldo + deposito;

                    System.out.println("Depósito realizado");
                    System.out.println("Nuevo saldo: " + saldo);
                    break;

                case 3:
                    System.out.print("Ingrese monto a retirar: ");
                    int retiro = sc.nextInt();

                    if (retiro <= saldo) {

                        saldo = saldo - retiro;

                        System.out.println("Retiro realizado");
                        System.out.println("Nuevo saldo: " + saldo);

                    } else {

                        System.out.println("Saldo insuficiente");
                    }

                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

            if (opcion == 4) {
                break;
            }

        }

    }
}
