package TicTacToeSafeInput;

import java.util.Scanner;
public class TicTacToe {
    // Class variables
    private static final int ROW = 3;
    private static final int COL = 3;
    private static final String[][] board = new String[ROW][COL];

    public static void main(String[] args) {
        // Psudocode
        /**
         * Loop while player wants to play
         *      Clear the board and set player to X
         *      Loop while game is not finished
         *          Display the board
         *          Loop while inputs are invalid
         *              Get inputs for row and column coordinates
         *              Convert inputs into 0-based indexing by subtracting 1
         *          Put player into the valid location
         *          Check if there is a winner
         *              If so, game is finished
         *          Check if the game is tied
         *              If so, game is finished
         *          Else, toggle players
         *              Game is not finished
         *      Ask if player wants to play again
         */
        boolean play_again = true;
        Scanner console = new Scanner(System.in);

        while(play_again) {
            // Clear the board and set player to X
            clearBoard();
            String curr_player = "X";

            // Loop while there is no winner or not tied
            boolean finished = false;
            while (!finished) {
                System.out.println("Current player: " + curr_player);

                // Displays the board
                display();

                int row = -1, col = -1;

                // Loop until the converted player coordinates are a valid move
                while (!isValidMove(row, col)) {
                    // Get the row and column coordinates for the move
                    row = SafeInput.getRangedInt(console, "Enter row: ", 1, ROW);
                    col = SafeInput.getRangedInt(console, "Enter column: ", 1, COL);
                    //Convert player coordinates to array indices
                    row = row - 1;
                    col = col - 1;

                    if (!isValidMove(row, col)) {
                        System.out.println("ERR: The location might be already taken or is out or bounds. Try again.");
                    }
                }
                // If valid, put the player in that location
                board[row][col] = curr_player;

                System.out.println();

                // Check for tie
                if (isWin(curr_player)) {
                    System.out.println("The winner is: " + curr_player + "\n");
                    display();
                    finished = true;
                }
                else if (isTie()) {
                    System.out.println("Game tied. There is no winner.\n");
                    finished = true;
                }
                // Toggle players
                else {
                    if (curr_player.equals("X")) {
                        curr_player = "O";
                    } else {
                        curr_player = "X";
                    }
                }
            }
            play_again = SafeInput.getYNConfirm(console, "Would you like to play again? [y/yes/n/no]: ");
        }
    }

    /**
     * Sets each element in baord to a whitespace
     */
    public static void clearBoard() {
        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < COL; j++) {
                board[i][j] = " ";
            }
        }
    }

    /**
     * Displays the game board
     */
    private static void display() {
        System.out.println("BOARD:");
        for(int i = 0; i < ROW; i++) {
            System.out.print("|");          // left border
            for(int j = 0; j < COL; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();           // border
        }
    }

    /**
     * Validates if the move in specified row and column is valid
     *      -> valid move indicates it is in range and the iet in location is a whitespace
     * @param row
     * @param col
     * @return
     */
    public static boolean isValidMove(int row, int col) {
        // Check if in range
        if(row < 0 || row >= ROW || col < 0 || col >= COL) {
            return false;
        }
        // Check if whitespace, return true if so
        return board[row][col].equals(" ");
    }

    /**
     * Determines if there is a win in the game by calling three sub-helper functions
     * to check colum, row, and diagonal wins
     * @param player
     * @return
     */
    private static boolean isWin(String player) {
        boolean column_win = isColWin(player);
        boolean row_win = isRowWin(player);
        boolean diagonal_win = isDiagonalWin(player);

        return (column_win || row_win || diagonal_win);
    }

    /**
     * Determines if there is a winning column in a board by the player
     * @param player
     * @return
     */
    private static boolean isColWin(String player) {
        boolean win = false;

        for(int i = 0; i < ROW; i++) {
            int score = 0;
            // Loop through each column and find if won
            for(int j = 0; j < COL; j++) {
                if(board[j][i].equals(player)) {
                    score += 1;
                }
            }
            // If scores are equal to ROW count, then a column was won by the player
            if(score == ROW) {
                win = true;
            }
        }

        return win;
    }

    /**
     * Determines if there is a winning row in a board by the player
     * @param player
     * @return
     */
    private static boolean isRowWin(String player) {
        boolean win = false;

        for(int i = 0; i < ROW; i++) {
            int score = 0;
            // Loop through each row and find if won
            for(int j = 0; j < COL; j++) {
                if(board[i][j].equals(player)) {
                    score += 1;
                }
            }
            // If scores are equal to COLUMN count, then a column was won by the player
            if(score == COL) {
                win = true;
            }
        }

        return win;
    }

    /**
     * Determines if there is a winning diagonal in a board by the player
     * @param player
     * @return
     */
    private static boolean isDiagonalWin(String player) {
        boolean win = false;
        int score1 = 0, score2 = 0;

        for(int i = 0; i < ROW; i++) {
            // Check from top-left thru bottom-right
            if(board[i][i].equals(player)) {
                score1 += 1;
            }
            // Check from top-right thru bottom-left
            if(board[i][COL - 1 - i].equals(player)) {
                score2 += 1;
            }
        }

        // If scores are equal to ROW AND COLUMN count, then a column was won by the player
        if((score1 == COL && score1 == ROW) || (score2 == COL && score2 == ROW)) {
            win = true;
        }

        return win;
    }

    /**
     * Checks if the game is tied of all spaces are filled
     * @return
     */
    private static boolean isTie() {
        // Counter for empty spaces, initially 0
        int spaces = 0;

        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < COL; j++) {
                if(board[i][j].equals(" ")) {
                    spaces += 1;
                }
            }
        }

        // If there is no empty spaces, then the game is tied
        return spaces == 0;
    }
}
