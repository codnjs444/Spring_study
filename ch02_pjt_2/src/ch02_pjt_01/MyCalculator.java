package ch02_pjt_01;

public class MyCalculator {
	public void calAdd(int fNum, int sNum, CalAdd calAdd) {
		int value = CalAdd.doOperation(fNum, sNum);
		System.out.println("result :" + value);
	}
	
	public void calSub(int fNum, int sNum, CalSub calSub) {
		int value = CalSum.doOperation(fNum,sNum);
		System.out.println("result :" + value);
	}
	
	public void calMul(int fNum, int sNum, CalMul calMul) {
		int value = CalMul.doOperation(fNum,sNum);
		System.out.println("result :" + value);
	}
	
	public void calDiv(int fNum, int sNum, CalDiv calDiv) {
		int value = CalDiv.doOperation(fNum,sNum);
		System.out.println("result :" + value);
	}
}
