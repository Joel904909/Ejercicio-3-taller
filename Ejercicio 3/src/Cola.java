public class Cola {
    public Nodo frente, finalCola;

    public Cola() {
        frente = null;
        finalCola = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void insertarConPrioridad(String nombre, int prioridad) {
        Nodo nuevo = new Nodo(nombre, prioridad);

        if (estaVacia() || prioridad < frente.prioridad) {
            nuevo.sig = frente;
            frente = nuevo;
        } else {
            Nodo actual = frente;
            while (actual.sig != null && actual.sig.prioridad <= prioridad) {
                actual = actual.sig;
            }
            nuevo.sig = actual.sig;
            actual.sig = nuevo;
        }
    }

    public String atenderPacientes() {
        StringBuilder salida = new StringBuilder();
        while (!estaVacia()) {
            salida.append(frente.nombre)
                    .append(" ha sido atendido (prioridad ")
                    .append(frente.prioridad)
                    .append(").\n");
            frente = frente.sig;
        }
        return salida.toString();
    }
}
