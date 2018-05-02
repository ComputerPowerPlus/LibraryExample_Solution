package libraryexample;

/**
 *
 * @author CPP_Curriculum
 */
public class Author {
    
    private String name;
    private String year_born;
    
    
    public Author (String name, String year_born){
        this.name = name;
        this.year_born = year_born;
    }
    
    @Override
    public String toString(){
        return "Author Details:\nName: " + name + "\nBirth Year: " + year_born; 
    }
}
