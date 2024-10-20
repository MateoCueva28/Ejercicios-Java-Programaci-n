public class Bicicleta {
    String color = "Rojo";
    String modelo = "Stranger";
    String tipo = "BMX";
    int peso = 16 ;

    /*public void detallebici(){
        Integer peso = 12;
        System.out.println("EL color la bicicleta es : " + color);
        System.out.println("El modelo de la bicicleta es : " + modelo);
        System.out.println("El tipo de bicicleta es : " + tipo);
        System.out.println("El peso de la bicicleta es : : " + this.peso);
    }*/

    public String detallebici() {
        StringBuilder sb = new StringBuilder();
        sb.append("EL color la bicicleta es : " + this.color + " ");
        sb.append("El modelo de la bicicleta es : " + this.modelo + " " );
        sb.append("El tipo de bicicleta es : "+ this.tipo + " ");
        sb.append("El peso de la bicicleta es : "+ this.peso + " ");
        return sb.toString();
    }
}
