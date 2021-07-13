package src.imperative1.memory;

import src.expressions2.expression.Id;
import src.expressions2.expression.Valor;
import src.expressions2.memory.AmbienteExecucao;
import src.expressions2.memory.VariavelNaoDeclaradaException;

public interface AmbienteExecucaoImperativa extends AmbienteExecucao {

    public void changeValor(Id idArg, Valor valorId)
            throws VariavelNaoDeclaradaException;

    public Valor read() throws EntradaVaziaException;

    public void write(Valor v);

    public ListaValor getSaida();
}
