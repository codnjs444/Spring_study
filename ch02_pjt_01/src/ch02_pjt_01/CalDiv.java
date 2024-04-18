package ch02_pjt_01;

public class CalDiv implements ICalculator{
	@Override
	public int doOperation(int firstNum, int secondNum) {
		return secondNum!=0?(firstNum/secondNum) : 0;
	}
}
