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
        
        // finally

        try { // aca dentro va el codigo que posiblemente falle

            var result = 10 / 1;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("fin del metodo try catch");
        }
        System.out.println("Fin metodo catch");
        
        // throw example
        
        var throwExample = new TrowhExample();
        
        try {
            throwExample.checkAge(17);
        } catch (Exception e) {
            System.out.println("Error al obtener la edad: " + e.getMessage());
        }
        
        
        
    }
}
