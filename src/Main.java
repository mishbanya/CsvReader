import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MyReader myReader = new MyReader();
        List<Person> people = myReader.readData("foreign_names.csv");

        // Дополнительные действия с полученными данными, если необходимо
    }
}