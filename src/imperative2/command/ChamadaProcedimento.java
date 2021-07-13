package src.imperative2.command;

import src.expressions1.util.Tipo;
import src.expressions2.expression.Id;
import src.expressions2.memory.IdentificadorJaDeclaradoException;
import src.expressions2.memory.IdentificadorNaoDeclaradoException;
import src.expressions2.memory.VariavelJaDeclaradaException;
import src.expressions2.memory.VariavelNaoDeclaradaException;
import src.imperative1.command.Comando;
import src.imperative1.memory.*;
import src.imperative2.declaration.DefProcedimento;
import src.imperative2.declaration.ListaDeclaracaoParametro;
import src.imperative2.memory.AmbienteExecucaoImperativa2;
import src.imperative2.util.TipoProcedimento;

public class ChamadaProcedimento implements Comando {

    private Id nomeProcedimento;

    private ListaExpressao parametrosReais;

    public ChamadaProcedimento(Id nomeProcedimento,
                               ListaExpressao parametrosReais) {
        this.nomeProcedimento = nomeProcedimento;
        this.parametrosReais = parametrosReais;
    }

    public AmbienteExecucaoImperativa executar(AmbienteExecucaoImperativa amb)
            throws IdentificadorNaoDeclaradoException,
            IdentificadorJaDeclaradoException, EntradaVaziaException, ErroTipoEntradaException {
        AmbienteExecucaoImperativa2 ambiente = (AmbienteExecucaoImperativa2) amb;
        DefProcedimento procedimento = ambiente
                .getProcedimento(nomeProcedimento);

        /*
         * o incrementa e o restaura neste ponto servem para criar as variveis
         * que serao utilizadas pela execucao do procedimento
         */
        ambiente.incrementa();
        ListaDeclaracaoParametro parametrosFormais = procedimento
                .getParametrosFormais();
        AmbienteExecucaoImperativa2 aux = bindParameters(ambiente,
                parametrosFormais);
        aux = (AmbienteExecucaoImperativa2) procedimento.getComando().executar(
                aux);
        aux.restaura();
        return aux;

    }

    /**
     * insere no contexto o resultado da associacao entre cada parametro formal
     * e seu correspondente parametro atual
     */
    private AmbienteExecucaoImperativa2 bindParameters(
            AmbienteExecucaoImperativa2 ambiente,
            ListaDeclaracaoParametro parametrosFormais)
            throws VariavelJaDeclaradaException, VariavelNaoDeclaradaException {
        ListaValor listaValor = parametrosReais.avaliar(ambiente);
        while (listaValor.length() > 0) {
            ambiente.map(parametrosFormais.getHead().getId(), listaValor
                    .getHead());
            parametrosFormais = (ListaDeclaracaoParametro) parametrosFormais
                    .getTail();
            listaValor = (ListaValor) listaValor.getTail();
        }
        return ambiente;
    }

    /**
     * Realiza a verificacao de tipos desta chamada de procedimento, onde os
     * tipos dos parametros formais devem ser iguais aos tipos dos parametros
     * reais na ordem em que se apresentam.
     *
     * @param amb o ambiente que contem o mapeamento entre identificadores e
     *                 tipos.
     * @return <code>true</code> se a chamada de procedimeno est� bem tipada;
     * <code>false</code> caso contrario.
     */
    public boolean checaTipo(AmbienteCompilacaoImperativa amb)
            throws IdentificadorJaDeclaradoException,
            IdentificadorNaoDeclaradoException {

        Tipo tipoProcedimento = amb.get(this.nomeProcedimento);

        TipoProcedimento tipoParametrosReais = new TipoProcedimento(
                parametrosReais.getTipos(amb));
        return tipoProcedimento.eIgual(tipoParametrosReais);

    }

}
