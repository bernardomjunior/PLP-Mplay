package src.imperative2.declaration;

import src.expressions1.util.Tipo;
import src.imperative1.command.Comando;
import src.imperative2.util.TipoProcedimento;

/**
 * Uma defini�ao de procedimento � uma declara�ao de comando e parametrosFormais
 * uma declara��o de procedimento.
 */
public class DefProcedimento {

    /**
     * Declara��o dos parametrosFormais
     */
    private ListaDeclaracaoParametro parametrosFormais;

    /**
     * Declara�ao de Comando
     */
    private Comando comando;

    /**
     * Construtor
     *
     * @param parametrosFormais Declara��o de ListaDeclaracaoParametro
     * @param comando           Declara�ao de Comando.
     */
    public DefProcedimento(ListaDeclaracaoParametro parametrosFormais,
                           Comando comando) {
        this.parametrosFormais = parametrosFormais;
        this.comando = comando;
    }

    /**
     * Obt�m o comando do Procedimento.
     *
     * @return o comando
     */
    public Comando getComando() {
        return comando;
    }

    /**
     * Obt�m os parametrosFormais do Procedimento.
     *
     * @return a ListaDeclaracaoParametro
     */
    public ListaDeclaracaoParametro getParametrosFormais() {
        return parametrosFormais;
    }

    public Tipo getTipo() {
        return new TipoProcedimento(parametrosFormais.getTipos());
    }
}
