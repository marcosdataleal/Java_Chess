package app;

import db.PartidaDAO;

public class Partida {
    private String jogadorBranco;
    private String jogadorPreto;
    private String vencedor;

    public Partida(String jogadorBranco, String jogadorPreto, String vencedor) {
        this.jogadorBranco = jogadorBranco;
        this.jogadorPreto = jogadorPreto;
        this.vencedor = vencedor;
    }

    public void salvarResultado() {
        PartidaDAO.salvarPartida(jogadorBranco, jogadorPreto, vencedor);
    }
}