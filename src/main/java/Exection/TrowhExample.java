package Exection;

public class TrowhExample {

    public void checkAge(int edad) throws IllegalArgumentException{  
        if (edad < 18) {
            throw new RuntimeException("Tienes que ser mayor de edad");
        } else {
            System.out.println("eres mayor de edad");
        }
    }
}
