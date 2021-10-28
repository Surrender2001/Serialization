import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Program {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person p = new Person("Владислав", "Синотов", 1997, false);
            oos.writeObject(p);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
