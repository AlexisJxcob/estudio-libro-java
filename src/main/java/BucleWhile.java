import java.util.HashMap;

public class BucleWhile {
    static void main() {
        int num = 0;

        while (num < 5) {
            System.out.println("Numero: " + num);
            num++;
        }

        // para un array
        String[] dias = {"LUN", "MAR", "MIE", "JUE", "VIE", "SAB", "DOM"};

        int i = 0;
        while (i < dias.length) {
            System.out.println(dias[i]);
            i++;
        }

        i = 0;
        while (i < dias.length) {
            if (dias[i].equals("MIE")){
                i+=2;
            }
            System.out.println(dias[i]);
            i++;
        }
    }
}
