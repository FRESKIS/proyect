import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws IOException {

        int inp = 0;
        Scanner input = new Scanner(System.in);

        while (inp != 6) {

            System.out.println("1. Leer nombre \n 2. Leer edad \n 3. Escribir nombre \n 4. Escribir edad \n 5. sumar edad \n 6. Salir");
            inp = input.nextInt();
            input.nextLine();

            switch (inp) {
                case 1:
                    System.out.println(fit.getName());
                    break;
                case 2:
                    System.out.println(fit.getAge());
                    break;
                case 3:
                    System.out.println("Escribir nombre: ");
                    fit.setName(input.nextLine());
                    break;
                case 4:
                    System.out.println("Escribir edad: ");
                    fit.setAge(input.nextInt());
                    input.nextLine();
                    break;
                case 5:
                    fit.setAge(fit.getAge() + input.nextInt());
                    input.nextLine();
                    break;
                case 6:
                    System.out.println("Salir");
                    fit.actualizar_fit();
                    break;
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
        }
    }

}
