import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ENTER VALUE:- ");
        int value = scanner.nextInt();
        scanner.close();

        int reverseV = 0;
        while(value > 0){
            reverseV = reverseV * 10 + (value%10);
            value /= 10;
        }

        System.out.println("REVERSE: " + reverseV);
        return;
    }
}
