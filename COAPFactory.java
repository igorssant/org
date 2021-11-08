package org.abstract_factory.COAP;

import org.abstract_factory.AbstractPacote;
import org.abstract_factory.AbstractRemetente;
import org.abstract_factory.GUIAbstractFactory;

public class COAPFactory extends GUIAbstractFactory {

    @Override
    public AbstractPacote createPacote()
    {
        return new PacoteCOAP();
    }

    @Override
    public AbstractRemetente createRemetente()
    {
        return new RemetenteCOAP();
    }
}
