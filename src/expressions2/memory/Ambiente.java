package src.expressions2.memory;

import src.expressions2.expression.Id;

public interface Ambiente<T> {

    public void incrementa();

    public void restaura();

    public void map(Id idArg, T tipoId) throws VariavelJaDeclaradaException;

    public T get(Id idArg) throws VariavelNaoDeclaradaException;

}
