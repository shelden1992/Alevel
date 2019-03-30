package Solution.Solution.game;

import Solution.Solution.common.Repository;
import Solution.Solution.common.StorageException;

import java.sql.Connection;
import java.util.List;
import java.util.function.Supplier;

public class GameRepository implements Repository<Game, Long> {

    private final Supplier<Connection> connectionSupplier;

    public GameRepository(Supplier<Connection> connectionSupplier) {
        this.connectionSupplier = connectionSupplier;
    }

    @Override
    public void save(Game entity) throws StorageException {



        long id_winner = entity.getWinnerId();
        long score = entity.getScore();
        String sql = "INSERT INTO   ";
    }

    @Override
    public List<Game> list() throws StorageException {
        return null;
    }

    @Override
    public Game get(Long aLong) throws StorageException {
        return null;
    }

    @Override
    public void delete(Game entity) throws StorageException {

    }
}
