package model;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double promedio;

    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + promedio);
    }

    public boolean aprobo() {
        return promedio >= 70;
    }
}


