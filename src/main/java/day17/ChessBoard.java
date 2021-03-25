package day17;

public class ChessBoard {
    ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for (ChessPiece[] firstDimension : chessBoard) {
            for (ChessPiece  secondDimension: firstDimension) {
            System.out.printf("%s", secondDimension);
            }
            System.out.println();
        }
    }
}
