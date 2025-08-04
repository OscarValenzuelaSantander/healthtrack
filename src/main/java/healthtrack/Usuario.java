package healthtrack;

public class Usuario {
    private String nombre;
    private double peso;

    public Usuario(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    /**
     * Actualiza el peso del usuario con el valor recibido como parámetro.
     * @param nuevoPeso Nuevo peso del usuario (debe ser un valor positivo)
     */
    public void actualizarPeso(double nuevoPeso) {
        if (nuevoPeso > 0) {
            this.peso = nuevoPeso;
        } else {
            throw new IllegalArgumentException("El peso debe ser un valor positivo.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre + ", Peso Actual: " + peso + " kg");
    }
}
