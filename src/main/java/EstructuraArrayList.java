import java.util.ArrayList;

// es mas flexible al Array
public class EstructuraArrayList {
    public static void main(String[] args) {
        // declaracion e inicializacion
        // Forma clásica (Java 5/6)
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Forma moderna (Java 7 en adelante) - El lado derecho se deja vacío <>
        ArrayList<String> names = new ArrayList<>();

        // tamaño
        System.out.println(names.size());

        // añadir elementos
        names.add("Alexis");
        names.add("Jacob");
        names.add("Fernando");
        System.out.println(names.size());

        // acceder al array
        System.out.println(names.get(1)); // 0, 1 (Jacob)
        System.out.println(names.getFirst()); // primer dato
        System.out.println(names.getLast()); // ultimo dato
        System.out.println(names.getClass()); // class

        // modificar los elementos
        names.set(1, "Alexito");
        System.out.println(names.get(1));

        // remove
        names.add("prueba de borrado");
        System.out.println(names);
        names.remove(names.getLast());
        System.out.println(names);

        // buscar
        System.out.println(names.contains("jacob")); // sensible a la mayusculas
        System.out.println(names.contains("Jacob"));

        // limpiar array
        names.clear();
        System.out.println(names);
    }
}
