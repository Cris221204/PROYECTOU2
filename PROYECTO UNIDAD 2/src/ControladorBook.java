import java.util.*;

public class ControladorBook {
    public void Books(){
        Scanner leer=new Scanner(System.in);
        System.out.println("===Books===");

        System.out.println("1) Eliminar libro");
        System.out.println("2) Crear libro");
        System.out.println("3) Actualizar libro");
        System.out.println("4) Mostrar todos los libros");
        System.out.println("5) Mostrar libros prestados");
        System.out.println("6) Mostrar libros disponibles para prestamo");
        System.out.print("Seleccionar opcion: ");
     int opcion= leer.nextInt();

     switch (opcion){
         case 1:

             break;

         case 2:
leer.nextLine();
             System.out.print("Isbn: ");
             String isbn = leer.nextLine();
             System.out.print("title: ");
             String title = leer.nextLine();
             System.out.print("Publish date: ");
             String publish = leer.nextLine();

             System.out.print("author: ");
             String author = leer.nextLine();
             Book book1=new Book(isbn,title,publish,author);
             RepositoryBook.books.add(book1);
             break;


         case 3:
             leer.nextLine();
             System.out.print("Dame el Isbn:");
             String nisbn = leer.nextLine();

             for (Book see : RepositoryBook.books) {
                     if (see.isbn.equals(nisbn)) {
                             System.out.println("===Book Reboot===");
                             System.out.print("Isbn: ");
                             String isbns = leer.nextLine();
                             System.out.println("Title: ");
                             String titles = leer.nextLine();
                             System.out.println("Publish date: ");
                             String date = leer.nextLine();
                         System.out.println("Autor:");
                         String autor=leer.nextLine();
                             see.isbn = isbns;
                             see.title = titles;
                             see.publishDate = date;
                         see.author=autor;
                         return;

                     }else {

                         System.out.println("Vuelva hacerlo");
                     }
             }
             break;

         case 4:
             for(Book boors:RepositoryBook.books){
                 System.out.println("----------------------------------------------------------------");
                 System.out.printf("ISBN: %s| Título: %s| Autor: %s| Fecha de Publicación: %s%n",
                         boors.isbn, boors.title, boors.author, boors.publishDate);
                 System.out.println("----------------------------------------------------------------");
             }

             break;
         case 5:
             break;
         case 6:
             break;
     }


    }




}
