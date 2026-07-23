package Exection;

public class Exceptions {

    public static void main(String[] args) {

        // manejo de excepciones 
        try { // aca dentro va el codigo que posiblemente falle

            var result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Fin");
    }
}
