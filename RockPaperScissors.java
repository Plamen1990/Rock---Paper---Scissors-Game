import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSOR = "Scissor";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissor: ");
        String playerMove = scanner.nextLine();


        if (playerMove.equals("r") || playerMove.equals("rock")){
            playerMove = ROCK;
        }else if (playerMove.equals("p") || playerMove.equals("paper")){
            playerMove = PAPER;
        }else if (playerMove.equals("s") || playerMove.equals("scissor")){
            playerMove = SCISSOR;
        }else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomMove = random.nextInt(1,4);
        String computerMove = "";
        switch (computerRandomMove){
            case 1:
                computerMove = ROCK;
                break;
            case 2:
                computerMove = PAPER;
                break;
            case 3:
                computerMove = SCISSOR;
                break;
        }

        System.out.printf("The computer chose %s.%n", computerMove);

        if (playerMove.equals(ROCK) && computerMove.equals(SCISSOR) ||
        playerMove.equals(PAPER) && computerMove.equals(ROCK) ||
        playerMove.equals(SCISSOR) && computerMove.equals(PAPER)){
            System.out.println("You win");
        }else if (playerMove.equals(ROCK) && computerMove.equals(ROCK) ||
        playerMove.equals(PAPER) && computerMove.equals(PAPER) ||
        playerMove.equals(SCISSOR) && computerMove.equals(SCISSOR)){
            System.out.println("This game was a draw");
        }else {
            System.out.println("You lose.");
        }

        return;
    }

}
