package CH06;

public class EX06_20 {
    
    public static void main(String[] args) {
        int [] columns = new int[8];
        char [] row1 = new char[8];        
        char [] row2 = new char[8];
        char [] row3 = new char[8];
        char [] row4 = new char[8];
        char [] row5 = new char[8];
        char [] row6 = new char[8];
        char [] row7 = new char[8];
        char [] row8 = new char[8];

        //columns[0] = (int)(Math.random() * 9);
        int col ;
        for (int i = 0; i < 8; i++) {
            col = (int)(Math.random() * 9);
            if (isColumnSafe(col , columns)) {
                columns[i] = col;
            }else{
                i--;
            }
        }
//        row1[columns[0]] ='Q';
//        row2[columns[1]] ='Q';
//        row3[columns[2]] ='Q';
//        row4[columns[3]] ='Q';
//        row5[columns[4]] ='Q';
//        row6[columns[5]] ='Q';
//        row7[columns[6]] ='Q';
//        row8[columns[7]] ='Q';
        int i = 0;
        while (i < 8) {
            System.out.print("|\t");
            for (int j = 0; j < 8; j++) {
                
                row1[columns[i]] ='Q';
                System.out.print(row1[j] + "\t|\t");
            }
            System.out.println("");
            i++;
        }

        
    }
    public static boolean isColumnSafe(int num , int [] arr){
        for (int i = 0; i < 8; i++) {
            if (num == arr[i]) {
                return false;
            }
        }
        for (int i = 0; i < 8; i++) {
            
        }
        
        return true;
    }
}
