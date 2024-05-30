public class Main {
    public static void main(String[] args) {
        // Crear 5 instancias de la clase (quemar los valores)
        Persona persona1 = new Persona("Juan", 30, "Calle 1");
        Persona persona2 = new Persona("Ana", 25, "Calle 2");
        Persona persona3 = new Persona("Luis", 40, "Calle 3");
        Persona persona4 = new Persona("Maria", 35, "Calle 4");
        Persona persona5 = new Persona("Pedro", 28, "Calle 5");

        // Crear dos objetos con valores nulos y setear sus valores posteriormente
        Persona persona6 = new Persona(null, 0, null);
        Persona persona7 = new Persona(null, 0, null);

        // Setear valores de los objetos nulos
        persona6.setNombre("Carla");
        persona6.setEdad(22);
        persona6.setDireccion("Calle 6");

        persona7.setNombre("Miguel");
        persona7.setEdad(33);
        persona7.setDireccion("Calle 7");

        // Imprimir todos los objetos
        imprimirTodasPersonas(new Persona[]{persona1, persona2, persona3, persona4, persona5, persona6, persona7});

        // Modificar objetos previamente creados
        persona1.setNombre("Juan Modificado");
        persona2.setDireccion("Calle 2 Modificada");

        // Imprimir todos los objetos después de modificaciones
        imprimirTodasPersonas(new Persona[]{persona1, persona2, persona3, persona4, persona5, persona6, persona7});

        // Modificar todos los atributos de al menos tres objetos con el valor de NULL
        modificarATresPersonas(new Persona[]{persona3, persona4, persona5});

        // Imprimir todos los objetos después de modificar a NULL
        imprimirTodasPersonas(new Persona[]{persona1, persona2, persona3, persona4, persona5, persona6, persona7});
    }

    // Método para imprimir todos los objetos
    public static void imprimirTodasPersonas(Persona[] personas) {
        for (Persona persona : personas) {
            persona.imprimirInfo();
        }
    }

    // Método para modificar los atributos de tres personas a NULL
    public static void modificarATresPersonas(Persona[] personas) {
        for (Persona persona : personas) {
            persona.setNombre(null);
            persona.setEdad(0);
            persona.setDireccion(null);
        }
    }
}

