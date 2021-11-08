package org.abstract_factory;

public abstract class AbstractPacote {

    private String dados;

    public abstract void prepararDados(String dados);
    public abstract void criptografar();

    public void setDados(String dados)
    {
        this.dados = dados;
    }

    public String getDados()
    {
        return this.dados;
    }

}
