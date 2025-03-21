package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessPiece[][] getBoard() {
        return board;
    }

     public ChessBoard(ChessPiece[][] chessPiece) {
        this.board = chessPiece;
    }

        public void print(){
            for(int i = 0; i < board.length; i++){
                for (int j = 0; j <  board.length; j++){
                    System.out.print(board[i][j].getStringValue());
                }
                System.out.println();
            }
    }
}
