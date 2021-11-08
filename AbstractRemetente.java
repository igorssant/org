package org.abstract_fatory;

public abstract class AbstractRemetente {
    
    public abstract void connect (String enderecoDeDestino);
    public abstract void autenticar ();
    public abstract void send (Pacote dados);
    public abstract void close ();
    
}