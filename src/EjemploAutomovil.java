public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil renault=new Automovil();
        renault.cilindraje=2.0;
        renault.color="Gris";
        renault.fabricante="Sofasa Renault";
        renault.modelo="Clio";

        Automovil mazda=new Automovil();
        mazda.cilindraje=3.0;
        mazda.color="Verde";
        mazda.fabricante="Mazda";
        mazda.modelo="Mazda 3";


        System.out.println(renault.detalle());
        System.out.println();
        System.out.println(mazda.detalle());

        System.out.println();
        System.out.println(mazda.acelerar(200));
        System.out.println(renault.frenar());
        System.out.println(mazda.acelerarFrenar(100));




    }
}
