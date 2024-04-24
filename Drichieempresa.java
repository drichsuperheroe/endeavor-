import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drichieempresa {

    public static void main(String[] args) {
        List<String> descriptions = new ArrayList<>();
        List<Integer> amounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 add an expense");
            System.out.println("2 view all expenses");
            System.out.println("3 calculate total expenses");
            System.out.println("4 exit");
            
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {

                System.out.print("descripcion: ");

                String description = scanner.nextLine();

                System.out.print("monto: ");

                int amount = scanner.nextInt();

                scanner.nextLine(); 
                
                descriptions.add(description);
                amounts.add(amount);

            } else if (option == 2) {

                if (descriptions.size() == 0) {
                    System.out.println("no hay expenses bro");

                }else{
                    System.out.println("expenses: ");

                    for (int i = 0; i < descriptions.size(); i++) {

                        System.out.println(descriptions.get(i) + " - $" + amounts.get(i));
                    }
                }

            }else if (option == 3){

                if (amounts.size() == 0) {
                    System.out.println("no hay expenses bro");
                } else {
                    int total = 0;
                    for (int amount : amounts) {
                        total += amount;
                    }
                    System.out.println("total: $" + total);
                }
            }else if (option == 4){

                System.out.println("adios skibididop");
                break;

            }else{
                System.out.println("tu ere un muchacho");
            }
        }
    }
}
