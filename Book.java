/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3) 
        {
         refNumber = ref;
        }
        else 
        {
            System.out.println("Error! The reference number must be at least 3 characters long.");
        }
    }
    
    public String getAuthor()
    {
        return author;
    }

    public String getTitle() 
    {
        return title;
    } 
    
    public int getPages() 
    {
        return pages;
    } 
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void borrow()
    {
         borrowed++;
    }

    public int getBorrowed()
    {
         return borrowed;
    } 
    
    public void printDetails()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        
        if(refNumber.length() > 0)
        {
            System.out.println("Reference number:" + refNumber);
        }
        else
        {
            System.out.println("Reference number:" + "ZZZ");
        }
        
        System.out.println("Borrowed: " + borrowed);
    }

}
