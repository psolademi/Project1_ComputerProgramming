import java.util.Scanner;
public class Ass01_RockPaperScissors {
    public static void main(String[] args) {

        //To initialize a Scanner object to get the user input
        Scanner scanner = new Scanner(System.in);

        //To create a boolean that will determine if the user will continue playing
        boolean continuePlaying = true;

        //To create a while loop that will loop until the user selects no after each game
        while (continuePlaying) {

            //Call the method getPlayerMove, see the implementation below
            //This method will get the user input for each player
            String playerAMove = getPlayerMove(scanner, "Player A");
            String playerBMove = getPlayerMove(scanner, "Player B");

            //To validate the winner on each game
            //To validate first if it is a TIE
            if(playerAMove.equalsIgnoreCase(playerBMove)) {
                System.out.println(playerAMove + " vs " + playerBMove + ", it's a Tie!");
            } else {

                //To validate player A moves if Scissors
                if (playerAMove.equalsIgnoreCase("Scissors")) {

                    //To validate the moves for Player B
                    if (playerBMove.equalsIgnoreCase("Paper")) {
                        System.out.println("Scissors cuts Paper (Player A Wins!)");
                    } else if (playerBMove.equalsIgnoreCase("Rock")) {
                        System.out.println("Rock Breaks Scissors (Player B Wins!)");
                    }

                }
                //To validate player A moves if Paper
                else if (playerAMove.equalsIgnoreCase("Paper")) {

                    //To validate the moves for Player B
                    if (playerBMove.equalsIgnoreCase("Rock")) {
                        System.out.println("Paper covers Rock (Player A Wins!)");
                    } else if (playerBMove.equalsIgnoreCase("Scissors")) {
                        System.out.println("Scissors cuts Paper (Player B Wins!)");
                    }

                }
                //To validate player A moves if Rock
                else if (playerAMove.equalsIgnoreCase("Rock")) {

                    //To validate the moves for Player B
                    if (playerBMove.equalsIgnoreCase("Scissors")) {
                        System.out.println("Rock Breaks Scissors (Player A Wins!)");
                    } else if (playerBMove.equalsIgnoreCase("Paper")) {
                        System.out.println("Paper covers Rock(Player B Wins!)");
                    }
                }
            }


            //To create a variable for input
            String input = "";

            //To create a boolean if the user input is valid
            boolean validInput = false;
            do {
                //To prompt the user to play again
                System.out.print("Do you want to play again? [Y/N]: ");
                //To get the user input
                input = scanner.nextLine();


                //If input is n or N, then set continuePlaying to false, and validInput to true
                if (input.equalsIgnoreCase("n")) {
                    continuePlaying = false;
                    validInput = true;
                }
                //If input is y or Y, then set continuePlaying to true, and validInput to true
                else if (input.equalsIgnoreCase("y")) {
                    continuePlaying = true;
                    validInput = true;
                }
                //Else then set valid input to false;
                else {
                    validInput = false;
                }
            }
            //Loop while input is invalid
            while (!validInput);
        }

        System.out.println();
    }

    public static String getPlayerMove(Scanner scanner, String player) {
        //To perform a do while loop that will keep on looping
        String move = "";
        boolean validMove = false;
        do {
            //To prompt the options to the player
            System.out.println("Choose 1 of the following: ");
            System.out.println("R or r (Rock)");
            System.out.println("P or p (Paper)");
            System.out.println("S or s (Scissors");
            System.out.print(player + ", please select your move: ");
            //To get the input
            String input = scanner.nextLine();

            //To validate the input if r, p or s (non-case-sensitive validation so R, P, S are also valid)
            if (input.equalsIgnoreCase("r")) {
                move = "Rock";
                validMove = true;
            } else if (input.equalsIgnoreCase("p")) {
                move = "Paper";
                validMove = true;
            } else if (input.equalsIgnoreCase("s")) {
                move = "Scissors";
                validMove = true;
            } else {
                validMove = false;
            }

        }
        // To loop while move is invalid
        while (!validMove);

        //If the move is valid, then the loop will end. Then we will return move.
        return move;
    }
}
