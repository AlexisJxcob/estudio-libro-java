import java.util.Scanner;
public class SentenciaIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu edad");
        int edad = entrada.nextInt();
        System.out.println("sentenciaIf.main");
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, se ejecuta en true");
        } else{
            System.out.println("Eres menor de edad, se ejecuta en false");
        }
        System.out.println("Se ejecuta siempre");
    }
}