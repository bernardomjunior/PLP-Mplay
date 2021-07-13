package src.imperative1.declaration;

import src.expressions2.memory.IdentificadorJaDeclaradoException;
import src.expressions2.memory.IdentificadorNaoDeclaradoException;
import src.imperative1.memory.AmbienteCompilacaoImperativa;
import src.imperative1.memory.AmbienteExecucaoImperativa;
import src.imperative1.memory.EntradaVaziaException;

public abstract class Declaracao {

    public abstract AmbienteExecucaoImperativa elabora(
            AmbienteExecucaoImperativa ambiente)
            throws IdentificadorJaDeclaradoException,
            IdentificadorNaoDeclaradoException, EntradaVaziaException;

    public abstract boolean checaTipo(AmbienteCompilacaoImperativa ambiente)
            throws IdentificadorJaDeclaradoException,
            IdentificadorNaoDeclaradoException, EntradaVaziaException;
}
