package padroescriacao.exercicio05;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class OleriteVisitorTest {
    @Test
    public void testVisitarDiretorCsv()
    {
        Diretor diretor = new Diretor("Diretor");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Diretor: DiretorPossui o salário de R$ 150.000,00 Json", oleriteVisitor.visitarDiretor(diretor));
    }

    @Test
    public void testVisitarSupervisorCsv()
    {
        Supervisor supervisor = new Supervisor("Supervisor");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Supervisor: SupervisorPossui o salário de R$ 500,00 Json", oleriteVisitor.visitarSupervisor(supervisor));
    }

    @Test
    public void testVisitarPeaoCsv()
    {
        Peao peao = new Peao("Peão");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Peão: PeãoPossui o salário de 1 un de arroz Json", oleriteVisitor.visitarPeao(peao));
    }


    @Test
    public void testVisitarDiretorJson()
    {
        Diretor diretor = new Diretor("Diretor");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Diretor: DiretorPossui o salário de R$ 150.000,00 Json", oleriteVisitor.visitarDiretor(diretor));
    }

    @Test
    public void testVisitarSupervisorJson()
    {
        Supervisor supervisor = new Supervisor("Supervisor");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Supervisor: SupervisorPossui o salário de R$ 500,00 Json", oleriteVisitor.visitarSupervisor(supervisor));
    }

    @Test
    public void testVisitarPeaoJson() {
        Peao peao = new Peao("Peão");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Peão: PeãoPossui o salário de 1 un de arroz Json", oleriteVisitor.visitarPeao(peao));
    }

    @Test
    public void testVisitarSupervisorXml()
    {
        Supervisor supervisor = new Supervisor("Supervisor");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Supervisor: SupervisorPossui o salário de R$ 500,00 Json", oleriteVisitor.visitarSupervisor(supervisor));
    }

    @Test
    public void testVisitarDiretorXml()
    {
        Diretor diretor = new Diretor("Diretor");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Diretor: DiretorPossui o salário de R$ 150.000,00 Json", oleriteVisitor.visitarDiretor(diretor));
    }

    @Test
    public void testVisitarPeaoXml() {
        Peao peao = new Peao("Peão");
        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
        assertEquals("Peão: PeãoPossui o salário de 1 un de arroz Json", oleriteVisitor.visitarPeao(peao));

    }

}













//    @Test
//    public void testOleriteVisitor() {
//        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
//        assertNotNull(oleriteVisitor);
//    }
//
//    @Test
//    public void testVisitarDiretor() {
//        Diretor diretor = new Diretor("Diretor");
//        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
//        assertEquals("Diretor: DiretorPossui o salário de R$ 150.000,00", oleriteVisitor.visitarDiretor(diretor));
//    }
//
//    @Test
//    public void testVisitarSupervisor() {
//        Supervisor supervisor = new Supervisor("Supervisor");
//        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
//        assertEquals("Supervisor: SupervisorPossui o salário de R$ 500,00", oleriteVisitor.visitarSupervisor(supervisor));
//    }
//
//    @Test
//    public void testVisitarPeao() {
//        Peao peao = new Peao("Peão");
//        OleriteVisitorJson oleriteVisitor = new OleriteVisitorJson();
//        assertEquals("Peão: PeãoPossui o salário de 1 un de arroz", oleriteVisitor.visitarPeao(peao));
//    }
//
//}