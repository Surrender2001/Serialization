import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Program3 {

    public static void main(String[] args) {

        ArrayList<Person> personArrayList= new ArrayList<>();
        personArrayList.add(new Person("Владислав", "Синотов", 1997, false));
        personArrayList.add(new Person("Александр", "Костылев", 1997, false));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
                oos.writeObject(personArrayList);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Success");
    }
}
