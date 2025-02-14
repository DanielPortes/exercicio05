package padroescriacao.exercicio05;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class OleriteVisitorTest {
    @BeforeEach
    public void setUp() {
        Diretor diretor = new Diretor("Diretor");
        Supervisor supervisor = new Supervisor("Supervisor");
        Peao peao = new Peao("Peão");
    }

    @Test
    public void testOleriteVisitor() {
        OleriteVisitor oleriteVisitor = new OleriteVisitor();
        assertNotNull(oleriteVisitor);
    }

    @Test
    public void testVisitarDiretor() {
        Diretor diretor = new Diretor("Diretor");
        OleriteVisitor oleriteVisitor = new OleriteVisitor();
        assertEquals("Diretor: DiretorPossui o salário de R$ 150.000,00", oleriteVisitor.visitarDiretor(diretor));
    }

    @Test
    public void testVisitarSupervisor() {
        Supervisor supervisor = new Supervisor("Supervisor");
        OleriteVisitor oleriteVisitor = new OleriteVisitor();
        assertEquals("Supervisor: SupervisorPossui o salário de R$ 500,00", oleriteVisitor.visitarSupervisor(supervisor));
    }

    @Test
    public void testVisitarPeao() {
        Peao peao = new Peao("Peão");
        OleriteVisitor oleriteVisitor = new OleriteVisitor();
        assertEquals("Peão: PeãoPossui o salário de 1 un de arroz", oleriteVisitor.visitarPeao(peao));
    }

}