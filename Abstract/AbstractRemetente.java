

public abstract class AbstractRemetente {
    
    String enderecoDestino;

    public abstract void connect (String enderecoDeDestino);
    public abstract void autenticar ();
    public abstract void send (AbstractPacote dados);
    public abstract void close ();

    public void setEnderecoDestino(String enderecoDestino)
    {
        this.enderecoDestino = enderecoDestino;
    }

    public String getEnderecoDestino()
    {
        return this.enderecoDestino;
    }
    
}