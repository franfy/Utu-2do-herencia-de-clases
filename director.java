import java.util.Scanner;
public class director extends persona{

    Double salario;
    String horarios;
    
    public director(String nom, String ape, String cel, int ci, Double salario, String horarios){
        
        super(nom, ape, cel, ci);
        this.salario=salario;
        this.horarios=horarios;

    }

    public static void main(String[] args) {
        
        director director_in = new director(null, null, null, 0, 0.0, null);
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre del director: ");
        director_in.nom=lector.next();

        System.out.println("Ingrese el apellido del director: ");
        director_in.ape=lector.next();

        System.out.println("Ingrese el celular del director: ");
        director_in.cel=lector.next();

        System.out.println("Ingrese la cedula del director: ");
        director_in.ci=lector.nextInt();

        System.out.println("Ingrese el salario del estudiante: ");
        director_in.salario=lector.nextDouble();

        System.out.println("Ingrese el horario del estudiante: ");
        director_in.horarios=lector.next();

        System.out.println(director_in);
        lector.close();

    }

    @Override
    public String toString() {
        
        return "Nombre: " + nom + " Apellido: " + ape + " Celular: " + cel + " Cedula: " + ci + " Salario: " + salario + " Horarios: " + horarios;
    }

}
