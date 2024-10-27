public class Automovil {
    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje;

    /*public void detalleauto(){
        Double cilindraje = 8.10 ;
        System.out.println(" Ingresa la marca del auto : " + marca);
        System.out.println("Ingresa el modelo del auto : " + modelo);
        System.out.println("Ingresa la marca del auto  : " + color);
        System.out.println("Ingresa el cilindraje del auto : " + this.cilindraje);

    }*/
    public String detalleauto() {
        StringBuilder sb = new StringBuilder();
        sb.append("La marca del auto es: "+ this.marca + " ");
        sb.append("auto.modelo = " + this.modelo + " ");
        sb.append("auto.color = " + this.color + " ");
        sb.append("auto.cilindraje = " + this.cilindraje + " ");
        return sb.toString();
    }
}
