import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws IOException {

        int inp = 0;
        String s;
        int a;

        Scanner input = new Scanner(System.in);

        while (inp != 5) {

            System.out.println("1. Leer nombre \n 2. Leer edad \n 3. Escribir nombre \n 4. Escribir edad \n 5. Salir");
            inp = input.nextInt();

            switch (inp) {
                case 1:
                    System.out.println(fit.getName());
                    break;
                case 2:
                    System.out.println(fit.getAge());
                    break;
                case 3:
                    System.out.println("Escribir nombre: ");
                    s = input.nextLine();
                    fit.setName(s);
                    break;
                case 4:
                    System.out.println("Escribir edad: ");
                    a = input.nextInt();
                    fit.setAge(a);
                    break;
                case 5:
                    System.out.println("Adios!!");
                    fit.actualizar_fit();
                    break;
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
        }
    }
}