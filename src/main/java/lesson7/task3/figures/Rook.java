package lesson7.task3.figures;

import lesson7.task3.chess.Chess;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Rook extends ChessFigure {

    public Rook(Player player, String position) {
        super(player, position);
        figureType = "Ладья";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            int dx = Math.abs(candidate.getHORIZONTAL() - position.getHORIZONTAL());
            int dy = Math.abs(candidate.getVERTICAL() - position.getVERTICAL());
            if (dx == 0 && dy == 0) continue;
            if (dx == 0 || dy == 0)
                availableMoves.add(candidate);
        }
        return availableMoves;
    }
}
