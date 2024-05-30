public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método para imprimir la información de la persona
    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion);
    }
}
