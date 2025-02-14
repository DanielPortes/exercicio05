package padroescriacao.exercicio05;

public interface Funcionario {
    void aceitar(Visitor visitor);

    String getNome();
}
