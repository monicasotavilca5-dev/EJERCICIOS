public class Concierto {
    public static void main(String[] args) {

        boolean tieneEntrada = true;
        int edad = 16;
        boolean esVip = false;
        boolean acompañadoPorAdulto = true;

        if (tieneEntrada) {

            if (edad >= 18) {
                if (esVip) {
                    System.out.println("Ingreso a zona VIP");
                } else {
                    System.out.println("Ingreso a zona general");
                }
            } else {
                if (acompañadoPorAdulto) {
                    System.out.println("Ingreso permitido con acompañante");
                } else {
                    System.out.println("No puede ingresar solo");
                }
            }

        } else {
            System.out.println("No puede ingresar al concierto");
        }

    }
}
