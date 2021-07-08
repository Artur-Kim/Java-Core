package lesson7.task3;

import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;
import lesson7.task3.figures.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
        figures.add(new Pawn(Player.WHITE, "C4"));
        figures.add(new Pawn(Player.BLACK, "A5"));
        figures.add(new Queen(Player.WHITE, "G5"));
        figures.add(new Pawn(Player.BLACK, "F3"));
        figures.add(new Knight(Player.BLACK, "C3"));
        figures.add(new Pawn(Player.WHITE, "H3"));
        figures.add(new Pawn(Player.BLACK, "A4"));
        figures.add(new Rook(Player.WHITE, "C8"));
        figures.add(new Pawn(Player.BLACK, "G6"));
        figures.add(new Bishop(Player.WHITE, "E4"));
        figures.add(new Queen(Player.BLACK, "C5"));
        figures.add(new King(Player.BLACK, "G1"));


        for (ChessFigure figure : figures)
            printMoves(figure);

    }

    private static void printMoves(ChessFigure figure) {
        Set<Position> positions = figure.getAvailableMoves();
        StringBuilder sb = new StringBuilder(figure.getFigureType())
                .append(" (").append(figure.getPosition()).append("):");
        Iterator<Position> iterator = positions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(", ").append(position.getPosition());
        }
        System.out.println(sb.toString().replaceFirst(",", ""));
    }
}
