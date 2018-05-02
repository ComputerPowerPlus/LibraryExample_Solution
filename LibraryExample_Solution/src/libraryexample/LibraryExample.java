package libraryexample;

import java.util.ArrayList;

/**
 *
 * @author CPP_Curriculum
 */
public class LibraryExample {
    
    private static ArrayList objectList = new ArrayList();
    
  
    public static void main(String[] args) {
        Book book1 = new Book("0143309293", "Maui and Other Maori Legends: 8 Classic Tales of Aotearoa", "Peter Gossage", "2016");
        Book book2 = new Book("9781869503499", "Legends of Aotearoa", "Chris Winitana", "2001");
        Book book3 = new Book("0947506268", "Nga Atua-Maori Gods", "Robyn Kahukiwa", "2017");
        
        Author author1 = new Author("Peter Gossage", "1946");
        Author author2 = new Author("Chris Winitana", "1960");
        Author author3 = new Author("Robyn Kahukiwa", "1938");
        objectList.add(author1);
        objectList.add(book1);
        objectList.add(author2);
        objectList.add(book2);
        objectList.add(author3);
        objectList.add(book3);
        
        //Extra Task 1
        Book book4 = new Book("The colour of magic", "Terry Pratchet", "1983");
        Book book5 = new Book("The light Fantastic", "Terry Pratchet", "1986");
        objectList.add(book4);
        objectList.add(book5);
        
        printList(objectList);
        
    }
    
    public static void printList(ArrayList list){
        for (Object o: list){
            System.out.println(o + "\n");
        }
    }
    
}
