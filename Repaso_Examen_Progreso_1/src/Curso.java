import javax.swing.*;

public class Curso {
    public String nombreMateria;
    public String n1;
    public String n2;
    public String n3;

    //Constructores

    public Curso(){

    }

    //Getter y Setter


    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    //Métodos propios

    public String detalleCurso(){
        nombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia");
        return nombreMateria;
    }

    public String detalleNotas(){
        n1 = JOptionPane.showInputDialog(" Ingrese la primera nota: ");
        n2 = JOptionPane.showInputDialog(" Ingrese la segunda nota: ");
        n3 = JOptionPane.showInputDialog(" Ingrese la tercera nota: ");
        String dn = "La primera nota es : " + this.n1 + "\n" +
                  "La segunda nota es : " + this.n2 + "\n" +
                  "La tercera nota es : " + this.n3 + "\n";
        return dn;
    }
}
