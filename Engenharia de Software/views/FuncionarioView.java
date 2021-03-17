package view;

import model.Imovel;
import model.Funcionario;
import model.Usuario;

public class FuncionarioView {
    Funcionario funcionario = new Funcionario(idFuncionario, nome, endereco, telefone, email, senha);
    Usuario usuario = new Usuario(idUsuario, nome, endereco, telefone, email, senha);
    Imovel imovel = new Imovel(disponibilidade, idCodigo, endereco, idTipo, idValor, idOperacao, idQuartos, idBanheiros, idVagaGaragem);

    public FuncionarioView() {
        
    }

    public FuncionarioView(Imovel imovel, Funcionario funcionario, Usuario usuario) {
        this.imovel = imovel;
        this.funcionario = funcionario;
        this.usuario = usuario;
    }

    public Imovel pesquisarImovel(String idCodigo) {
        return imovel;
    }

    public Imovel filtrarImovel(String idTipo, double idValor, int idQuartos, int idBanheiros, int idVagaGaragem) {
        return imovel;
    }

    public Imovel OrdenarPorPreco(int maxPreco, int minPreco) {
        return imovel;
    }

}