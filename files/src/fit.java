import java.io.*;
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

    public static void actualizar_fit() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt"))) {
        bw.write(name);
        bw.write(age);
        } catch (IOException e) {
        System.out.println("No existe el archivo");}
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