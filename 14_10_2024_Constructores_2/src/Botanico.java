public class Botanico {
    private String tipo;
    private String color;
    private Integer cantidad;
    private String aroma;
    private String tamaño;
    static String planta = "Planta";

    //Constructores

    public Botanico (){

    }

    public Botanico(String tipo) {
        this.tipo = tipo;
    }

    public Botanico(String tipo, String color) {
        this(tipo);
        this.color = color;
    }

    public Botanico(String tipo, String color, Integer cantidad) {
        this(tipo, color);
        this.cantidad = cantidad;
    }

    public Botanico(String tipo, String color, Integer cantidad, String aroma) {
        this(tipo, color, cantidad);
        this.aroma = aroma;
    }

    public Botanico(String tipo, String color, Integer cantidad, String aroma, String tamaño) {
        this(tipo, color, cantidad, aroma);
        this.tamaño = tamaño;
    }

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

    public String detallePlanta() {
        /*System.out.println(" El tipo de planta es: " + tipo);
        System.out.println(" El color de la planta es : " + color);
        System.out.println(" La cantidad de la planta solicitada es  : " + cantidad);
        System.out.println(" La planta tiene aroma? : " + aroma);
        System.out.println(" De que tamaño desea su planta " + tamaño);*/
        String res = "El tipo es -> " + this.tipo + "\n"+
                "Es una -> " + Botanico.planta + "\n" +
                "El color es -> " + this.color + "\n" +
                "La cantidad es -> " + this.cantidad + "\n" +
                " Tiene aroma? -> " + this.aroma + "\n" +
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
}



