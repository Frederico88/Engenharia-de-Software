import model.Imovel;
import model.Usuario;

public class UsuarioCTRL {
    Usuario usuario = new Usuario(idUsuario, nome, endereco, telefone, email, senha);
    Imovel imovel = new Imovel(disponibilidade, idCodigo, endereco, idTipo, idValor, idOperacao, idQuartos, idBanheiros,
            idVagaGaragem);

    Boolean criaUsuario(Usuario usuario) {

    }

    Boolean excluirUsuario(Usuario usuario) {

    }

    Boolean alterarUsuario(Usuario usuario) {

    }

    Boolean addImovel(Imovel imovel) {

    }

    Boolean excluirImovel(Imovel imovel) {

    }

    public UsuarioCTRL(Usuario usuario) {
        this.usuario = usuario;
    }
}
