import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        Nombre estudiante = new Nombre();
        Curso curso = new Curso();


        System.out.println(universidad.detalleUni());


        String nombreEstudiante = estudiante.nombreEstudiante();
        String codigoEstudiante = estudiante.idBanner();
        System.out.println("El nombre del estudiante es -> " + nombreEstudiante);
        System.out.println("El ID del estudiante es -> " + codigoEstudiante);


        String nombreMateria = curso.detalleCurso();
        System.out.println("El nombre del curso es -> " + nombreMateria);


        String notas = curso.detalleNotas();
        System.out.println("Detalles de las notas:\n" + notas);
    }
}