/**
 * Division class
 * This class is used to represent a division
 * It has a name and an identifier
 * It has a constructor and setters
 * It has a toString method
 */
public class Division {
    private String name;
    private int id;

    /*
     * Constructor for the Division class
     * @param name - name
     * @param id - identifier
     */
    public Division(String name, int id) {
        this.id = id;
        this.name = name;
    }
    /*
     * Setter for the name field
     * @param name - name
     */
    public void setName(String name) { this.name = name; }
    /*
     * Setter for the id field
     * @param id - identifier
     */
    public void setId(int id) { this.id = id; }

    /*
     * String representation of the Division class
     * @return String representation of the Division class
     */
    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
}