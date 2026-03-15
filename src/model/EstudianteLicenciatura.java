package model;

public class EstudianteLicenciatura extends Estudiante {

    private String carrera;

    public EstudianteLicenciatura(String nombre, String matricula, double promedio, String carrera) {
        super(nombre, matricula, promedio);
        this.carrera = carrera;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
    }
}