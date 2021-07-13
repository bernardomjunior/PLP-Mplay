package src.imperative1.memory;

import src.expressions1.util.Tipo;
import src.expressions2.memory.AmbienteCompilacao;
import src.expressions2.memory.VariavelJaDeclaradaException;
import src.expressions2.memory.VariavelNaoDeclaradaException;

public interface AmbienteCompilacaoImperativa extends AmbienteCompilacao {

    public Tipo getTipoEntrada() throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException,
            EntradaVaziaException;

}
