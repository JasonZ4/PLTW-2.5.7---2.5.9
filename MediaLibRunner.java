//Jason Zhou, Peyton Leonard
/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    /*
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    
    Book myBook = new Book("The Lord of the Rings", "Tolkein");
    System.out.println("Book created " +myBook);
    myLib.addBook(myBook);
    
    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    
    myBook.setTitle("Peasant of the Bracelet");
    System.out.println("Book:" +myBook);
    System.out.println("Library: " + myLib);
    
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();
    
    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);
    
    System.out.println("before test:" + newBook);
    //myLib.testBook(newBook);
    System.out.println("after test:" + newBook);
    
    Book newBook2 = new Book("1984", "Orwell");
    newBook2.setTitle("Animal Farm");
    System.out.println(newBook2.equals(newBook));
    */
    // The above is all code for t;he first part of 2.5.7, not related to the stuff below
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("A book", "Writer");
    Movie myMovie = new Movie("A movie",10,100);
    Movie myMovie2 = new Movie("A movie",10, 100);

    System.out.println(myMovie.equals(myMovie2));

  }
}