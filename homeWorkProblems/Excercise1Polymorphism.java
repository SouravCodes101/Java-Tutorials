package homeWorkProblems;

class Library {
  String[] books;
  int no_of_books;
  Library() {
    this.books =  new String[100];
    this.no_of_books = 0;
  }

  void addBook(String book) {
    this.books[no_of_books] = book;
    no_of_books ++;
    System.out.println(book + " has been added to the library successfully!");
  }

  void showAvailableBooks() {
    System.out.println("Available books are : ");
    for(String book: this.books) {
      if(book == null) {
        break;
      }
      System.out.println("* " + book);
    }
  }

  void issueBook(String book) {
    for(int i=0; i<this.books.length; i++) {
      if(this.books[i]==book) {
        System.out.println("The Book Has been issued !");
        this.books[i]=null;
        return;
      }

    }
    System.out.println("This book does not exist");
  }
}

public class Excercise1Polymorphism {
  public static void main(String[] args) {
    //Implement a library using java class "Library"
    //Methods: addBook, issueBook, returnBook, showAvailableBooks
    //Properties: Array to store the available books
    //Array to store the issued books

    Library centralLibrary = new Library();
    centralLibrary.addBook("Ikigai");
    centralLibrary.addBook("c++");
    centralLibrary.addBook("Do Epic Shit");
    centralLibrary.showAvailableBooks();
    centralLibrary.issueBook("c++");
  }
}
