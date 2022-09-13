package contr;

public class threadvet extends Thread {

	private int num;
	private int[] vet;

	public threadvet(int num, int vet[]) {
		this.num = num;
		this.vet = vet;
	}

	public void run() {
		vetrandom(vet);
	}

	public void vetrandom(int vet[]) {
		double time0 = System.nanoTime();
		if (num % 2 == 0) {
			for (int i = 0; i < vet.length; i++) {
			}
			double time1 = System.nanoTime();
			System.out.print("entrada par (tempo for) = " + ((time1 - time0) / Math.pow(10, 9)) + " segundos ");
		} else {
			for (int i : vet) {
			}
			double time1 = System.nanoTime();
			System.out.print("entrada impar (tempo for each)= " + ((time1 - time0) / Math.pow(10, 9)) + " segundos ");
		}

	}
}
