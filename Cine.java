public class Cine {
    public static void main(String[] args) {

        // Definimos las variables
        boolean tieneEntrada = true;
        int edad = 16;
        
        if (tieneEntrada) {

            if (edad >= 18) {
                System.out.println("Puede entrar a cualquier película.");
            } else {
                System.out.println("Solo puede entrar a películas familiares.");
            }

        } else {
            System.out.println("No puede ingresar al cine.");
        }

    }
}