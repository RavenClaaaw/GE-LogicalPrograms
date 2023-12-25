import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER N: ");
        int N = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;
        if(N > 0){
            if(N == 1) System.out.println(firstTerm);
            else System.out.print(firstTerm + " " + secondTerm + " ");

            for(int i=0; i<N-2; i++){
                int current = firstTerm + secondTerm;
                System.out.print(current + " ");
                
                firstTerm = secondTerm;
                secondTerm = current;
            }
        }

        scanner.close();
    }
}
