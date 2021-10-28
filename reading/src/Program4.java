import java.io.*;
import java.util.ArrayList;

public class Program4 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("person.dat");


        ArrayList<Person> objectsList = new ArrayList<>();
            try (ObjectInputStream input = new ObjectInputStream(fileInputStream)) {
                objectsList = (ArrayList<Person>) input.readObject();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        System.out.println(objectsList.toString());
        System.out.println("Success");

    }
}
