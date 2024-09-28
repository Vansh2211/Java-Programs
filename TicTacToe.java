import java.util.*;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public void TicTacToe(){
        board = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = '-';
            }
        }
        currentPlayer = 'X';
    }

    public void playGame(){
        Scanner sc = new Scanner(System.in);
        while(true){
            printBoard();
            System.out.println("Player" + currentPlayer + "'s turn. Enter row and column");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(row<0 || row>2 || col<0 || col>2){
                System.out.println("Invalid move. Try again!!");
                continue;
            }
            if(board[row][col] != '-'){
                System.out.println("cell already occupied");
                continue;
        
            }
            board[row][col] = currentPlayer;
            if(checkWin()){
                printBoard();
                System.out.println("Player" + currentPlayer + "wins");
                break;
            }
            if(checkDraw()){
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? '0':'X';

        }
    }

    private void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(board[i][j] + " ");

            }
            System.out.println();
        }

    }

    private boolean checkWin(){
        for(int i=0;i<3;i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-'){
                return true;
            }

        if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-'){
            return true;
        }

        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return true;
        }
    }
        return false;
        
    }

    
    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.board = new char[3][3]; // Initialize the board array
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            game.board[i][j] = '-'; // Initialize the board cells
        }
    }
    }
}
