import java.io.*;

public class TestBook
{
  public static void main(String args[])
  {
    Book mybook1;
    mybook1 = new Book();
    mybook1.setTitle("OOP");
    mybook1.setNumOfPage(100);
    mybook1.setAuthorName("John Cage");
    System.out.println("Book1 Title : " + mybook1.getTitle() + 
                       ", Number of pages : " + mybook1.getNumOfPage() + 
                       ", Author name : " + mybook1.getAuthorName());
  }
}

