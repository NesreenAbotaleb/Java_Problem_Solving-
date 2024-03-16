package CH07;

public class EX07_10 {

    public static void main(String[] args) {
        int [][] board = new int [3][3];
        int c;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c = (int) (Math.random() * 10 + 1);
                if (c >= 5) {
                    board[i][j] = 1;
                }else
                    board[i][j] = 0;
            }
        }
 
        print(board);
        win(board);
    }
    public static void win(int [][] board){
        int [] winnerA = new int [3];
        int [] winnerB = new int [3];
        int [] winnerC = new int [3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                winnerA[j] = board[i][j];
                winnerC[j] = board[j][i];
                
            }
            
            winnerB[i] = board[i][i];
            if(winnerA [0] == winnerA [1] && winnerA [2] == winnerA [1] &&
                    (winnerA[0] == 0)){
                    System.out.println("All 0s on row " + i); 
            }
            if(winnerA [0] == winnerA [1] && winnerA [2] == winnerA [1] &&
                    (winnerA[0] == 1)){
                System.out.println("All 1s on row " + i); 
            }
            if(winnerC [0] == winnerC [1] && winnerC [2] == winnerC [1] &&
                    (winnerC[0] == 0)){
                System.out.println("All 0s on column " + i); 
            }
            if(winnerC [0] == winnerC [1] && winnerC [2] == winnerC [1] &&
                    (winnerC[0] == 1)){
                System.out.println("All 1s on column " + i); 
            }

            
        }
        if(winnerB [0] == winnerB [1] && winnerB [2] == winnerB [1] && 
                (winnerB[0] == 0))
            System.out.println( "All 0s is diagonal");
        if(winnerB [0] == winnerB [1] && winnerB [2] == winnerB [1] && 
                (winnerB[0] == 1))
            System.out.println( "All 1s is diagonal");
        
        
    
    }

    public static void print(int [][] board){
        for (int[] board1 : board) {
            for (int j = 0; j < board1.length; j++) {
                System.out.print(board1[j] + " ");
            }
            System.out.println("");
        }
    }
}
