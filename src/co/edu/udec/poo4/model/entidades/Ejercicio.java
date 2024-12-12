
package co.edu.udec.poo4.model.entidades;


public class Ejercicio {
    
    
    private String nombre;
    private int repeticiones;
    private int series;
    
    
    //constructor
    public Ejercicio(String nombre, int repeticiones, int series) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }
    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    
    @Override
     public String toString() {
        return "Ejercicio: " + nombre + ", Repeticiones: " + repeticiones + ", Series: " + series;
    }
}
