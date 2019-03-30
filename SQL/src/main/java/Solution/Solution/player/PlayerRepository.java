package Solution.Solution.player;



import Solution.Solution.common.Repository;
import Solution.Solution.common.StorageException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

    public final class PlayerRepository implements Repository<Player, Long> {

        private final Supplier<Connection> connectionSupplier;

        public PlayerRepository(Supplier<Connection> connectionSupplier) {
            this.connectionSupplier = connectionSupplier;
        }

        @Override
        public void save(Player entity) throws StorageException {
            String nickname = entity.getNickname();
            long score = entity.getScore();
            String sql = "INSERT INTO players (name, score) VALUES (?, ?) " +
                    "ON DUPLICATE KEY UPDATE name = ?, score = ?";
            try (PreparedStatement statement = connectionSupplier.get().prepareStatement(sql)) {
                statement.setString(1, nickname);
                statement.setLong(2, score);
                statement.setString(3, nickname);
                statement.setLong(4, score);
                statement.executeUpdate();
            } catch (SQLException e) {
                throw new StorageException(e);
            }

        }

        @Override
        public List<Player> list() throws StorageException {
            String sql = "SELECT players.id id, players.name name, ranks.name player_rank, players.score score " +
                    "FROM players INNER JOIN ranks " +
                    "ON players.score >= lower_t AND players.score < upper_t";
            try (PreparedStatement statement = connectionSupplier.get().prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                List<Player> players = new LinkedList<>();
                while (resultSet.next()) {
                    players.add(new Player(
                            resultSet.getLong("id"),
                            resultSet.getString("name"),
                            resultSet.getString("player_rank"),
                            resultSet.getLong("score")
                    ));
                }
                return players;
            } catch (SQLException e) {
                throw new StorageException(e);
            }
        }

        @Override
        public Player get(Long id) {

            String sql = "SELECT players.id id, players.name name, ranks.name player_rank, players.score score " +
                    "FROM players INNER JOIN ranks " +
                    "ON players.score BETWEEN lower_t AND players.score < upper_t -1 "+
                    "WHERE players.id = ?";


            try (PreparedStatement statement = connectionSupplier.get().prepareStatement(sql)) {
                statement.setLong(1, id);


                ResultSet resultSet = statement.executeQuery();
                Player player;
                if (resultSet.first()) {
                    player = buildPlayerFromResultSet(resultSet);
                } else {
                    player = null;
                }
                return player;


            } catch (SQLException e) {
                e.printStackTrace();

            }
            return null;
        }


        @Override
        public void delete(Player entity) throws StorageException {
            String sql = "DELETE FROM players WHERE id = ?";
            try (PreparedStatement statement = connectionSupplier.get().prepareStatement(sql)) {
                statement.setLong(1, entity.getId());
                statement.executeUpdate();
            } catch (SQLException e) {
                throw new StorageException(e);
            }
        }

        private static Player buildPlayerFromResultSet(ResultSet resultSet) throws SQLException {
            return new Player(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("player_rank"),
                    resultSet.getLong("score")
            );
        }
    }

