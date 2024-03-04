import java.util.Scanner;

public class ControladorAuthor {
    public void ca() {
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
            String nameau = leer.nextLine();

            System.out.print("Last name: ");
            String lastau = leer.nextLine();

            System.out.print("Birthdate: ");
            String birthau = leer.nextLine();
            Profile autor = new Profile(nameau, lastau, birthau);
            RepositoryProfile.autores.add(autor);
            System.out.println("Autor creado con exito");
            break;

            case 2:

                System.out.print("Dame el nombre a modificar:");
                String nombre3 = leer.nextLine();
                System.out.print("Dame el apellido a modificar:");
                String apellido3 = leer.nextLine();
                System.out.println("");

                for (Profile sep : RepositoryProfile.autores) {

                    for (Profile deps : RepositoryProfile.autores) {

                        if (sep.name.equals(nombre3)) {

                            if (sep.lastName.equals(apellido3)) {

                                System.out.println("===Profile Reboot===");
                                System.out.print("Nombre: ");
                                String names = leer.nextLine();
                                System.out.println("Last name: ");
                                String last = leer.nextLine();
                                System.out.println("Birthdate: ");
                                String date = leer.nextLine();

                                sep.name = names;
                                sep.lastName = last;
                                sep.birthdate = date;
                            }

                            return;


                        }else {

                            System.out.println("Vuelva hacerlo");
                        }
                    }
                }
                break;
        }
    }
}