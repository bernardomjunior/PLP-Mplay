package classes;

public abstract class OperatorBinary implements Expression {

    private Expression left;
    private Expression right;
    private String operator;

    public OperatorBinary(Expression left, String operator, Expression right){
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public OperatorBinary(String operator, Expression right){
        this.operator = operator;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


    public abstract Value evaluate();

}
