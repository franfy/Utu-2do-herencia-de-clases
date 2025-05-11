import java.util.Scanner;
public class auto extends vehiculo{

    int puertas;
    String motor;

    public auto(Double kilometraje, int ruedas, String tipo, String marca, int puertas, String motor){
        
        super(kilometraje,ruedas,tipo,marca);
        this.puertas=puertas;
        this.motor=motor;

    }

    public static void main(String[] args) {
        auto auto_in = new auto(0.0, 0, null, null, 0, null);
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kilometraje del auto: ");
        auto_in.kilometraje = lector.nextDouble();

        System.out.println("Ingrese la cantidad de ruedas del auto: ");
        auto_in.ruedas = lector.nextInt();

        System.out.println("Ingrese el tipo de auto: ");
        auto_in.tipo = lector.next();

        System.out.println("Ingrese la marca del auto: ");
        auto_in.marca = lector.next();

        System.out.println("Ingrese la cantidad de puertas del auto: ");
        auto_in.puertas = lector.nextInt();

        System.out.println("Ingrese el tipo de motor del auto: ");
        auto_in.motor = lector.next();

        System.out.println(auto_in);
        lector.close();

    }

    @Override
    public String toString() {
        
        return "Kilometraje: " + kilometraje + " Ruedas: " + ruedas + " Tipo: " + tipo + " Marca: " + marca + " Nro Puertas: " + puertas + " Motor: " + motor;
    }

}
