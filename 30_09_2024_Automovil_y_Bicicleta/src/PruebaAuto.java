public class PruebaAuto {
    public static void main(String[] args) {
        Automovil bmw = new Automovil();
        bmw.marca ="BMW";
        bmw.modelo = "i320";
        //bmw.color = "Blanco";
        bmw.cilindraje = 3.2;
        /*System.out.println("La marca del auto es : "+bmw.marca);
        System.out.println("auto.modelo = " + bmw.modelo);
        System.out.println("auto.color = " + bmw.color);
        System.out.println("auto.cilindraje = " + bmw.cilindraje);*/
        System.out.println(bmw.detalleauto());

        Automovil mb = new Automovil();
        mb.marca = "Mercedes Benz";
        mb.modelo = "ML200";
        mb.color = "Azul";
        mb.cilindraje = 2.50;
        //mb.detalleauto();
        System.out.println(mb.detalleauto());


    }
}
