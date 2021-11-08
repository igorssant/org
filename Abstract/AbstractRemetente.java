

public abstract class AbstractRemetente {
    
    public abstract void connect (String enderecoDeDestino);
    public abstract void autenticar ();
    public abstract void send (AbstractPacote dados);
    public abstract void close ();
    
}