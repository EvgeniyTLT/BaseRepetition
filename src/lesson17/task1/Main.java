package lesson17.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = new ChessPiece[8];
        ChessPiece chessPiece1 = ChessPiece.PAWN_WRITE;
        ChessPiece chessPiece2 = ChessPiece.ROOK_BLACK;
        for (int i = 0; i < 8; i++) {
            if (i < 4) chessPieces[i] = chessPiece1;
            else chessPieces[i] = chessPiece2;
        }
        for (ChessPiece u : chessPieces
        ) {
            System.out.print(u.getName());
        }

    }
}

