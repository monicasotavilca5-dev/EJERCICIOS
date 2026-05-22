import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numero;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero = s.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }

    }
}
