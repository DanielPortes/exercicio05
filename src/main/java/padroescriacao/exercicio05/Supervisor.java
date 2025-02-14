package padroescriacao.exercicio05;

public class Supervisor implements Funcionario {
    private String nome;

    public Supervisor(String nome) {
        this.nome = nome;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarSupervisor(this);
    }

    public String getNome() {
        return nome;
    }
}
