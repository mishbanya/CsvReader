public class Person {
    private int id;
    private String name;
    private String gender;
    private Department department;
    private double salary;
    private String birthDate;

    public Person() {
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

}