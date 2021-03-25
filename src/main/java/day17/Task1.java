package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        List<ChessPiece> chessPieces = new ArrayList<>();
//        for (int i = 0; i < 4 * 2; i++) {
//            if (i < 4)
//                chessPieces.add(ChessPiece.PAWN_WHITE);
//            else
//                chessPieces.add(ChessPiece.ROOK_BLACK);
//        }
////        //Проверка
////        System.out.println(chessPieces);
//        //Вывод в консоль
//        for (ChessPiece cp : chessPieces) {
//            System.out.printf("%s ", cp);
//        }

        ChessPiece chessPieces[] = new ChessPiece[8];
        for (int i = 0; i < 4 * 2; i++) {
            if (i < 4)
                chessPieces[i] = ChessPiece.PAWN_WHITE;
            else
                chessPieces[i] = ChessPiece.ROOK_BLACK;
        }
        //Вывод в консоль
        for (ChessPiece cp : chessPieces) {
            System.out.printf("%s ", cp);
        }

    }
}