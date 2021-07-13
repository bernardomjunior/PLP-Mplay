package src.imperative2.memory;

import src.expressions2.expression.Id;
import src.expressions2.memory.IdentificadorJaDeclaradoException;

public class ProcedimentoJaDeclaradoException extends
        IdentificadorJaDeclaradoException {

    private static final long serialVersionUID = -1793156786677618760L;

    public ProcedimentoJaDeclaradoException(Id id) {
        super("Procedimento " + id + " j� declarado.");
    }

}
