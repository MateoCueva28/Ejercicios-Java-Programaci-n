public class Automovil {
    private String marca = "MERCEDES BENZ";
    private String modelo;
    private String color = "Negro";
    private int cilindraje;
    private float consumo = 40;
    /*public void detalleauto(){
        Double cilindraje = 8.10 ;
        System.out.println(" Ingresa la marca del auto : " + marca);
        System.out.println("Ingresa el modelo del auto : " + modelo);
        System.out.println("Ingresa la marca del auto  : " + color);
        System.out.println("Ingresa el cilindraje del auto : " + this.cilindraje);

    }*/

    /*public void leerMarca(String marca){
        this.marca = marca;
    }

    public void escribirMarca (String marca){
        this.marca = marca;

    }*/

    //Getter and setter

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

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String detalleAuto() {
        /*StringBuilder sb = new StringBuilder();
        sb.append("La marca del auto es: "+ this.marca + " ");
        sb.append("auto.modelo = " + this.modelo + " ");
        sb.append("auto.color = " + this.color + " ");
        sb.append("auto.cilindraje = " + this.cilindraje + " ");
        return sb.toString();*/
        String dv = "La marca es -> " + this.marca + "\n"+
                "El modelo es -> " + this.modelo + "\n" +
                "El color es -> " + this.color + "\n" +
                "El cilindraje es -> " + this.cilindraje;
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
}
