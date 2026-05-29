import java.util.Scanner;

public class Ejercicio2calculadora  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese número 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese número 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1 = Suma");
        System.out.println("2 = Resta");
        System.out.println("3 = Multiplicación");
        System.out.println("4 = División");

        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir entre cero");
                }
                break;

            default:
                System.out.println("Opción no válida");
        }

    }
}