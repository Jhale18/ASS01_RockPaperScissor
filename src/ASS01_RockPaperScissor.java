import java.util.Scanner;

public class ASS01_RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1;
        String player2;
        String playAgain;
        do {
            do {
                System.out.print("Player 1, enter your move (R for rock, P for paper, S for scissors): ");
                player1 = scanner.nextLine().toUpperCase();
                if (!player1.matches("[RPS]")) {
                    System.out.println("Invalid choice");
                }
            } while (!player1.matches("[RPS]"));
            do {
                System.out.print("Player 2, enter your move (R for rock, P for paper, S for scissors): ");
                player2 = scanner.nextLine().toUpperCase();
                if (!player2.matches("[RPS]")) {
                    System.out.println("Invalid choice");
                }
            } while (!player2.matches("[RPS]"));
            if (player1.equals(player2)) {
                System.out.println("It's a tie! Both players chose " + player1);
            } else if (player1.equals("R") || player2.equals("S")) {
                System.out.println("Rock breaks Scissors. Player 1 wins!");
            } else if (player1.equals("P") || player2.equals("R")) {
                System.out.println("Paper covers Rock. Player 1 wins!");
            } else if (player1.equals("S") || player2.equals("P")) {
                System.out.println("Scissors cuts Paper. Player 1 wins!");
            } else if (player2.equals("R") || player1.equals("S")) {
                System.out.println("Rock breaks Scissors. Player 2 wins!");
            } else if (player2.equals("P") || player1.equals("R")) {
                System.out.println("Paper covers Rock. Player 2 wins!");
            } else if (player2.equals("S") || player1.equals("P")) {
                System.out.println("Scissors cuts Paper. Player 2 wins!");
            }
            System.out.print("Play again (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
        } while (playAgain.equals("Y"));
        System.out.println("Thanks for playing!");
    }
}
