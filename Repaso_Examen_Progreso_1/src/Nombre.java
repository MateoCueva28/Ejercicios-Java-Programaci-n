import javax.swing.*;

public class Nombre {
    public String nombre;
    public String codigo;

    //Constructores

    public Nombre (){

    }

    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    public Nombre(String nombre, String codigo) {
        this(nombre);
        this.codigo = codigo;
    }

    // Getter y Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //Métodos propios

    public String nombreEstudiante(){
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiantee : ");
        return nombre;
    }

    public String idBanner(){
        codigo = JOptionPane.showInputDialog("Ingrese el ID Banner del estudiante: ");
        return codigo;
    }
}
