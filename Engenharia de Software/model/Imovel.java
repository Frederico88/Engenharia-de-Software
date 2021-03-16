package model;

public class Imovel {
    private boolean disponibilidade;
    private int maxPreco;
    private int minPreco;
    private int idCodigo;
    private String Endereco;
    private String idTipo;
    private double idValor;
    private String idOperacao;
    private int idQuartos;
    private int idBanheiros;
    private int idVagaGaragem;

    public Imovel(boolean disponibilidade, int idCodigo, String endereco, String idTipo, double idValor,
            String idOperacao, int idQuartos, int idBanheiros, int idVagaGaragem) {
        this.disponibilidade = disponibilidade;
        this.idCodigo = idCodigo;
        Endereco = endereco;
        this.idTipo = idTipo;
        this.idValor = idValor;
        this.idOperacao = idOperacao;
        this.idQuartos = idQuartos;
        this.idBanheiros = idBanheiros;
        this.idVagaGaragem = idVagaGaragem;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public int getIdVagaGaragem() {
        return idVagaGaragem;
    }

    public void setIdVagaGaragem(int idVagaGaragem) {
        this.idVagaGaragem = idVagaGaragem;
    }

    public int getIdBanheiros() {
        return idBanheiros;
    }

    public void setIdBanheiros(int idBanheiros) {
        this.idBanheiros = idBanheiros;
    }

    public int getIdQuartos() {
        return idQuartos;
    }

    public void setIdQuartos(int idQuartos) {
        this.idQuartos = idQuartos;
    }

    public String getIdOperacao() {
        return idOperacao;
    }

    public void setIdOperacao(String idOperacao) {
        this.idOperacao = idOperacao;
    }

    public double getIdValor() {
        return idValor;
    }

    public void setIdValor(double idValor) {
        this.idValor = idValor;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public int getMinPreco() {
        return minPreco;
    }

    public void setMinPreco(int minPreco) {
        this.minPreco = minPreco;
    }

    public int getMaxPreco() {
        return maxPreco;
    }

    public void setMaxPreco(int maxPreco) {
        this.maxPreco = maxPreco;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}