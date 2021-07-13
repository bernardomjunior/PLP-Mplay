package src.imperative2;

import src.expressions2.memory.IdentificadorJaDeclaradoException;
import src.expressions2.memory.IdentificadorNaoDeclaradoException;
import src.imperative1.command.Comando;
import src.imperative1.memory.*;

public class Programa {

	private Comando comando;

	public Programa(Comando comando) {
		this.comando = comando;
	}

	/**
	 * Executa o programa.
	 * 
	 * @param ambiente
	 *            o ambiente de execu��o.
	 * 
	 * @return o ambiente depois de modificado pela execu��o do programa.
	 * @throws ErroTipoEntradaException 
	 * 
	 */
	public ListaValor executar(AmbienteExecucaoImperativa ambiente)
			throws IdentificadorJaDeclaradoException,
			IdentificadorNaoDeclaradoException, EntradaVaziaException, ErroTipoEntradaException {
		ambiente = comando.executar(ambiente);
		return ambiente.getSaida();
	}

	/**
	 * Realiza a verificacao de tipos do programa
	 * 
	 * @param ambiente
	 *            o ambiente de compila��o.
	 * @return <code>true</code> se o programa est� bem tipado;
	 *         <code>false</code> caso contrario.
	 * 
	 */
	public boolean checaTipo(AmbienteCompilacaoImperativa ambiente)
			throws IdentificadorJaDeclaradoException,
			IdentificadorNaoDeclaradoException, EntradaVaziaException {
		return comando.checaTipo(ambiente);
	}

}
