import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ENTER VALUE:- ");
        int value = scanner.nextInt();
        scanner.close();

        if(value % 2 == 0){ 
            System.out.println("NON PRIME"); 
            return; 
        }

        for(int i=2; i*i < value; i++){
            if(value % i == 0){ 
                System.out.println("NON PRIME"); 
                return; 
            }
        }

        System.out.println("PRIME");
        return;
    }
}
