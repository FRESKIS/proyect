import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fit {
    private static String name;
    private static int age;

    static {
        File f = new File("user.txt");

        try (Scanner input = new Scanner(f)) {
            name = input.nextLine();
            age = input.nextInt();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
            e.printStackTrace();
        }
    }

    public static String getName() {
        return name;
    }
    public static void setName(String name) {
        name = name;
    }
    public static int getAge() { return(age);}
    public static void setAge(int age) { age = age; }

}