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
    private int borrow;
    public boolean text;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages_number, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pages_number;
        refNumber = "";
        text = courseText;
    }

    // Add the methods here ...
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public void printAuthor(){
        System.out.println(author);
    }
    public void printTitle(){
        System.out.println(title);
    }
    public int getPages(){
        return pages;
    }
    public void setRefNumber(String ref){
        if (ref.length() >= 3){
            refNumber = ref;
        }
        else{
            System.out.println("Error: Reference number not long enough");
        }
    }
    public String getRefNumber(){
        return refNumber;
    }
    public void printDetails(){
        if (refNumber.length() == 0){ 
            System.out.println("Title: " + title +". Author: " + author + ". Pages : " + pages + ". Referemce Number: ZZZ" + "Times borrowed: " + borrow + "Course Text: " + text);
        }
        else{
            System.out.println("Title: " + title +". Author: " + author + ". Pages : " + pages + ". Referemce Number: " + refNumber + " Times borrowed: " + borrow + " Course Text: " + text);
        }
    }
    public void borrowed(){
        borrow += 1;
    }
    public int getBorrowed(){
        return borrow;
    }
    public boolean isCourseText(){
        return text;
    }
}
