public class Principal {
    public static void main(String[] args) {
        //Automovil bmw = new Automovil( "BMW");
        Automovil bmw = new Automovil("BMW", "i320", "Negro", "3");
        /*bmw.setMarca("BMW");
        bmw.setModelo("i22");
        bmw.setColor("Negro");
        bmw.setCilindraje("2000");*/

        System.out.println("bmw.verDetalle() = " + bmw.verDetalle());

        Automovil bmw2 = new Automovil("Mercedes", "ML200");
        bmw.setMarca("BMW");
        bmw.setModelo("i22");
        bmw2.setColor("Negro");
        bmw2.setCilindraje("2000");

        System.out.println("bmw.verDetalle() = " + bmw2.verDetalle());
    }
    //Compara dos cosas: BMW y BMW2; System.out.println(bmw.equals(bmw2));
}