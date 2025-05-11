import java.util.Scanner;
public class moto extends vehiculo{

    String motor;

    public moto(Double kilometraje, int ruedas, String tipo, String marca, String motor){
        
        super(kilometraje, ruedas, tipo, marca);
        this.motor=motor;

    }

    public static void main(String[] args) {
        
        moto moto_in = new moto(null, 0, null, null, null);
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kilometraje de la moto: ");
        moto_in.kilometraje = lector.nextDouble();

        System.out.println("Ingrese la cantidad de ruedas de la moto: ");
        moto_in.ruedas = lector.nextInt();

        System.out.println("Ingrese el tipo de la moto: ");
        moto_in.tipo = lector.next();

        System.out.println("Ingrese la marca de la moto: ");
        moto_in.marca = lector.next();

        System.out.println("Ingrese el tipo de motor de la moto: ");
        moto_in.motor = lector.next();

        System.out.println(moto_in);
        lector.close();

    }

    @Override
    public String toString() {
        
        return "Kilometraje: " + kilometraje + " Nro Ruedas: " + ruedas + " Tipo: " + tipo + " Marca: " + marca + " Motor: " + motor;
    }

}
