import org.paololauria.objectoriented.booksShop.Books;

public class Library {
    public static void main(String[] args){

        Books philosopherStone = new Books("Harry Potter and Philosopher's Stone", "fantasy", 1997, "J.K. Rownling", 223, 9.99, true);
        Books chamberOfSecrets = new Books("Harry Potter and the Chamber of Secrets", "fantasy", 1998, "J.K. Rowling", 251, 8.99, true);
        Books prisonerOfAzkaban = new Books("Harry Potter and the Prisoner of Azkban", "fantasy", 1999, "J.K. Rownling", 317, 7.99, false );

        philosopherStone.infoBook();
        chamberOfSecrets.infoBook();
        prisonerOfAzkaban.infoBook();

    }
}