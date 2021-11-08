

public class PacoteHTTP extends AbstractPacote
{

    @Override
    public void prepararDados(String dados) {
       
        System.out.println("Pacote: HTTP");
        setDados(dados);
        
    }

    @Override
    public void criptografar()
    {
        System.out.println("Criptografia: HTTP");
        
    }
    
}