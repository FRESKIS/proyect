import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws IOException {

        int inp = 0;
        String s;
        int a;

        fit f = new fit();
        f.initFit();

        Scanner input = new Scanner(System.in);

        while (inp != 6) {

            s = "";
            a = -1;

            System.out.println("1. Leer nombre \n 2. Leer edad \n 3. Escribir nombre \n 4. Escribir edad \n 5. sumar edad \n 6. Salir");
            inp = input.nextInt();

            switch (inp) {
                case 1:
                    System.out.println(f.getName());
                    break;
                case 2:
                    System.out.println(f.getAge());
                    break;
                case 3:
                    System.out.println("Escribir nombre: ");
                    while (s.equals("")) {
                        s = input.nextLine();
                    }
                    f.setName(s);
                    break;
                case 4:
                    System.out.println("Escribir edad: ");
                    a = input.nextInt();
                    f.setAge(a);
                    break;
                case 5:
                    f.setAge(f.getAge() + input.nextInt());
                    break;
                case 6:
                    System.out.println("Salir");
                    f.actualizar_fit();
                    break;
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
        }
    }
}