//Jason Zhou, Peyton Leonard
/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  private static String owner = "PLTW";
  private static int numEntries = 0;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;
  //public static String owner = "PLTW";

  public void addBook(Book b)
  {
    if(book != null){
      System.out.println("There is already a book in the library.");
      return;
    }
    book = b;
    numEntries++;
    numBooks++;
  }
  public void addMovie(Movie m){
    if(movie != null){
      System.out.println("There is already a movie in the library.");
      return;
    }
    movie = m;
    numEntries++;
    numMovies++;
  }

  public void addSong(Song s){
    if(song != null){
      System.out.println("There is already a song in the library.");
      return;
    }
    song = s;
    numEntries++;
    numSongs++;
  }
  public String toString() 
  {
    
    String info = "Library with ";
    if (!(book == null)){
      info +="the book " + book;
    }
    if (!(movie == null)){
      info += " and the movie " + movie;
    }
    if (!(song == null)){
      info += " and the song " + song;
    }

    return info;
  }
  /*
  public void testBook(Book tester){
    tester.setTitle("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    System.out.println("book " + tester);
  }
  */

  
  //step 1
  public static String getOwner(){
    return owner;
  }

  //step 8
  public static void changeOwner(String newOwner){
    owner = newOwner;
  }

  //step 14
  public static int getNumEntries(){
    return numEntries;
  }
}