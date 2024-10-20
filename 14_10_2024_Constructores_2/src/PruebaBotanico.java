public class PruebaBotanico {
    public static void main(String[] args) {
        /*Botanico rosas = new Botanico();
        rosas.setTipo("Rosas");
        rosas.setColor("Amarillo");
        rosas.setCantidad(15);
        rosas.setAroma("Si");
        rosas.setTamaño("Mediano");*/
        Botanico rosas = new Botanico("Rosas", "Amarillo", 15, "Si", "Mediano");
        System.out.println("rosas.detallePlanta() = " + rosas.detallePlanta());
        //System.out.println(rosas.detalleplanta_ordenado());

        Botanico claveles = new Botanico();
        claveles.setTipo("Claveles");
        claveles.setColor("Rosado");
        claveles.setCantidad(10);
        claveles.setAroma("SI");
        claveles.setTamaño("Grande");
        System.out.println("claveles.detallePlanta() = " + claveles.detallePlanta());
        //System.out.println(claveles.detalleplanta_ordenado());

        Botanico pinos = new Botanico();
        pinos.setTipo("Pino");
        pinos.setColor("Verde");
        pinos.setCantidad(5);
        pinos.setAroma("Si");
        pinos.setTamaño("Semilla");
        System.out.println("pinos.detallePlanta() = " + pinos.detallePlanta());
        //System.out.println(pinos.detalleplanta_ordenado());

        Botanico orquideas = new Botanico();
        orquideas.setTipo("Orquideas");
        orquideas.setColor("Morado");
        orquideas.setCantidad(12);
        orquideas.setAroma("Si");
        orquideas.setTamaño("Mediano");
        System.out.println("orquideas.detallePlanta() = " + orquideas.detallePlanta());
        //System.out.println(orquideas.detalleplanta_ordenado());
    }
}
