public class Person {

    // atributos
    // se acceden con Person.
    private final String name;
    private int age;
    final private String dni; // sirve para que no se modifique en otros lados, ya que es un dato sensible

    // constructores
    // es un mecanismo de inicialización
    public Person(String name, int age, String dni) {
        this.name = name; // Con this. Llamamos al age y name de la class person algo asi como el padre
        this.setAge(age); // se pone asi porque hay un criterio para la edad
        this.dni = dni;
    }

    // functions métodos
    public void sayHello() {
        System.out.println("hola, soy " + name + " y tengo " + age + " años y mi numero de dni es: " + dni);
    }

    // getter
    public String getDni(){
        return dni; // permite acceder al dato desde otras partes
    }

    // setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no valida");
        }
    }
}
