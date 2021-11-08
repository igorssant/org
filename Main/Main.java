
public class Main {

    public static void main (String[] args)
    {
        
       GUIAbstractFactory qualquer = new FabricaHTTP();
       AbstractPacote qualquerPacote =  qualquer.criarPacote();
       AbstractRemetente qualquerRemetente = qualquer.criarRemetente();
    
       qualquerPacote.prepararDados("CPF dos brasileiros");
       qualquerPacote.criptografar();

       qualquerRemetente.autenticar();
       qualquerRemetente.connect("www.darkweb.com");
       qualquerRemetente.send(qualquerPacote);
       qualquerRemetente.close();

       System.out.println("\n\n\n");

       qualquerPacote = new PacoteCOAP();
       qualquerRemetente = new RemetenteCOAP();
       qualquer = new COAPAbstractFactory();

       qualquerPacote.prepararDados("Dados bancários");
       qualquerPacote.criptografar();

       qualquerRemetente.autenticar();
       qualquerRemetente.connect("www.dadosbancarios.com");
       qualquerRemetente.send(qualquerPacote);
       qualquerRemetente.close();       
    
    }
    
}
