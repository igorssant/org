public abstract class AbstractPacote {
 
    public abstract void prepararDados (String dados);
    public abstract void criptografar ();

    private String dados;

    public void setDados(String dados)
    {
        this.dados = dados;
    }

    public String getDados()
    {
        return this.dados;
    }
    
}