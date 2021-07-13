package src.expressions2.memory;

import src.expressions2.expression.Valor;

public interface AmbienteExecucao extends Ambiente<Valor> {

	public AmbienteExecucao clone();

}
