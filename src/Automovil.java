import java.util.Objects;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindraje;
    private float capacidadTanque=40f;

    // Metodo constructor

    // Vacio


    public Automovil() {
    }

    // Con parametros

    public Automovil(String fabricante, String modelo, String color, double cilindraje, float capacidadTanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.capacidadTanque = capacidadTanque;
    }


    // Metodos getter y setter

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(float capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }


    // Metodos

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

    public float calcularConsumo(int km, float porcentajeCombustible){
        return km/(capacidadTanque*porcentajeCombustible);


    }

    // Sobre escritura de metodo equals

    @Override
    public boolean equals(Object obj) {

        // Valida que el objeto sea del mismo tipo
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil automovil=(Automovil) obj;
        return (this.fabricante != null && this.modelo !=null // Valida que exista el fabricante y el modelo
                &&this.fabricante.equals(automovil.fabricante) // Compara el fabricante y el modelo de ambos objetos
                && this.modelo.equals(automovil.modelo));
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + cilindraje +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
