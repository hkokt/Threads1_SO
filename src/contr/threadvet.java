package contr;

public class threadvet extends Thread {

	private int num;

	public threadvet(int num) {
		this.num = num;
	}

	public void run() {
		vetrandom();
	}

	public void vetrandom() {
		int[] vethreadpar = new int[1000];
		int[] vethreadimpar = new int[1000];
		double time0 = System.nanoTime();
		if (num % 2 == 0) {
			for (int i = 0; i < vethreadpar.length; i++) {
				int val = ((int) (Math.random() * 11) + 1);
				vethreadpar[i] = val;
			}
			double time1 = System.nanoTime();
			System.out.print("entrada par (tempo for) = " + ((time1 - time0)/ Math.pow(10, 9)));
		} else {
			for (int i : vethreadimpar) {
				int val = ((int) (Math.random() * 11) + 1);
				vethreadimpar[i] = val;
			}
			double time1 = System.nanoTime();
			System.out.print("entrada par (tempo for each)= " + ((time1 - time0)/ Math.pow(10, 9)));
		}

	}
}
