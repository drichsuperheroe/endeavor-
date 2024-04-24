import java.util.Scanner;

 

public class omegaelferte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 

        System.out.print("Introduce un numero: ");
        int number = scanner.nextInt();

 

        if (number > 0) {
            System.out.println("El numero es positivo.");
        } else if (number < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es zero.");
        }

 

        scanner.close();
    }
}