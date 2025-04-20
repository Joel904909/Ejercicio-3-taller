public class Nodo {
    public String nombre;
    public int prioridad;
    public Nodo sig;

    public Nodo(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.sig = null;
    }
}
