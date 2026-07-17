public class AccessModifiers {

    public static void main(String[] args) {
        // El encapsulamiento sirve para proteger los datos de una clase
        // y controlar su acceso desde el exterior mediante "puertas" (métodos).

        // Los Modificadores de Acceso definen quién tiene permiso de cruzar esas puertas.
    }
}

class EjemploModificadores {

    // 1. PUBLIC (Público)
    // -------------------------------------------------------------------------
    // - ¿Quién lo ve?: Todo el mundo (cualquier clase en cualquier paquete).
    // - Uso común: Métodos que quieres que otros usen (como tus getters, setters y el main).
    public String datoPublico = "Cualquiera puede verme y modificarme directamente";


    // 2. PROTECTED (Protegido)
    // -------------------------------------------------------------------------
    // - ¿Quién lo ve?: Las clases que están en el mismo paquete Y las clases
    //   hijas que hereden de esta clase (incluso si están en paquetes distintos).
    // - Uso común: Muy usado cuando entres al tema de Herencia (extends).
    protected String datoProtegido = "Solo me ven mis vecinos de paquete y mis hijos (herencia)";


    // 3. DEFAULT o PACKAGE-PRIVATE (Por defecto / De paquete)
    // -------------------------------------------------------------------------
    // - ¿Cómo se escribe?: No se escribe ninguna palabra clave (así como tenías 'int A, B' al principio).
    // - ¿Quién lo ve?: Únicamente las clases que están en el mismo paquete (misma carpeta).
    // - Uso común: Útil para proyectos pequeños donde todo vive en la misma carpeta.
    String datoDefault = "Solo me ven las clases que comparten mi mismo paquete";


    // 4. PRIVATE (Privado)
    // -------------------------------------------------------------------------
    // - ¿Quién lo ve?: ÚNICAMENTE la clase donde fue declarado. Nadie más.
    // - Uso común: La regla de oro del encapsulamiento. Todos tus atributos de clase
    //   deberían ser privados para que no los alteren sin control desde fuera.
    private String datoPrivado = "Nadie de afuera puede verme. Necesitan un Getter/Setter";

}
