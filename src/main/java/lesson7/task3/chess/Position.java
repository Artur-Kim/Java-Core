package lesson7.task3.chess;

public class Position {
    private final char HORIZONTAL;
    private final int VERTICAL;

    public Position(String position) {
        this.HORIZONTAL = position.split("")[0].toCharArray()[0];
        this.VERTICAL = Integer.parseInt(position.split("")[1]);
    }

    public int getHORIZONTAL() {
        return HORIZONTAL;
    }

    public int getVERTICAL() {
        return VERTICAL;
    }

    public String getPosition() {
        String letterHorizontal = String.valueOf(HORIZONTAL);
        return letterHorizontal + VERTICAL;
    }
}
