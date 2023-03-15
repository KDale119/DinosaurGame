import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {

    private static final int TyrannosourusRex = 0;
    private static final int Velociraptor = 1;

    private static final int GIGANTOSOURUS = 2;

    private static final int bite = -60;
    private static final int pounce = -20;
    private static final int claw = -35;
    private static int playerDinoHealth = -100;
    private static int computerDinoHealth = -100;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int playerValue;
        String playerDino;

        int computerValue = randomGenerator.nextInt(3);
        String computerDino;

        if (computerValue == TyrannosourusRex) {
            computerDino = "T-REX";
        } else if (computerValue == Velociraptor) {
            computerDino = "Velociraptor";
        } else {
            computerDino = "Gigantosourus";
        }


        System.out.println("PREDATOR VS PREDATOR");
        System.out.println("Choose your dinosaur");
        System.out.println("T-REX, Velociraptor or Gigantosourus");


        playerDino = scanner.nextLine().toLowerCase();


        if (playerDino.equals("T-REX")) {
            playerValue = TyrannosourusRex;
        } else if (playerDino.equals("Velociraptor")) {
            playerValue = Velociraptor;
        } else {
            playerValue = GIGANTOSOURUS;
        }

        System.out.printf("You choose %s%n", playerDino);
        System.out.println("Opponent chose " + computerDino);

        System.out.println("Destroy your opponent");
        System.out.println("BITE is 60 damage");
        System.out.println("POUNCE is 20 damage");
        System.out.println("CLAW is 35 damage");
        System.out.println("Make your move");

        String playerMove = scanner.nextLine();
        int playerMoveValue;


        if (playerMove.equals("bite")) {
            playerMoveValue = bite;
        } else if (playerMove.equals("pounce")) {
            playerMoveValue = pounce;
        } else {
            playerMoveValue = claw;
        }

        switch (playerMove) {
            case "bite" :
                 computerDinoHealth = bite - computerDinoHealth;
                 break;
            case "pounce":
                computerDinoHealth = pounce - computerDinoHealth;
                break;
            case "claw":
                computerDinoHealth = claw - computerDinoHealth;
                break;
        }


        int computerMoveValue = randomGenerator.nextInt();
        String computerMove;


        if (computerMoveValue == bite) {
            playerDinoHealth = bite - playerDinoHealth;
            computerMove = "bite";
        } else if (computerMoveValue == pounce) {
            playerDinoHealth = pounce - playerDinoHealth;
            computerMove = "pounce";
        } else {
            playerDinoHealth = claw - playerDinoHealth;
            computerMove = "claw";
        }


        System.out.println("You used " + playerMove);
        System.out.println("Opponent's health is now " + computerDinoHealth);

        System.out.println("Opponent's turn");
        System.out.println(".............");

        System.out.print("Opponent used " + computerMove);
        System.out.println(". Your health is now " + playerDinoHealth);
        System.out.println("Your move");

        String playerMoveTwo = scanner.nextLine();

        switch (playerMoveTwo) {
            case "bite" :
                computerDinoHealth = bite - computerDinoHealth;
                break;
            case "pounce":
                computerDinoHealth = pounce - computerDinoHealth;
                break;
            case "claw":
                computerDinoHealth = claw - computerDinoHealth;
                break;
        }

        System.out.println("You chose " + playerMoveTwo);

        System.out.println("Opponent's health is now " + computerDinoHealth);

        int computerMoveValueTwo = randomGenerator.nextInt();
        String computerMoveTwo;

        if (computerMoveValueTwo == bite) {
            playerDinoHealth = bite - playerDinoHealth;
            computerMoveTwo = "bite";
        } else if (computerMoveValueTwo == pounce) {
            playerDinoHealth = pounce - playerDinoHealth;
            computerMoveTwo = "pounce";
        } else {
            playerDinoHealth = claw - playerDinoHealth;
            computerMoveTwo = "claw";
        }

        System.out.print("Opponent used " + computerMove);
        System.out.println(". Your health is now " + playerDinoHealth);






    }
}


// make an index for user to choose dinosaur by the number they choose
// make health points decrease & a random number generator to select moves