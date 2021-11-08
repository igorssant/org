package org.abstract_fatory;

public class AbstractRemetente {
    
    public abstract void connect (String enderecoDeDestino);
    public abstract void autenticar ();
    public abstract void send (Pacote dados);
    public abstract void close ();
    
}