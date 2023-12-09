
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyReader {
    public List<Person> readData(String filePath) throws FileNotFoundException {
        List<Person> people = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath), ';')) {
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