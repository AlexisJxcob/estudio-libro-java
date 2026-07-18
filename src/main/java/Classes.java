public class Classes {
    // las clases son una especie de plantilla basicamente un objeto
    static void main() {
    // un objeto es un estncia de un objeto
        var person = new Person("Alexito", 21, "18047215-0"); // ahora esta clase paso a ser un objeto
        // como esta hecho con constructor me obliga a inicializarlo con datos

        // person.name = "Alex"; name ahora es de acceso privado en Person class y da error
        // person.name = "Alexis"; ya no es necesario pq el constructor me obliga a poner los parametros correspondientes
        // person.age = 21;
        person.sayHello();
        System.out.println(person.getDni());
        System.out.println(person.setAge(22););
    }

}

