public class Botanico {
    private String tipo;
    private String color;
    private Integer cantidad;
    private String aroma;
    private String tamaño;

    public String detallePlanta() {
        /*System.out.println(" El tipo de planta es: " + tipo);
        System.out.println(" El color de la planta es : " + color);
        System.out.println(" La cantidad de la planta solicitada es  : " + cantidad);
        System.out.println(" La planta tiene aroma? : " + aroma);
        System.out.println(" De que tamaño desea su planta " + tamaño);*/
        String res = "La marca es -> " + this.tipo + "\n"+
                "El color es -> " + this.color + "\n" +
                "El modelo es -> " + this.cantidad + "\n" +
                "El cilindraje es -> " + this.aroma +
                "El tamaño es -> " + this.tamaño + "\n";
        return res;
    }

    /*public String detalleplanta_ordenado(){
        StringBuilder sb = new StringBuilder();
        sb.append(" Tipo : "+ this.tipo + " ");
        sb.append(" Color : " + this.color + " ");
        sb.append(" Cantidad : " + this.cantidad + " ");
        sb.append(" Aroma : " + this.aroma + " ");
        sb.append(" Tamaño : " + this.tamaño + " ");
        return sb.toString();
    }*/

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
