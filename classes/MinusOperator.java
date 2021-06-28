package classes;

import java.util.Objects;

public class MinusOperator extends OperatorBinary{

    public MinusOperator(Expression right) {
        super("-", right);
    }

    public MinusOperator(Expression left, Expression right) {
        super(left, "-", right);
    }

    @Override
    public Value evaluate() {
        if (Objects.isNull(getLeft())){
            return new Value<>(Integer.parseInt(getRight().toString()));
        }
        return new Value<>(Integer.parseInt(getLeft().evaluate().toString()) - Integer.parseInt(getRight().evaluate().toString()));
    }
}
