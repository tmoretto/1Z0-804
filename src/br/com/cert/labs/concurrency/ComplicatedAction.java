package br.com.cert.labs.concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ComplicatedAction extends RecursiveAction {

	private int[] ia;
	private int from;
	private int to;

	public ComplicatedAction(int[] ia, int from, int to) {
		this.ia = ia;
		this.from = from;
		this.to = to;
	}

	@Override
	protected void compute() {
		if (from == to) {
			ia[from] = UtilityClass.utilityMethod(ia[from]);
		} else {
			int mid = (from + to) / 2;
			ComplicatedAction task1 = new ComplicatedAction(ia, from, mid);
			ComplicatedAction task2 = new ComplicatedAction(ia, mid + 1, to);
			task2.fork();
			task1.compute();
			task2.join();
		}
	}

	public static void main(String[] args) {
		int ia[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		ForkJoinPool fjp = new ForkJoinPool();
		ComplicatedAction st = new ComplicatedAction(ia, 0, 6);
		fjp.invoke(st);
		System.out.print("New Array Values = ");
		for (int i : ia) System.out.print(i + " ");
	}

}

class UtilityClass {
	public static int utilityMethod(int x) {
		return x * x;
	}
}
