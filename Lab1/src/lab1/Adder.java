package lab1;

public class Adder implements Calculator {
	
	@Override
	public int calculate(int input1, int input2)
	{
		return input1 + input2;
	}
	
	@Override
	public String getSymbol() {
		return "+";
	}
}
