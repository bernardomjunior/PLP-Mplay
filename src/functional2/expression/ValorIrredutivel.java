package src.functional2.expression;

import src.expressions1.util.Tipo;
import src.expressions2.expression.Expressao;
import src.expressions2.expression.Valor;
import src.expressions2.memory.AmbienteCompilacao;
import src.expressions2.memory.AmbienteExecucao;
import src.expressions2.memory.VariavelJaDeclaradaException;
import src.expressions2.memory.VariavelNaoDeclaradaException;

public class ValorIrredutivel implements Valor {

	public Valor avaliar(AmbienteExecucao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		return null;
	}

	public boolean checaTipo(AmbienteCompilacao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		return true;
	}

	public Tipo getTipo(AmbienteCompilacao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		return null;
	}

	public Expressao reduzir(AmbienteExecucao ambiente) {
		return this;
	}
	
	public ValorIrredutivel clone() {
		return this;
	}
}
