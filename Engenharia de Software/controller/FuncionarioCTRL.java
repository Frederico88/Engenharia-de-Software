package controller;

import view.UsuarioView;
import view.FuncionarioView;

public class FuncionarioCTRL {

    Funcionario funcionario = new Funcionario(idFuncionario, nome, endereco, telefone, email, senha);
    Usuario usuario = new Usuario(idUsuario, nome, endereco, telefone, email, senha);
    Imovel imovel = new Imovel(disponibilidade, idCodigo, endereco, idTipo, idValor, idOperacao, idQuartos, idBanheiros, idVagaGaragem);

    Boolean criarFuncionario(Funcionario funcionario) {
        
    }

    Boolean excluirFuncionario(Funcionario funcionario) {

    }

    Boolean alterarFuncionario(Funcionario funcionario) {

    }

    Boolean addImovel(Imovel imovel) {

    }

    Boolean excluirImovel(Imovel imovel) {

    }

    public FuncionarioCTRL(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}