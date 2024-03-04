import java.util.*;
public class ControladorClient {

    public void pc() {
        Scanner leer = new Scanner(System.in);
        int numero = 0;

        System.out.println("1) Crear");
        System.out.println("2) Actualizar");
        System.out.println("Escoja una opcion: ");
        numero = leer.nextInt();
        leer.nextLine();

        switch (numero) {
            case 1:


                System.out.print("Name: ");
                String namec = leer.nextLine();

                System.out.print("Last name: ");
                String lastc = leer.nextLine();

                System.out.print("Birthdate: ");
                String birthc = leer.nextLine();
                Profile cliente = new Profile(namec, lastc, birthc);
                RepositoryProfile.clientes.add(cliente);
                System.out.println("===Cliente creado con exito===");
                break;

            case 2:

                System.out.print("Dame el nombre a modificar:");
                String nombre2 = leer.nextLine();
                System.out.print("Dane el apellido a modificar:");
                String apellido = leer.nextLine();
                System.out.println("");

                for (Profile cli : RepositoryProfile.clientes) {
                    for (Profile deps : RepositoryProfile.clientes) {
                        if (cli.name.equals(nombre2)) {
                            if (cli.lastName.equals(apellido)) {
                                System.out.println("===Profile Reboot===");
                                System.out.print("Nombre: ");
                                String names = leer.nextLine();
                                System.out.println("Last name: ");
                                String last = leer.nextLine();
                                System.out.println("Birthdate: ");
                                String date = leer.nextLine();

                                cli.name = names;
                                cli.lastName = last;
                                cli.birthdate = date;
                            }

                            return;


                        }else {
                            System.out.println("Vuelva hacerlo");
                        }
                    }


                }break;

        }


    }
}