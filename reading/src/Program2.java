import java.io.*;

public class Program2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("person.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person savedGame = (Person) objectInputStream.readObject();

        System.out.println(savedGame);
    }
}
