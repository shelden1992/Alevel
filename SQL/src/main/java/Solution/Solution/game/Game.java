package Solution.Solution.game;

import java.util.List;
import java.util.Objects;

public class Game {
    private final long id;
    private final long score;

    public Game(long id, long score, List<Game> players, long winnerId) {
        this.id = id;
        this.score = score;
        this.players = players;
        this.winnerId = winnerId;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", score=" + score +
                ", players=" + players +
                ", winnerId=" + winnerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id &&
                score == game.score &&
                winnerId == game.winnerId &&
                Objects.equals(players, game.players);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, score, players, winnerId);
    }

    public long getId() {

        return id;
    }

    public long getScore() {
        return score;
    }

    public List<Game> getPlayers() {
        return players;
    }

    public long getWinnerId() {
        return winnerId;
    }

    private final List<Game>players;
    private final long winnerId;

}
