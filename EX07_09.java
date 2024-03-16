package CH07;

import java.util.*;
//TicTacToe
public class EX07_09 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row , colum;
        
        char [][] board = new char[3][3];
        
        for(int i = 0 ; i < 10 ; i++){
            System.out.print("Enter a row (1, 2, or 3) for player X: ");
            row = input.nextInt();
            colum = input.nextInt();
            if(board[row - 1][colum - 1]  != '\u0000'){
                System.out.println("this input is unavailable");
                
                System.out.print("Enter a row and the column sperated by space"
                        + "(1, 2, or 3) for player X: ");
                row = input.nextInt();
                colum = input.nextInt();
            }
            board[row - 1][colum - 1] = 'X';
            print(board);
            if(isWin(board)){
                System.out.println("X is win");
                break;
            }
            System.out.print("Enter a row (1, 2, or 3) for player O: ");
            row = input.nextInt();
            colum = input.nextInt();
            if(board[row - 1][colum - 1]  != '\u0000'){
                System.out.println("this input is unavailable");
                
                System.out.print("Enter a row (1, 2, or 3) for player O: ");
                row = input.nextInt();
                colum = input.nextInt();
            }
            board[row - 1][colum - 1] = 'O';
            print(board);
            if(isWin(board)){
                System.out.println("O is win");
                break;
            }

        }
    }
    public static void print(char board[][] ){
        for (int i = 0; i < 3; i++) {
            System.out.print("-----------------------------------------------"
                    + "\n|\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "\t|\t ");
            }
            System.out.println("");
        }
    }
    public static boolean isWin(char board[][]){
        char [] winnerA = new char [3];
        char [] winnerB = new char [3];
        char [] winnerC = new char [3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                winnerA[j] = board[i][j];
                winnerC[j] = board[j][i];

            }
            
            winnerB[i] = board[i][i];
            if(winnerA [0] == winnerA [1] && winnerA [2] == winnerA [1] &&
                    (winnerA[0] != '\u0000')){
                return true;
            }
            else if(winnerC [0] == winnerC [1] && winnerC [2] == winnerC [1] &&
                    (winnerC[0] != '\u0000')){
                return true;
            }
        }
        if(winnerB [0] == winnerB [1] && winnerB [2] == winnerB [1] && 
                (winnerB[0] != '\u0000'))
            return true;
        
        return false;
    }
}
