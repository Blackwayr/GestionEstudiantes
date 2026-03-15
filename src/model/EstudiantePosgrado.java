package model;

public class EstudiantePosgrado extends Estudiante {

    private String especialidad;

    public EstudiantePosgrado(String nombre, String matricula, double promedio, String especialidad) {
        super(nombre, matricula, promedio);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }
}
