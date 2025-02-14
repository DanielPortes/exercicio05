package padroescriacao.exercicio05;

public class Diretor {
    private String nome;

    public Diretor(String nome) {
        this.nome = nome;
    }

    public void aceitar(Visitor visitor) {
        visitor.visitarDiretor(this);
    }

    public String getNome() {
        return nome;
    }
}
