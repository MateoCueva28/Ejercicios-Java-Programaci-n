//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil bmw = new  Automovil();
        //Automovil(); -> es un constructor
        bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Rojo");
        bmw.setCilindraje(3);
        System.out.println("bmw.getMarca() = " + bmw.getMarca());

        System.out.println("bmw.detalleAuto = " + bmw.detalleAuto());
        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar(kmph:89) = " + bmw.frenar(89));
        System.out.println("bmw.capacidadTanque(40,0.7f) = " + bmw.capacidadTanque(40,0.7f));
        System.out.println("bmw.capacidadTanque(40,0.7f) = " + bmw.capacidadTanque(40,70f));
        
    }
}