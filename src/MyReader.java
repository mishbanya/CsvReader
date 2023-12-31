import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVParserBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class MyReader
 * Reads data from a CSV file
 */
public class MyReader {

    /*
     * Reads data from a CSV file
     * @param filePath - path to the CSV file
     * @return List of Person objects
     */
    public List<Person> readData(String filePath) {
        List<Person> people = new ArrayList<>();

        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(filePath))
                .withCSVParser(new CSVParserBuilder().withSeparator(';').build())
                .build()) {
            String[] nextRecord;
            csvReader.readNext(); // Пропускаем заголовок

            while ((nextRecord = csvReader.readNext()) != null) {
                Person person = new Person(
                        Integer.parseInt(nextRecord[0]),
                        nextRecord[1],
                        nextRecord[2],
                        nextRecord[3],
                        nextRecord[4],
                        Integer.parseInt(nextRecord[5])
                );
                people.add(person);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        return people;
    }
}