import java.util.Scanner;
import java.util.Random;
public class Stars1 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Random rand = new Random();
		int again = 1;
		while (again >= 1) { //to play again
			int mist = 0;
			int score = 0; 
			while (mist < 3) { // until 3 mistakes
            int result = play(scan, rand);
            if (result > 0) {
                score++;
            } else {
                mist++;
			}
		}
			System.out.println("You earned " + score + " total points.");
			System.out.println("Do you want to play again? print yes/no");
			String word = scan.next();
		if (!word.equals("no")) {
			again = again + 0;
		} else if (!word.equals("yes")) {
			again = again - 1;
		} else {
			
		}
        }
	}
    public static int play(Scanner scan, Random rand) { // print the operands being added, and sum them
		int amount = rand.nextInt(4) + 2;
		int sum = rand.nextInt(10) + 1;
		System.out.print(sum);
	
		for (int i = 2; i <= amount; i++) {
			int n = rand.nextInt(10) + 1;
			sum += n;
			System.out.print(" + " + n);
		}
		System.out.print(" = ");
	
		int answer = scan.nextInt(); // Checks if answer correct or wrong
		if (answer == sum) {
			return 1;
		} else {
			System.out.println("Wrong! The answer was " + sum);
			return 0;
		}
	}
}

