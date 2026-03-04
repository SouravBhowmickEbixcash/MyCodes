package composite_pattern.com.example3;

public class ExpressionTreeTest {

	public static void main(String[] args) {
		Expression expr = new BinaryExpression('+',
				new BinaryExpression('*',
						new NumberExpression(3),
						new NumberExpression(4)),
				new NumberExpression(5));

        System.out.println(expr.toExprString() + " = " + expr.evaluate());

        Expression expr2 = new BinaryExpression('*',
        		new BinaryExpression('+',
        				new NumberExpression(2),
        				new NumberExpression(3)),
        		new BinaryExpression('-',
        				new NumberExpression(10),
        				new NumberExpression(4)));

        System.out.println(expr2.toExprString() + " = " + expr2.evaluate());
	}

}
