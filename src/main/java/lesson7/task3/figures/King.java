package lesson7.task3.figures;

import lesson7.task3.chess.Chess;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class King extends ChessFigure {

    public King(Player player, String position) {
        super(player, position);
        figureType = "Король";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            int dx = Math.abs(candidate.getHORIZONTAL() - position.getHORIZONTAL());
            int dy = Math.abs(candidate.getVERTICAL() - position.getVERTICAL());
            if ((dx == 1 || dy == 1) && (dx + dy <= 2))
                availableMoves.add(candidate);
        }
        return availableMoves;
    }
}
