public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil renault=new Automovil("Sofasa Renault","Clio","Gris",2.0,50);


        Automovil mazda=new Automovil();
        mazda.setCilindraje(3.0);
        mazda.setColor("Verde");
        mazda.setFabricante("Mazda");
        mazda.setModelo("Mazda 3");

        System.out.println(renault.detalle());
        System.out.println();
        System.out.println(mazda.detalle());

        System.out.println();
        System.out.println(mazda.acelerar(200));
        System.out.println(renault.frenar());
        System.out.println(mazda.acelerarFrenar(3000));

        System.out.println();
        System.out.println(mazda.calcularConsumo(300,0.70f));

        System.out.println();
        System.out.println(renault.calcularConsumo(300, 0.70f));

        System.out.println();
        System.out.println("Son iguales? " + renault.equals(mazda));

        System.out.println();
        System.out.println(renault);





    }
}
