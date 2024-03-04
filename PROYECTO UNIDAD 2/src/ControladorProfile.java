import java.sql.SQLOutput;
import java.util.*;

public class ControladorProfile {

    public void profiles(){
        Scanner leer = new Scanner(System.in);
        int numero=0;
        System.out.println("2) Author");
        System.out.println("1) Cliente");
        System.out.println("Escoja una opcion: ");
        numero=leer.nextInt();
        leer.nextLine();

        switch(numero){
            case 1:
                for(Profile cliente:RepositoryProfile.clientes) {
                    System.out.println("--------------------------------------------");
                    System.out.printf("Name: %s| Last name: %s| Birthdate: %s| ",
                            cliente.name, cliente.lastName, cliente.birthdate);
                    System.out.println("");
                    System.out.println("--------------------------------------------");
                }
                break;


            case 2:
                for(Profile autors:RepositoryProfile.autores) {
                    System.out.println("--------------------------------------------");
                    System.out.printf("Name: %s| Last name: %s| Birthdate: %s| ",
                            autors.name, autors.lastName, autors.birthdate);
                    System.out.println("");
                    System.out.println("--------------------------------------------");
                }
                break;
            case 3:
                System.out.println("No se puede realizar");
                break;


        }



    }
}
