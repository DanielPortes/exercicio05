package padroescriacao.exercicio05;

public interface Visitor {
    String visitarPeao(Peao peao);
    String visitarDiretor(Diretor diretor);
    String visitarSupervisor(Supervisor supervisor);
}
