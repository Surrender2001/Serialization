import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String surname;
    private int yearOfBirth;
    private boolean married;
    private static final long serialVersionUID = 1L;

    Person(String name, String surname, int yearOfBirth, boolean married) {

        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.married = married;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", surname=" + surname +
                ", yearOfBirth=" + yearOfBirth +
                ", married=" + married +
                '}';
    }
}
