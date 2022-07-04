package lesson17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"), QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"), BISHOP_WRITE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_WRITE(3, "♘"), KNIGHT_BLACK(3, "♞"), PAWN_WRITE(1, "♙"), PAWN_BLACK(1, "♟");
    private double level;
    private String name;

    ChessPiece(double level, String name) {
        this.level = level;
        this.name = name;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "level=" + level +
                ", name='" + name + '\'' +
                '}';
    }
}
