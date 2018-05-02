
package libraryexample;

/**
 *
 * @author CPP_Curriculum
 */
public class Book {
    
    private String ISBN;
    private String book_title;
    private String author;
    private String publish_year;
    
    
    public Book (String isbn, String book_title, String author, String publish_year){
        this.ISBN = isbn;
        this.book_title = book_title;
        this.author = author;
        this.publish_year = publish_year;
    }
    
    //Extra Task 1
    public Book (String book_title, String author, String publish_year){
        this.ISBN = "1234567892";
        this.book_title = book_title;
        this.author = author;
        this.publish_year = publish_year;
    }
    
    //Extra Task 2
    @Override
    public String toString(){
        return "Book Information:\n" + book_title + 
                " by " + author; 
    }
    
//        @Override
//    public String toString(){
//        return "Book Information:\nISBN: " + ISBN + "\nTitle: " + book_title + 
//                "\nAuthor: " + author + "\nYear Published: " + publish_year; 
//    }
}
