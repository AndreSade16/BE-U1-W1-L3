package Es3;

import java.util.Date;
import java.util.Random;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(String nome, String cognome, String email) {
        Random random = new Random();
        this.codiceCliente = "124135134134";
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = new Date();

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente='" + codiceCliente + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }
}
