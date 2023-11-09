/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;

  public void addBook(Book b)
  {
    book = b;
  }

  public String toString() 
  {
    String info = "Library with the book " + book;
    
    return info;
  }
  /*
  public void testBook(Book tester){
    tester.setTitle("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    System.out.println("book " + tester);
  }
  */
  
}