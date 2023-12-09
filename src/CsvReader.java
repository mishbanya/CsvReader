import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public List<Person> readCsv(String csvFilePath, char separator) throws IOException, CsvValidationException {
        List<Person> peopleList = new ArrayList<>();

        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath);
             Reader reader = in == null ? null : new InputStreamReader(in);
             CSVReader csvReader = reader == null ? null : new CSVReader(reader)) {
            if (csvReader == null) {
                throw new FileNotFoundException(csvFilePath);
            }

            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null) {
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String gender = nextLine[2];
                String birthDate = nextLine[3];
                Department department = new Department(nextLine[4]); // используем название подразделения из файла
                double salary = Double.parseDouble(nextLine[5]);

                Person person = new Person();
                person.setId(id);
                person.setName(name);
                person.setGender(gender);
                person.setDepartment(department);
                person.setSalary(salary);
                person.setBirthDate(birthDate);

                peopleList.add(person);
            }
        }

        return peopleList;
    }
}