package game.pieces;

public class Knight {
    private boolean isWhite;

    public Knight(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isValidMove(int currentRow, int currentCol, int newRow, int newCol, String[][] board, String pieceType) {
        int rowChange = Math.abs(newRow - currentRow);
        int colChange = Math.abs(newCol - currentCol);

        boolean isLShape = (rowChange == 2 && colChange == 1) || (rowChange == 1 && colChange == 2);

        boolean isTargetSquareEmpty = board[newRow][newCol].equals(" ");
        boolean isOpponentPiece = isWhite ? Character.isLowerCase(board[newRow][newCol].charAt(0)) :
                Character.isUpperCase(board[newRow][newCol].charAt(0));

        return isLShape && (isTargetSquareEmpty || isOpponentPiece);
    }
}

