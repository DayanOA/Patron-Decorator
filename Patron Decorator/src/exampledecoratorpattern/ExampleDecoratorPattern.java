package exampledecoratorpattern;

import com.sun.imageio.spi.RAFImageInputStreamSpi;

public class ExampleDecoratorPattern {

    //Cliente
    public static void main(String[] args) {
//        VentaAuto automovil = new BMW();
//        automovil = new Mp4Player(automovil);.....
//        automovil = new LlantasLujo(automovil);......
//        automovil = new AireAcondicionado(automovil);......
//        automovil = new VidriosElectricos(automovil);.......
//        automovil = new Radio(automovil);......
//        automovil = new GPS(automovil);.....
//        automovil = new Polarizado(automovil);.......
//        automovil = new Blindaje(automovil);......
//
//        System.out.println(automovil.getDescription());
//        System.out.println("Su precio es: $" + automovil.getPrice());
        
        
VentaAuto auto = new Mazda3();
        auto = new Blindaje(auto);
        auto = new DVD(auto);
        auto = new AireAcondicionado(auto);
        
        System.out.println("* Su descripcion es: " + auto.getDescription());
        System.out.println("Su precio es: " + auto.getPrice());
        
        
        
        VentaAuto auto1 = new ChevroletSail();
        auto1 = new VidriosElectricos(auto1);
        auto1 = new Polarizado(auto1);
        
        System.out.println("\n * Su descripcion es: " + auto1.getDescription());
        System.out.println("Su precio es: " + auto1.getPrice());


        VentaAuto auto2 = new BMW();
        auto2 = new LlantasLujo(auto2);
        
        System.out.println("\n * Su descripcion es: " + auto2.getDescription());
        System.out.println("Su precio es: " + auto2.getPrice());
        
        
        
        VentaAuto auto3 = new ChevroletSprint();
        auto3 = new Mp4Player(auto3);
        auto3 = new Radio(auto3);
        auto3 = new Basico(auto3);
        auto3 = new GPS(auto3);
        System.out.println("\n *Su descripcion es: " + auto3.getDescription());
        System.out.println("Su precio es: " + auto3.getPrice());
       
    } 

}
