package classes;

public class PlusOperator extends OperatorBinary {

    public PlusOperator(Expression left, Expression right) {
        super(left, "+", right);
    }

    @Override
    public Value evaluate() {
        return new Value<>(Integer.parseInt(getLeft().evaluate().toString()) + Integer.parseInt(getRight().evaluate().toString()));
    }
}
