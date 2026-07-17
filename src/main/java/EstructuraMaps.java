import java.util.HashMap;

public class EstructuraMaps {
    static void main() {
        // declaracion y creacion
        HashMap<String, String> names = new HashMap<>(); // clave => valor

        // tamaño
        System.out.println(names.size());

        // añadir elementos
        names.put("Nombre", "Alexis");
        names.put("Apellido", "Jacob");
        names.put("Sobrenombre", "Jhon");
        System.out.println(names);

        // acceder a elementos
        System.out.println(names.get("Nombre"));
        System.out.println(names.get("nombre")); // null

        // verificar si existe
        System.out.println(names.containsKey("Nombre")); // por clave
        System.out.println(names.containsKey("nombre")); // por clave

        System.out.println(names.containsValue("Alexis")); // por valor
        System.out.println(names.containsValue("alexis")); // por valor

        // eliminar elementos
        names.put("prueba", "existe");
        System.out.println(names);
        System.out.println(names.remove("prueba")); // retorna su valor pero borra su key

        // modificar valor
        names.put("Nombre", "Alexito");
        System.out.println(names); // si no existe lo crea
        names.replace("Apellido", "Jacobito"); // No crea nada
        names.replace("apellido", "Jacobitoooo");
        System.out.println(names);

        // limpiar maps
        HashMap<String, String> namesPrueba = new HashMap<>();
        namesPrueba.put("Nombre", "Alexis");
        namesPrueba.put("Apellido", "Jacob");
        namesPrueba.put("Sobrenombre", "Jhon");
        System.out.println(namesPrueba);

        namesPrueba.clear();
        System.out.println(namesPrueba);

    }
}
