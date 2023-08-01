package software.ujithamigara;

import org.hibernate.Session;
import org.hibernate.Transaction;
import software.ujithamigara.dao.BookDao;
import software.ujithamigara.dao.impl.BookDaoImpl;
import software.ujithamigara.entity.Book;
import software.ujithamigara.util.FactoryConfiguration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookDao bookDao = new BookDaoImpl();

        int userInput;
        do {
            System.out.print("to save book press (1)\nto search Book press (2)\n" +
                    "to update press(3)\nto delete press(4)\nto exit the program(9)\nInput : ");
            userInput = scanner.nextInt();

            if (userInput == 1){
                Book book = new Book();
                System.out.print("input Book Id : ");
                book.setId(scanner.nextInt());
                System.out.print("input Book title : ");
                scanner.nextLine();
                book.setTitle(scanner.nextLine());
                System.out.print("input Book ISBN : ");
                book.setISBN(scanner.nextLine());

                //call the dao and save the Book
                bookDao.saveBook(book);

            } else if (userInput == 2) {

            } else if (userInput == 3) {

            } else if (userInput == 4) {

            }

        }while (userInput != 9);



    }
}