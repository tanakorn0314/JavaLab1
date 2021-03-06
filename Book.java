public class Book
{
  private String title;
  private int numOfPage;
  private String authorName;
  
  public Book()
  {
    
  }
  
  public Book(String title)
  {
    this.title = title;
  }
  
  public Book(String title,int numOfPage)
  {
    this.title = title;
    this.numOfPage = numOfPage;
  }
  
  public Book(String title,int numOfPage,String authorName)
  {
    this.title = title;
    this.numOfPage = numOfPage;
    this.authorName = authorName;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public int getNumOfPage()
  {
    return this.numOfPage;
  }
  
  public String getAuthorName()
  {
    return this.authorName;
  }
  
  public void setTitle(String title)
  {
    this.title = title;
  }
  
  public void setNumOfPage(int numOfPage)
  {
    this.numOfPage = numOfPage;
  }
   
   public void setAuthorName(String authorName)
  {
    this.authorName = authorName;
  }
   
   public boolean isSameBook(Book book)
   {
     if(this.title == book.getTitle()&&this.numOfPage == book.getNumOfPage()&&this.authorName == book.getAuthorName())
       return true;
     return false;
   }
   
   
}