//Jason Zhou, Peyton Leonard
public class MediaLibRunnerStatic
{
  public static void main(String[] args)
  {
    // Step 1
    System.out.println(MediaLib.getOwner() + "'s Library");

    // Step 8
    MediaLib.changeOwner("Minos Prime");
    System.out.println(MediaLib.getOwner() + "'s Library");

    //step 14
    System.out.println(MediaLib.getNumEntries());

    //step 17
    MediaLib myLib = new MediaLib();
    Movie someMovie = new Movie("Cool Movie",10,100);

    MediaLib myOtherLib = new MediaLib();
    Book someBook = new Book("Book","Book writer");

    myLib.addMovie(someMovie);
    myOtherLib.addBook(someBook);
    //System.out.println(myLib);
    //System.out.println(myOtherLib);
    System.out.println(myLib.getNumEntries());


    //step 22
    Book otherBook = new Book("Other book", "Other Book Author");
    Book theOtherBook = new Book("Other book", "Other Book Author");
    myOtherLib.addBook(otherBook);
    System.out.println(myOtherLib);
    System.out.println(myOtherLib.getNumEntries());
    myOtherLib.addBook(theOtherBook);
    System.out.println(myOtherLib);
    System.out.println(myOtherLib.getNumEntries());

  
  }
}