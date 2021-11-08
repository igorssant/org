package org.abstract_fatory.protocolos;

import org.abstract_fatory.GUIAbstractFactory;
import org.abstract_fatory.AbstractPacote;
import org.abstract_fatory.AbstractRemetente;

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