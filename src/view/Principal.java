package view;

import contr.threadvet;

public class Principal {
	public static void main(String[] args) {

		int[] vethread = new int[1000];
		for (int i = 0; i < vethread.length; i++) {
			int val = ((int) (Math.random() * 101) + 1);
			vethread[i] = val;
		}
		int par = 2;
		int impar = 1;
		Thread t1 = new threadvet(par, vethread);
		t1.start();
	}
}
