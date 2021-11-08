public class PacoteCOAP extends AbstractPacote {

    @Override
    public void prepararDados(String dados)
    {
        System.out.println("Preparando dados em COAP.");
        setDados(dados);
    }

    @Override
    public void criptografar()
    {
        System.out.println("Criptografando dados em COAP");
    }
}