public class PruebaBici {
    public static void main(String[] args) {
        Bicicleta bmx = new Bicicleta();
        bmx.color = "Rojo";
        bmx.modelo = "Stranger";
        bmx.peso = 16;
        bmx.tipo = "BMX";
        /*System.out.println("bici.color = " + bmx.color);
        System.out.println("bici.modelo = " + bmx.modelo);
        System.out.println("bici.tipo = " + bmx.tipo);
        System.out.println("bici.peso = " + bmx.peso);*/
        System.out.println(bmx.detallebici());


        Bicicleta montaña = new Bicicleta();
        montaña.color = "Verde";
        montaña.modelo = "Hiker";
        montaña.tipo = "Montaña";
        montaña.peso = 14;
        //montaña.detallebici();
        System.out.println(montaña.detallebici());

    }
}
