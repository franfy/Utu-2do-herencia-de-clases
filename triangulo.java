import java.util.Scanner;
public class triangulo extends figurageo{

    String tipo;
    Double Ca; //Cateto Adyasente
    Double Co; //Cateto Opuesto
    Double h;  //Hipotenusa

    public triangulo(int vertices, int lados, int grados, double area, String tipo, Double Ca, Double Co, Double h){
        
        super(vertices, lados, grados, area);
        this.tipo=tipo;
        this.Ca=Ca;
        this.Co=Co;
        this.h=h;

    }

    public static void main(String[] args) {
        
        triangulo triangulo_in = new triangulo(0, 0, 0, 0, null, 0.0, 0.0, 0.0);
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de vertices que tiene el triangulo: ");
        triangulo_in.vertices=lector.nextInt();

        System.out.println("Ingrese la cantidad de lados que tiene el triangulo: ");
        triangulo_in.lados=lector.nextInt();

        System.out.println("Ingrese el grado del triangulo: ");
        triangulo_in.grados=lector.nextInt();

        System.out.println("Ingrese el area del traingulo: ");
        triangulo_in.area=lector.nextInt();

        System.out.println("Ingrese el tipo de triangulo: ");
        triangulo_in.tipo=lector.next();

        System.out.println("Ingrese el valor del cateto adyacente del triangulo: ");
        triangulo_in.Ca=lector.nextDouble();

        System.out.println("Ingrese el valor del cateto opuesto del triangulo :");
        triangulo_in.Co=lector.nextDouble();

        System.out.println("Ingrese el valor de la hipotenusa del triangulo:");
        triangulo_in.h=lector.nextDouble();

        System.out.println(triangulo_in);
        lector.close();

    }

    @Override
    public String toString() {
        
        return "Vertices: " + vertices + " Lados: " + lados + " Grado: " + grados + " Area: " + area + " Tipo: " + tipo + " Ca: " + Ca + " Co: " + Co + " Hypotenusa: " + h;
    }

    /*
     * 
     */

}
