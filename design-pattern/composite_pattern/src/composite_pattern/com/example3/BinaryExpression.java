package composite_pattern.com.example3;

public class BinaryExpression implements Expression{
	
	private char operator;
	private Expression left;
	private Expression right;
	
	
	public BinaryExpression(char operator, Expression left, Expression right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}


	@Override
	public double evaluate() {
		if(operator == '+') {
			return left.evaluate() + right.evaluate();
		}else if(operator == '-') {
			return left.evaluate() - right.evaluate();
		}else if(operator == '*') {
			return left.evaluate() * right.evaluate();
		}else if(operator == '/') {
			return left.evaluate() / right.evaluate();
		}
		return 0;
	}
	
	
	@Override
	public String toExprString() {
		return left.toExprString() + operator + right.toExprString();
	}

}
