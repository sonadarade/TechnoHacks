
import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Let's play Rock, Paper, Scissors! Enter your choice (rock, paper, or scissors):");
        String userChoice = scanner.nextLine().toLowerCase();

        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
            return;
        }

        int computerIndex = (int) (Math.random() * 3); // 0 for rock, 1 for paper, 2 for scissors
        String computerChoice = choices[computerIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
