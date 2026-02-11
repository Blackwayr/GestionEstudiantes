package app;

import model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Luis Chaires", "A123", 85);
        Estudiante estudiante2 = new Estudiante("Ana Lopez", "B456", 65);
System.out.println("=== model.Estudiante 1 ===");
estudiante1.mostrarInformacion();
System.out.println("¿Aprobo?: " + estudiante1.aprobo());

System.out.println();

System.out.println("===model.Estudiante 2 ===");
estudiante2.mostrarInformacion();
System.out.println("¿Aprobo?: " + estudiante2.aprobo());
;
    }
}
