import java.util.HashSet;

public class Sudoku {

    public static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] Grid = {
                {1, 2,  3,	4,	5,	6,	7,	8,	9},
                {4,	5,	6,	7,	8,	9,	1,	2,	3},
                {7,	8,	9,	1,	2,	3,	4,	5,	6},
                {9,	1,	2,	3,	4,	5,	6,	7,	8},
                {3,	4,	5,	6,	7,	8,	9,	1,	2},
                {6,	7,	8,	9,	1,	2,	3,	4,	5},
                {8,	9,	1,	2,	3,	4,	5,	6,	7},
                {2,	3,	4,	5,	6,	7,	8,	9,	1},
                {5,	6,	7,	8,	9,	1,	2,	3,	4}};


        if(solveBoard(Grid)){
            System.out.println("Solved");
        }else {
            System.out.println("Not Solved");
        }
    }
    public static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean solveBoard(int[][] board) {
        HashSet <String> seen = new HashSet<>();
        for (int i = 0; i < GRID_SIZE ; i++) {
            for (int j = 0; j < GRID_SIZE ; j++) {
                int number = board[i][j];
                if(number != '.'){
                    if(!seen.add(number+" in row"+i) || !seen.add(number+" in col"+j) || !seen.add(number+" in sub grid "+ i/3+ "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

