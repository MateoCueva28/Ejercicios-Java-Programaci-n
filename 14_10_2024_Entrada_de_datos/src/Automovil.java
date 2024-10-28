public class Automovil {
    private String marca;
    private String modelo;
    private String color = "Verde";
    private String cilindraje;
    private float consumo = 40;
    static String tipo = "SUV";
    //Constructores

    public Automovil() {

    }

    public Automovil(String marca) {

        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, String color) {
        this(marca, modelo);
        this.color = color;
    }

    public Automovil(String marca, String modelo, String color, String cilindraje) {
        this(marca, modelo, color);
        this.cilindraje = cilindraje;
    }

    public Automovil(String marca, String modelo, String color, String cilindraje, float consumo) {
        this(marca, modelo, color, cilindraje);
        this.consumo = consumo;
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

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    //Metodos propios y de calculo

    public String verDetalle(){
        String dv = "La marca es -> " + this.marca + "\n" +
                "El modelo es -> " + getModelo() + "\n" +
                "El color es -> " + getColor() + "\n" +
                "El tipo de auto es -> " + Automovil.tipo + "\n" +
                "El cilindraje es -> " + getCilindraje() + "\n";
        return dv;
    }

    public String acelerar() {
        return "El auto marca + " + this.marca + "\t Está acelerando";

    }

    public String frenar(int kmph){
        return "El auto modelo + " + this.modelo +  "\tEsta frenando a -> " + kmph;
    }

    public float capacidadTanque(int cap, float porConsumo){
        float cm = consumo / (cap*porConsumo);
        return cm;
    }
    //Se puede usar dos métodos con el mismo nombre, siempre y cuando almenos uno de los parametros a recibir sea diferente (Sobrecarga de métodos)
    //Esto se llama polimorfismo
    //EL constructor es un metodo especial y tiene un mismo nombre que la clase
    public float capacidadTanque(int cap, int porConsumo){
        float cm = consumo / (cap*(porConsumo)/100);
        return cm;
    }
    //Modificacion de metodos nativos
}