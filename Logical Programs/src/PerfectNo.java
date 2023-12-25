import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ENTER VALUE:- ");
        int value = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;
        for(int i=1; i<value; i++){
            if(value%i == 0) sum += i;
        }

        if(sum == value) System.out.println("PERFECT NUMBER");
        else System.out.println("NOT A PERFECT NUMBER");

        scanner.close();
    }
}
