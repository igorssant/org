package org.abstract_fatory.protocolos;

import org.abstract_fatory.GUIAbstractFactory;
import org.abstract_fatory.AbstractPacote;
import org.abstract_fatory.AbstractRemetente;
import org.abstract_fatory.protocolos.PacoteHTTP;
import org.abstract_fatory.protocolos.RemetenteHTTP;

public class FabricaHTTP extends GUIAbstractFactory {

    @Override
    public AbstractPacote criarPacote() {
        
        return new PacoteHTTP ();
        
    }

    @Override
    public AbstractRemetente criarRemetente () {
        
        return new RemetenteHTTP ();
        
    }
    
}