package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods gm = new GeneralMethods();
		gm.powerOfTwo();
		System.out.println("\n");
		gm.alarm(5);
		System.out.println(gm.sum100());
		System.out.println(gm.sumRange(1, 5));
		System.out.println(gm.maxOfTwo(6, 7));
		System.out.println(gm.larger(856.8, 777.2));
		System.out.println(gm.evenlyDivisible(6,6));
	}

}
