

public class RemetenteHTTP extends AbstractRemetente
{

    @Override
    public void connect(String enderecoDeDestino)
    {
        System.out.println("Conectado ao endereço " + enderecoDeDestino + ".HTTP");
        
    }

    @Override
    public void autenticar() {
        
        System.out.println("Autenticando com HTTP");
        
    }

    @Override
    public void send(AbstractPacote dados) {
        
        
        
    }

    @Override
    public void close()
    {
        System.out.println("HTTP fechado");
        
    }
    
}