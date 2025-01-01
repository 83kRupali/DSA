public class SudoKuSolver {

    public static void sudoKuSolver(char board[][]){
        sudoKuSolverHelper(board, 0, 0);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean sudoKuSolverHelper(char board[][], int row, int col){
        if(row == 9){
            return true;
        }

        int nextRow = row,  nextCol = col+1;

        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(board[row][col] != '.'){
            return sudoKuSolverHelper(board, nextRow, nextCol);
        }

        for(char dig = '1'; dig<='9'; dig++){

            if(isSafe(board , row, col , dig)){
                board[row][col] = dig;

                if(sudoKuSolverHelper(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = '.';   //Backtracking
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col, char dig){
       
        // Horizonatal
        for(int i=0; i<9; i++){
            if(board[row][i] == dig){
                return false;
            }
        }

        // vertical
        for(int i=0; i<9; i++){
            if(board[i][col] == dig){
                return false;
            }
        }

        int stRow = (row/3)*3;
        int stCol = (col/3)*3;


        for(int i=stRow; i<=stRow+2; i++){
            for(int j=stCol; j<=stCol+2; j++){
                if(board[i][j] == dig){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 9;
        char board[][] = {
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'}
        };

        sudoKuSolver(board);


        
    }
}
