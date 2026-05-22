import java.util.Scanner;

public class Ejercicio4{

    public static void main(String[] args) {

        int alumnos;
        double pagoAlumno, pagoCompania;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos: ");
        alumnos = s.nextInt();

        if (alumnos >= 100) {
            pagoAlumno = 65;
            pagoCompania = alumnos * pagoAlumno;
        }
        else if (alumnos >= 50) {
            pagoAlumno = 70;
            pagoCompania = alumnos * pagoAlumno;
        }
        else if (alumnos >= 30) {
            pagoAlumno = 95;
            pagoCompania = alumnos * pagoAlumno;
        }
        else {
            pagoCompania = 4000;
            pagoAlumno = pagoCompania / alumnos;
        }

        System.out.println("Cada alumno debe pagar: " + pagoAlumno + " euros");
        System.out.println("La escuela debe pagar a la compania: " + pagoCompania + " euros");

        s.close();

    }
}