package src.imperative2.memory;

import src.expressions2.expression.Id;
import src.expressions2.memory.Contexto;
import src.expressions2.memory.VariavelJaDeclaradaException;
import src.expressions2.memory.VariavelNaoDeclaradaException;
import src.imperative1.memory.ContextoExecucaoImperativa;
import src.imperative1.memory.ListaValor;
import src.imperative2.declaration.DefProcedimento;

public class ContextoExecucaoImperativa2 extends ContextoExecucaoImperativa
        implements AmbienteExecucaoImperativa2 {

    /**
     * O contexto de procedimentos faz as vezes de um contexto de execu��o que
     * armazena apenas procedimentos.
     */
    private Contexto<DefProcedimento> contextoProcedimentos;

    /**
     * Construtor da classe.
     */
    public ContextoExecucaoImperativa2(ListaValor entrada) {
        super(entrada);
        contextoProcedimentos = new Contexto<DefProcedimento>();
    }

    @Override
    public void incrementa() {
        super.incrementa();
        this.contextoProcedimentos.incrementa();
    }

    @Override
    public void restaura() {
        super.restaura();
        this.contextoProcedimentos.restaura();
    }

    /**
     * Mapeia o id no procedimento dado.
     *
     * @throws ProcedimentoJaDeclaradoException se j� existir um mapeamento do identificador nesta tabela.
     */
    public void mapProcedimento(Id idArg, DefProcedimento procedimentoId)
            throws ProcedimentoJaDeclaradoException {
        try {
            this.contextoProcedimentos.map(idArg, procedimentoId);
        } catch (VariavelJaDeclaradaException e) {
            throw new ProcedimentoJaDeclaradoException(idArg);
        }

    }

    /**
     * Retorna o procedimento mapeado ao id dado.
     *
     * @throws ProcedimentoNaoDeclaradoException se n�o existir nenhum procedimento mapeado ao id dado
     *                                           nesta tabela.
     */
    public DefProcedimento getProcedimento(Id idArg)
            throws ProcedimentoNaoDeclaradoException {
        try {
            return this.contextoProcedimentos.get(idArg);
        } catch (VariavelNaoDeclaradaException e) {
            throw new ProcedimentoNaoDeclaradoException(idArg);
        }

    }
}
