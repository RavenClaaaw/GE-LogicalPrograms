import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("PRESS ANYKEY TO START:- ");
        scanner.nextLine();
        long startTime = System.currentTimeMillis();

        System.out.print("PRESS ANYKEY TO STOP:- ");
        scanner.nextLine();
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
        
        scanner.close();
        return;
    }
}
