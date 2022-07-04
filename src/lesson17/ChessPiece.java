package lesson17;

public enum ChessPiece {
    KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, ROOK_WHITE, ROOK_BLACK, BISHOP_WRITE, BISHOP_BLACK,
    KNIGHT_WRITE, KNIGHT_BLACK;
    private int level;
    private String name;

    ChessPiece(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
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
