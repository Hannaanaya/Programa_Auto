package paquete;
public class Automovil {
    private String color;
    private String modelo;
    private String marca;
    private String matricula;
    public Automovil() //ATRIBUTOS
    {
        color= "rojo";
        modelo= "Prius";
        marca= "Toyota";
        matricula= "74B1a301";
    }
    //MÉTODOS
    public void encenderAutomovil()
    {
        System.out.println("Automovil encendido");
    }
    public void arrancarAutomovil()
    {
        System.out.println("El vehículo está en movimiento");
    }
    public void acelerarVelocidad()
    {
        System.out.println("Se ha incrementado la velocidad");
    }
    public void frenarAutomovil()
    {
        System.out.println("El auto se detuvo");
    }
    public String getColor() {
        return color;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMatricula() {
        return matricula;
    }
}
