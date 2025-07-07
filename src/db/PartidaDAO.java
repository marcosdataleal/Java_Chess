package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PartidaDAO {

    public static void salvarPartida(String jogadorBranco, String jogadorPreto, String vencedor) {
        String sql = "INSERT INTO partidas (jogador_branco, jogador_preto, vencedor) VALUES (?, ?, ?)";

        try (Connection conn = Database.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, jogadorBranco);
            pstmt.setString(2, jogadorPreto);
            pstmt.setString(3, vencedor);
            pstmt.executeUpdate();
            System.out.println("Partida salva com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}