package paquete;

public class Programa {
    public static void main(String[] args) {
        Automovil a;
        a = new Automovil();

        System.out.println("Color: " + a.getColor());
        System.out.println("Marca: " + a.getMarca());
        System.out.println("Modelo: " + a.getModelo());
        System.out.println("Matricula: " + a.getMatricula());

        a.encenderAutomovil();
        a.arrancarAutomovil();
        a.acelerarVelocidad();
        a.frenarAutomovil();
    }
}