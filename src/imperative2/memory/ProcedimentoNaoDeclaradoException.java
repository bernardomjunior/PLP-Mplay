package src.imperative2.memory;

import src.expressions2.expression.Id;
import src.expressions2.memory.IdentificadorNaoDeclaradoException;

public class ProcedimentoNaoDeclaradoException extends
        IdentificadorNaoDeclaradoException {

    private static final long serialVersionUID = -5023666514074530307L;

    public ProcedimentoNaoDeclaradoException(Id id) {
        super("Procedimento " + id + " nao declarado.");
    }

}
