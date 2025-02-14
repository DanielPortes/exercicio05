package padroescriacao.exercicio05;

public class Peao implements Funcionario {
    private String nome;

    public Peao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarPeao(this);
    }
}
