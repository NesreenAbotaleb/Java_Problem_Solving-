package CH07;

import java.util.*;

public class EX07_20 {
    
    public static final int ROWS = 6;
    public static final int COLUMNS = 7;
    
    public static void main(String[] args) {
        char[][] board = new char[ROWS][COLUMNS];
        initializeBoard(board);
        
        Scanner scanner = new Scanner(System.in);

        char currentPlayer = 'R';
        boolean gameOver = false;
        
        while (!gameOver) {
            printBoard(board);

            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter column (1-" + COLUMNS + "): ");
            int column = scanner.nextInt() - 1;

            if (isValidMove(board, column)) {
                dropDisk(board, currentPlayer, column);
                if (isWin(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameOver = true;
                } else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer == 'R') ? 'Y' : 'R';
                }
            } else {
                System.out.println("Invalid move. Please choose another column.");
            }
        }

    }
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public static void printBoard(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("  1   2   3   4   5   6   7");
    }
    //if the row 0  is valid that's mean the column is not completed
     public static boolean isValidMove(char[][] board, int column) {
        return (column >= 0 && column < COLUMNS && board[0][column] == ' ');
    }
    //find the valid row in the selected column to drop the disk in it 
    public static void dropDisk(char[][] board, char player, int column) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][column] == ' ') {
                board[i][column] = player;
                break;
            }
        }
    }
    
     public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j] == ' ') 
                    
                    return false;
                
            }
        }
        return true;
    }
    
    public static boolean isWin(char[][] board, char player) {
        // Check horizontal
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j <= COLUMNS - 4; j++) {
                if (board[i][j] == player && board[i][j + 1] == player &&
                        board[i][j + 2] == player && board[i][j + 3] == player) 
                
                    return true;
                
            }
        }

        // Check vertical
        for (int i = 0; i <= ROWS - 4; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j] == player && board[i + 1][j] == player &&
                        board[i + 2][j] == player && board[i + 3][j] == player)
                    
                    return true;
                
            }
        }

        // Check diagonals
        for (int i = 0; i <= ROWS - 4; i++) {
            for (int j = 0; j <= COLUMNS - 4; j++) {
                if (board[i][j] == player && board[i + 1][j + 1] == player &&
                        board[i + 2][j + 2] == player && 
                        board[i + 3][j + 3] == player)
                    
                    return true;
                
                if (board[i][j + 3] == player && board[i + 1][j + 2] == player
                        && board[i + 2][j + 1] == player 
                        && board[i + 3][j] == player) 
                    
                    return true;
                
            }
        }

        return false;
    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int column ;
//        int row1 = 5;        
//        int row2 = 5;
//        int row3 = 5;
//        int row4 = 5;
//        int row5 = 5;
//        int row6 = 5;
//        int row7 = 5;
//
//        
//        char [][] board = new char[6][7];
//        for (int i = 0; i < 30; i++) {
//            System.out.print("Drop a red disk at column (0-6) :");
//            column = input.nextInt();
//            switch(column){
//                case 0 : board[row1][0] = 'R';
//                if(row1 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row1--;
//                    break;
//                case 1 : board[row2][1] = 'R';
//                if(row2 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row2--;
//                    break;
//                case 2 : board[row3][2] = 'R';
//                if(row3 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row3--;
//                    break;
//                case 3 : board[row4][3] = 'R';
//                if(row4 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row4--;
//                    break;
//                case 4 : board[row5][4] = 'R';
//                if(row5 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row5--;
//                    break;
//                case 5 : board[row6][5] = 'R';
//                if(row6 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row6--;
//                    break;
//                case 6 : board[row7][6] = 'R';
//                if(row7 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row7--;
//                    break;
//                    
//            }
//            if(isWin(board)){
//                System.out.println("The red player is won");
//                break;
//            }
//            System.out.print("Drop a yellow disk at column (0-6) :");
//            column = input.nextInt();
//            switch(column){
//                case 0 : board[row1][0] = 'Y';
//                if(row1 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row1--;
//                    break;
//                case 1 : board[row2][1] = 'Y';
//                if(row2 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row2--;
//                    break;
//                case 2 : board[row3][2] = 'Y';
//                if(row3 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row3--;
//                    break;
//                case 3 : board[row4][3] = 'Y';
//                if(row4 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row4--;
//                    break;
//                case 4 : board[row5][4] = 'Y';
//                if(row5 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row5--;
//                    break;
//                case 5 : board[row6][5] = 'Y';
//                if(row6 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row6--;
//                    break;
//                case 6 : board[row7][6] = 'Y';
//                if(row7 < 0){
//                    System.out.println("this column is full try again");
//                    continue;
//                }
//                    print(board);
//                    row7--;
//                    break;
//                    
//            }
//            if(isWin(board)){
//                System.out.println("The yellow player is won");
//                break;
//            }
//            
//        }
//        
//    }
//    
//     public static void print(char board[][] ){
//        System.out.print("--------------------------------------------"
//                + "\n|\t");
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print(board[i][j] + "\t|\t");
//            }
//            System.out.print("\n|\t");
//        }
//    }
//    public static boolean isWin( char board[][]){
//        char [] winnerA = new char[4];
//        char [] winnerB = new char[4];
//        char [] winnerC = new char[4];
//        int row = 0;
//        int start = 0;
//        for (int i = 5; i >= 0; i--) {
//            for (int j = 0; j < 7; j++) {
//                winnerA[row] = board[i][j];
//                //winnerB[row] = board[j][i];
//                row++;
//                if(winnerA[0] == winnerA[1] && winnerA[1] == winnerA[2] && 
//                        winnerA[2] == winnerA[3] && winnerA[0] != '\u0000'){
//                    return true;
//                }
//                                            
//                if(j % 4 == 0){
//                    row = 0;
//                    j = ++start;
//                }
//            }
//            
//           
//
//        }
//        start = 0;
//        row = 0;
//        for (int i = 0; i < 6; i++) {
//            for (int j = i; j < i+1; j++) {
//                winnerC[row] = board[i][j];
//                if (winnerC[0] == winnerC[1] && winnerC[1] == winnerC[2] && 
//                        winnerC[2] == winnerC[3] && winnerC[0] != '\u0000') {
//                    return true;
//                }
//                if(j % 4 == 0 && j < 6){
//                    row = 0;
//                    j = ++start;
//                }
//            }
//        }
//        start = 5;
//        row = 0;
//        for (int i = 0; i < 7; i++) {
//            for (int j = 5; j >= 0; j--) {
//                winnerB[row] = board[j][i];
//                row++;
//                if (winnerB[0] == winnerB[1] && winnerB[1] == winnerB[2] && 
//                        winnerB[2] == winnerB[3] && winnerB[0] != '\u0000') {
//                    return true;
//                }
//                
//                if(j % 3 == 0){
//                    row = 0;
//                    j = --start;
//                }
//            }
//            
//        }
//        
//        return false;
//    }
}
