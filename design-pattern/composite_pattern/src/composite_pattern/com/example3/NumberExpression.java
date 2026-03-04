package composite_pattern.com.example3;

public class NumberExpression implements Expression{
	
	private double number;
	
	
	public NumberExpression(double number) {
		super();
		this.number = number;
	}


	@Override
	public double evaluate() {
		return number;
	}
	
	@Override
	public String toExprString() {
		return Double.toString(number);
	}

}
