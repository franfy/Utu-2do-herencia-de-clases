import java.util.Scanner;
public class estudiante extends persona{//se crea la herencia de persona a funcionario
// pr    pr  *nom heren* *heren* *clase*

    //atributo de la clase estudiante
    String clase;
    String horario;
    
    public estudiante(String nom, String ape,String cel, int ci, String clase, String horario){//declara la clase funcionario y los atributos del mismo junto a los atributos de persona
        super(nom, ape, cel, ci);//indica que los atributos "nombre" y "ci" son heredados de la super clase persona
        this.clase=clase;
        this.horario=horario;
        
        
    }

    public static void main(String[] args) {
        estudiante estudiante_in = new estudiante(null, null, null, 0, null, null);
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        estudiante_in.nom=lector.next();

        System.out.println("Ingrese el apellido del estudiante: ");
        estudiante_in.ape=lector.next();
        
        System.out.println("Ingrese el nro telefonico del estudiante: ");
        estudiante_in.cel=lector.next();
        
        System.out.println("Ingrese la cedula del estudiante: ");
        estudiante_in.ci=lector.nextInt();
        
        System.out.println("Ingrese la clase a la que pertenece el estudiante: ");
        estudiante_in.clase=lector.next();
        
        System.out.println("Ingrese el horario del estudiante: ");
        estudiante_in.horario=lector.next();

        System.out.println(estudiante_in);
        lector.close();
    }

    @Override
    public String toString() {
        
        return "nombre: " + nom + " apellido: " + ape + " celular: " + cel + " cedula: " + ci + " clase: " + clase + " horario de clase: " + horario;
    }
    
}