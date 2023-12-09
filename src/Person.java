import java.util.Random;

/**
 * Class Person
 * Represents a person
 */
public class Person {
    private int id;
    private String name;
    private String gender;
    private String birthDate;
    private Division division;
    private int salary;

    /*
     * Constructor for the Person class
     * @param id - identifier
     * @param name - name
     * @param gender - gender
     * @param birthDate - date of birth
     * @param division - name of division
     * @param salary - salary
     */
    public Person(int id, String name, String gender, String birthDate, String division, int salary) {
        Random rand = new Random();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division.setName(division);
        this.division.setId(rand.nextInt(1000));
        this.salary = salary;
    }

    /*
     * String representation of the Person class
     * @return String representation of the Person class
     */
    @Override
    public String toString() {
        return this.id +": name: '" + this.name + "', gender: '" + this.gender + "', division: '" + this.division.toString() + "'";
    }
}