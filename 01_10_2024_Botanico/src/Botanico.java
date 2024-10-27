public class Botanico {
    String tipo;
    String color;
    Integer cantidad;
    String aroma;
    String tamaño;

    public void detalleplanta() {
        System.out.println(" El tipo de planta es: " + tipo);
        System.out.println(" El color de la planta es : " + color);
        System.out.println(" La cantidad de la planta solicitada es  : " + cantidad);
        System.out.println(" La planta tiene aroma? : " + aroma);
        System.out.println(" De que tamaño desea su planta " + tamaño);
    }

    public String detalleplanta_ordenado(){
        StringBuilder sb = new StringBuilder();
        sb.append(" Tipo : "+ this.tipo + " ");
        sb.append(" Color : " + this.color + " ");
        sb.append(" Cantidad : " + this.cantidad + " ");
        sb.append(" Aroma : " + this.aroma + " ");
        sb.append(" Tamaño : " + this.tamaño + " ");
        return sb.toString();
    }
}
