package view;

import contr.threadvet;

public class Principal {
	public static void main(String[] args) {
		int par = 2;
//		int impar = 1;
		Thread t1 = new threadvet(par);
		t1.start();
	}
}
