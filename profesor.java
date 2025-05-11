import java.util.Scanner;
public class profesor extends persona{

    String clases;
    Double salario;
    String horarios;

    public profesor(String nom, String ape, String cel, int ci, String clases, Double salario, String horarios){
        super(nom,ape,cel,ci);
        this.clases=clases;
        this.salario=salario;
        this.horarios=horarios;
    }

    public static void main(String[] args) {
        profesor profesor_in = new profesor(null, null, null, 0, null, 0.0, null);
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre del profesor: ");
        profesor_in.nom=lector.next();

        System.out.println("Ingrese el apellido del profesor: ");
        profesor_in.ape=lector.next();

        System.out.println("Ingrese la cedula del profesor: ");
        profesor_in.cel=lector.next();

        System.out.println("Ingrese la cedula del profesor: ");
        profesor_in.ci=lector.nextInt();

        System.out.println("Ingrese el salario del profesor: ");
        profesor_in.salario=lector.nextDouble();

        System.out.println("Ingrese los horarios del profesor: ");
        profesor_in.horarios=lector.next();

        System.out.println(profesor_in);
        lector.close();
    }

    @Override
    public String toString() {
        
        return "Nombre: " + nom + " Apellido: " + ape + " Celular: " + cel + " Cedula: " + ci + " Salario: " + salario + " Horarios: " + horarios;
    }
}
