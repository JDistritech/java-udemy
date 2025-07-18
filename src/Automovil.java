public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindraje;

    public String detalle(){

        return "Modelo: " + this.modelo +
                "\nFabricante: " + this.fabricante +
                "\nColor: " + this.color +
                "\nCilindraje: " + this.cilindraje;

    }

    public String acelerar(int rpm){

        return "El auto "+this.fabricante+" está acelerando a "+rpm+" rpm";

    }

    public String frenar(){

        return "El auto "+this.fabricante+" del modelo "+this.modelo+" está frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar=this.acelerar(rpm);
        String frenar=this.frenar();

        return acelerar(rpm)+"\n"+frenar();
    }

}
