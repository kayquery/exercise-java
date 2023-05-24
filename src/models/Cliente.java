package models;
import java.sql.Date;
import java.util.List;

public class Cliente {
    public String nome;
    public Date dataNascimento;

    public List<Contratacao> contratacao;
}