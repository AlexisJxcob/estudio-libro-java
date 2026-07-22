package com.estudios.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class FuncionesMetodos {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            sendEmail();
        }

        sendEmailToUser("java@gmail.com");

        var users = new ArrayList<>(Arrays.asList("java@gmail.com", "java1@gmail.com", "java2@gmail.com"));
        sendEmailToUser(users);
        var state = sendEmailToUserWhitState("javadoc@gmail.com");
        System.out.println(state);
        System.out.println(sendEmailToUserWhitState("")); // email vacio
    }

    // function sin parametros ni retornos
    public static void sendEmail() {
        System.out.println("Se envia email");
    }

    // function con parametros y no retornos
    public static void sendEmailToUser(String email) {
        System.out.println("Se envia email a: " + email);
    }

    //sobrecarga es cuando tenemos misma funciones pero con comportamientos diferentes
    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email: emails) {
            System.out.println("Email enviado a: " + email);
        }
    }

    // function con retorno
    public static boolean sendEmailToUserWhitState(String email) {
        if (email == null || email.isBlank()) {
            System.out.println("El email es nulo");
            return false;
        }
        System.out.println("Se envia email a : " + email );

        return true;
    }
}
