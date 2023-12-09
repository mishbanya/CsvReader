import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();

        try {
            List<Person> peopleList = csvReader.readCsv("foreign_names.csv", ';');

            // Выводим информацию о людях в списке
            for (Person person : peopleList) {
                System.out.println(person);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}