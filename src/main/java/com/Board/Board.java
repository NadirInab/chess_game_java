package main.java.com.Board;

public class Board {

    private Position[][] position ;
    private String[][] board ;


    public Board(){}

    public Board(Position[][] position, String[][] board) {
        this.position = position;
        this.board = board;
    }

    public Position[][] getPosition() {
        return position;
    }

    public void setPosition(Position[][] position) {
        this.position = position;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    private void initializeBoard() {
        // Initialize the board with empty squares
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = " -";
            }
        }

        // Place the initial chess pieces
        // You can represent different pieces with their symbols (e.g., "K" for King, "Q" for Queen, "P" for pieces.Pawn, etc.)
        // You'll need to implement the full board setup according to the starting chess positions.
        // This is just a simplified example:
        board[0][0] = "♖"; // Rook
        board[0][1] = "♘"; // Knight
        board[0][2] = "♗"; // Bishop
        board[0][3] = "♕"; // Queen
        board[0][4] = "♔"; // King
        board[0][5] = "♗"; // Bishop
        board[0][6] = "♘"; // Knight
        board[0][7] = "♖"; // Rook

        board[7][0] = "♜"; // Rook
        board[7][1] = "♞"; // Knight
        board[7][2] = "♝"; // Bishop
        board[7][3] = "♛"; // Queen
        board[7][4] = "♚"; // King
        board[7][5] = "♝"; // Bishop
        board[7][6] = "♞"; // Knight
        board[7][7] = "♜"; // Rook

        for (int col = 0; col < 8; col++) {
            board[1][col] = "♙"; // White Pawns
            board[6][col] = "♟"; // Black Pawns
        }
    }

    public void displayBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board chessBoard = new Board();
        chessBoard.displayBoard();
        //System.out.println(pieces.ColorsBoard.BLACK);
    }
}
