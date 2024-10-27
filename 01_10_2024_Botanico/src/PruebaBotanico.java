public class PruebaBotanico {
    public static void main(String[] args) {
        Botanico rosas = new Botanico();
        rosas.tipo = "Rosas";
        rosas.color = "Amarillo";
        rosas.cantidad = 15;
        rosas.aroma = "Si";
        rosas.tamaño = "Mediano";
        rosas.detalleplanta();
        System.out.println(rosas.detalleplanta_ordenado());

        Botanico claveles = new Botanico();
        claveles.tipo = "Claveles";
        claveles.color = "Rosado";
        claveles.cantidad = 10;
        claveles.aroma = "Si";
        claveles.tamaño = "Grande";
        claveles.detalleplanta();
        System.out.println(claveles.detalleplanta_ordenado());

        Botanico pinos = new Botanico();
        pinos.tipo = "Pino";
        pinos.color = "Verde";
        pinos.cantidad = 5;
        pinos.aroma = "Si";
        pinos.tamaño = "Semilla";
        pinos.detalleplanta();
        System.out.println(pinos.detalleplanta_ordenado());

        Botanico orquideas = new Botanico();
        orquideas.tipo = "Orquideas";
        orquideas.color = "Morado";
        orquideas.cantidad = 12;
        orquideas.aroma = "Si";
        orquideas.tamaño = "Mediano";
        orquideas.detalleplanta();
        System.out.println(orquideas.detalleplanta_ordenado());
    }
}
