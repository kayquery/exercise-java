package models;
import java.sql.Date;
import java.util.List;

public class Contratacao {

    public float valor;
    public Date dataContratacao;

    public Cliente cliente;
    public List<Pacote> pacotes;
}