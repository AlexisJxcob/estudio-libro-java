import java.util.ArrayList;
import java.util.Arrays;

public class FuncionesMetodos {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            sendEmail();
        }

        sendEmailToUser("java@gmail.com");

        sendEmailToUser("java@gmail.com", "javadoc");

        var users = new ArrayList<>(Arrays.asList("java@gmail.com", "java1@gmail.com", "java2@gmail.com"));
        sendEmailToUser(users);
    }

    // function sin parametros ni retornos
    public static void sendEmail() {
        System.out.println("Se envia email");
    }

    // function con parametros
    public static void sendEmailToUser(String email) {
        System.out.println("Se envia email a: " + email);
    }

    //sobrecarga es cuando tenemos misma funciones pero con comportamientos diferentes
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envia email a: " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email: emails) {
            System.out.println("Email enviado a: " + email);
        }
    }
}
