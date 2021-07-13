package src.expressions2.expression;

import src.expressions1.util.Tipo;
import src.expressions1.util.TipoPrimitivo;
import src.expressions2.memory.AmbienteCompilacao;

/**
 * Este valor primitivo encapsula um valor booleano.
 */
public class ValorBooleano extends ValorConcreto<Boolean>{

	
	/**
	 * Cria um objeto encapsulando o valor booleano fornecido.
	 */
	public ValorBooleano(boolean valor) {
		super(valor);
	}

	
	/**
	 * Retorna os tipos possiveis desta expressao.
	 *
	 * @param amb o ambiente de compila��o.
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo(AmbienteCompilacao amb) {
		return TipoPrimitivo.BOOLEANO;
	}
		
	public ValorBooleano clone() {
		return new ValorBooleano(this.valor());
	}
}