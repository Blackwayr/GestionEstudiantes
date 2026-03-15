package app;

import model.EstudianteLicenciatura;
import model.EstudiantePosgrado;
import model.Estudiante;

public class Main {

    public static void main(String[] args) {

        EstudianteLicenciatura estudiante1 =
                new EstudianteLicenciatura("Luis Chaires", "A123", 85, "Ingeniería en Sistemas");

        EstudiantePosgrado estudiante2 =
                new EstudiantePosgrado("Ana Lopez", "B456", 92, "Inteligencia Artificial");


        System.out.println("=== Estudiante de Licenciatura ===");
        estudiante1.mostrarInformacion();
        System.out.println("¿Aprobó?: " + estudiante1.aprobo());

        System.out.println();

        System.out.println("=== Estudiante de Posgrado ===");
        estudiante2.mostrarInformacion();
        System.out.println("¿Aprobó?: " + estudiante2.aprobo());
    }
}