package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String URL = "jdbc:sqlite:chess.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS partidas (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "jogador_branco TEXT NOT NULL," +
                     "jogador_preto TEXT NOT NULL," +
                     "vencedor TEXT," +
                     "data TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                     ");";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'partidas' verificada/criada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}