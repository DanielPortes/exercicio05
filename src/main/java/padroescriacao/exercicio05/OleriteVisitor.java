package padroescriacao.exercicio05;

public class OleriteVisitor implements Visitor {
    @Override
    public String visitarSupervisor(Supervisor supervisor) {
        return ("Supervisor: " + supervisor.getNome()
                + "Possui o salário de R$ 500,00");
    }

    @Override
    public String visitarDiretor(Diretor diretor) {
        return ("Diretor: " + diretor.getNome()
                + "Possui o salário de R$ 150.000,00");
    }

    @Override
    public String visitarPeao(Peao peao) {
        return "Peão: " + peao.getNome()
                + "Possui o salário de 1 un de arroz";
    }
}
