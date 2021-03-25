package day17;

public class Task2 {
    public static void main(String[] args) {
        //Создание двумерного массива с расположением фигур (матч Крамник - Каспаров 2000 года).
        ChessPiece chess[][] = new ChessPiece[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                chess[i][j] = ChessPiece.EMPTY;
            }
            switch (i) {
                case 0:
                    chess[i][0] = ChessPiece.ROOK_BLACK;
                    chess[i][5] = ChessPiece.ROOK_BLACK;
                    chess[i][6] = ChessPiece.KING_BLACK;
                    break;
                case 1:
                    chess[i][1] = ChessPiece.ROOK_WHITE;
                    chess[i][4] = ChessPiece.PAWN_BLACK;
                    chess[i][5] = ChessPiece.PAWN_BLACK;
                    chess[i][7] = ChessPiece.PAWN_BLACK;
                    break;
                case 2:
                    chess[i][0] = ChessPiece.PAWN_BLACK;
                    chess[i][2] = ChessPiece.KNIGHT_BLACK;
                    chess[i][6] = ChessPiece.PAWN_BLACK;
                    break;
                case 3:
                    chess[i][0] = ChessPiece.QUEEN_BLACK;
                    chess[i][3] = ChessPiece.BISHOP_WHITE;
                    break;
                case 4:
                    chess[i][3] = ChessPiece.BISHOP_BLACK;
                    chess[i][4] = ChessPiece.PAWN_WHITE;
                    break;
                case 5:
                    chess[i][4] = ChessPiece.BISHOP_WHITE;
                    chess[i][5] = ChessPiece.PAWN_WHITE;
                    break;
                case 6:
                    chess[i][0] = ChessPiece.PAWN_WHITE;
                    chess[i][3] = ChessPiece.QUEEN_WHITE;
                    chess[i][5] = ChessPiece.PAWN_WHITE;
                    chess[i][7] = ChessPiece.PAWN_WHITE;
                    break;
                case 7:
                    chess[i][6] = ChessPiece.ROOK_WHITE;
                    chess[i][5] = ChessPiece.KING_WHITE;
                    break;

            }
        }

        //Новый объект класса ChessBoard, в качестве аргумента двумерный массив с расположением фигур
        ChessBoard chessB = new ChessBoard(chess);
        //Вывод в консоль
        chessB.print();

    }

}
