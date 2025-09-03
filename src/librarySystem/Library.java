package librarySystem;

// desenvolver um sistema básico para gerenciar o empréstimo de livros em uma biblioteca.
// Focando na listagem de livros disponiveis e na funcionalidade de empréstimo
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        String[] books = {"Don Quixote – Miguel de Cervantes", "Harry Potter and the Sorcerer’s Stone – J.K. Rowling", "The Hobbit – J.R.R. Tolkien",
                "The Lord of the Rings – J.R.R. Tolkien", "The Catcher in the Rye – J.D. Salinger", "to Kill a Mockingbird – Harper Lee", "1984 – George Orwell",
                "The Great Gatsby – F. Scott Fitzgerald", "Pride and Prejudice – Jane Austen", "The Da Vinci Code – Dan Brown"};

        boolean[] availableBooks = {true, false, true, true, true, false, true, false, false, true};


        System.out.println("1: List of all Books | 2: Borrow a book | 3: Books Non-Available");
        Scanner choice = new Scanner(System.in);

        int choose = choice.nextInt();
        if (choose < 1 || choose > 3){
            System.err.println("Please type only numbers 1 to 3");
            choose = choice.nextInt();
        }

        if (choose == 1){
            borrow(books);
        } else if (choose == 2) {
            lend(books, availableBooks);
        }
        else if (choose == 3){
            nonAvailable(books, availableBooks);
        }

    }

    public static void borrow(String[] array){

        System.out.println("This is the list of all books");

        for (String books : array) {
            System.out.printf("·%-40s\n", books);
        }

    }

    public static void nonAvailable(String[] books, boolean[] availableBooks){
        Boolean[] nonAvailableBooks = new Boolean[availableBooks.length];
        System.out.println("Non-Available books");

        for (int a = 0; a < availableBooks.length; a++) {
            nonAvailableBooks[a] = !availableBooks[a];
            if (nonAvailableBooks[a]){
                System.out.printf("·%-40s\n", books[a]);
            }
        }

    }

    public static void lend(String[] books, boolean[] availableBooks){



        System.out.println("Available books");
        for (int i = 0; i < books.length; i++){
            if (availableBooks[i]){
                System.out.printf("•%-40s\n", books[i]);


            }

            int oneZero;
            do{
                Scanner confirmation = new Scanner(System.in);
                System.out.println("Do you want to borrow a book?\nType 1 to Yes and 0 to No!");

                oneZero = confirmation.nextInt();
                if(oneZero != 0 && oneZero != 1){
                    System.err.println("Type 1 to Yes and 0 to No");
                }

            } while (oneZero != 0 && oneZero != 1);{
                if (oneZero == 1){
                    System.out.println("Choose the book you want to borrow!");
                }

            }

        }

    }

}
