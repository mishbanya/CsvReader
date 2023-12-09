import java.io.FileNotFoundException;
import java.util.List;

/**
 * Class Main
 * Entry point of the program
 */
public class Main {

    /*
     * Entry point of the program
     * @param args - command line arguments
     * @throws FileNotFoundException - if file is not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        MyReader myReader = new MyReader();
        List<Person> people = myReader.readData("foreign_names.csv");
        for (Person person : people){
            System.out.println(person.toString());
        }
    }
}