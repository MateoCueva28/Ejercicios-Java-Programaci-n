public class Automovil {
    private String marca;
    private String modelo;
    private String color = "Verde";
    private String cilindraje;

    //Constructores

    public Automovil() {

    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Tiene el mismo nombre de la clase y comienza con mayuscula, no devuelve nada ya que reserva espaicos de memoria
    //No es necesario crear un set y get si se tiene uyn constructor con parametros
    //Metodos Get y Set

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodos propios y de calculo

    public String verDetalle(){
        String dv = "La marca es -> " + this.marca + "\n" +
                "El modelo es -> " + getModelo() + "\n" +
                "El color es -> " + getColor() + "\n" +
                "El cilindraje es -> " + getCilindraje() + "\n";
        return dv;
    }
    //Modificaicon de metodos nativos
}
//La clase principal sobre la cual se fundamenta toda la POO, se llama la clase Object
//Bycode, permite que java sea entendido entre varios lenguajes, es el punto intermedio entre el programa fuente y el objeto
