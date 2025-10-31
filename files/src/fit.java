import java.io.*;
import java.util.Scanner;

public class fit {
    private String name;
    private int age;

    public void initFit(){
        File f = new File("user.txt");

        try (Scanner input = new Scanner(f)) {
            this.name = input.nextLine();
            age = input.nextInt();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
            e.printStackTrace();
        }
    }

    public void actualizar_fit() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt"))) {
            bw.write(name);
            bw.newLine();
            bw.write(String.valueOf(age));
        } catch (IOException e) {
        System.out.println("No existe el archivo");}
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() { return(age);}
    public void setAge(int age) { this.age = age; }

}