package org.ssglobal.training.codes.itemC;

public class GeneralMethods {
	public void powerOfTwo() {
		for (byte i = 1; i <= 10; i++) {
			System.out.print((int) Math.pow(2, i) + " ");
		}
	}
	
	public void alarm(int ctr) {
		for (int i = 1; i <= ctr; i++) {
			System.out.println("Alarm!");
		}
	}
	
	public short sum100() {
		short sum = 0;
		
		for (byte i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int sumRange(int num1, int num2) {
		int sum = 0;
		
		while(num1 <= num2) {
			sum += num1;
			num1++;
		};
		return sum;
	}
	
	public int maxOfTwo(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	
	public boolean larger(double num1, double num2) {
		return num1 > num2 ? true : false;
	}
	
	public boolean evenlyDivisible(int num1, int num2) {
		return num1 % num2 == 0 && num2 % num1 == 0 ? true : false;
	}
}
