import java.util.HashMap;
import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> visited = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER N VALUE:- ");
        int N = scanner.nextInt();
        scanner.nextLine();

        int counter = 0;
        while(visited.size() < N){
            int randomNumber = (int) Math.floor(Math.random() * N) + 1;
            if(!visited.containsKey(randomNumber)){
                visited.put(randomNumber, true);
            }

            counter += 1;
        }

        System.out.println("TRIES:- " + counter);
        scanner.close();
        return;
    }
}
