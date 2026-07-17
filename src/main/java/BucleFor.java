public class BucleFor {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Numero: " + i);
        } // fin for

        String[] dias = {"LUN", "MAR", "MIE", "JUE", "VIE", "SAB", "DOM"};

        for (int i = 0; i < dias.length; i++) {
            System.out.println("indice numero: " + i + " es el dia de la semana: " + dias[i]);
        }
    } // fin function
} // fin class
