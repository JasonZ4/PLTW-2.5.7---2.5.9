/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }
  public void addMovie(Movie m){movie = m;}
  public String toString() 
  {
    String info = "Library with the book " + book;
    if (!movie.equals(null)){
      info += " and the movie " + movie;
    }
    
    return info;
  }
  /*
  public void testBook(Book tester){
    tester.setTitle("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    System.out.println("book " + tester);
  }
  */
  
}