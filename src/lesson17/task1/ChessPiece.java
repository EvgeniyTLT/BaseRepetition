package lesson17.task1;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"), QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"), BISHOP_WRITE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_WRITE(3, "♘"), KNIGHT_BLACK(3, "♞"), PAWN_WRITE(1, "♙"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");
    private double value;
    private String representation;

    ChessPiece(double level, String representation) {
        this.value = level;
        this.representation = representation;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return representation;
    }

    public void setName(String name) {
        this.representation = name;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "value=" + value +
                ", representation='" + representation + '\'' +
                '}';
    }
}
