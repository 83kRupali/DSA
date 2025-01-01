import java.util.Arrays;

public class NQueens {

    public static void nQueens(char board[][], int row, int n){

        if(row == n){
            System.out.println(" board....................");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]+"  ");
                }
                System.out.println();
            }
            return;

        }

        for(int j=0; j<n; j++){
            if(isSafe(board, row, j, n)){
                board[row][j] = 'Q';
                nQueens(board, row+1, n);
                board[row][j] = '.';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col, int n){
         // Vertical   // row
        for(int i=0; i<n; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

         // Horizontal  // col
         for(int j=0; j<n; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //diagoanl left

        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right
        for(int i=row, j=col; i>=0 && j<n; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] ={
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'}
        };
        //char board[][] = new char[n][n];

        nQueens(board, 0, n);
    

        

    }
}
