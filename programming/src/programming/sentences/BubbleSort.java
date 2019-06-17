package programming.sentences;

public class BubbleSort {

	int[] data = new int[] { 3, 5, 7, 23, 2, 56, 86, 4, 3, 5, 1, 99 };

	void sort() {
		boolean sorted;
		int pairs = data.length - 1;
		do {
			sorted = true;
			for (int i = 0; i < pairs; i++) {
				if (data[i] > data[i + 1]) {
					int buffer = data[i];
					data[i] = data[i + 1];
					data[i + 1] = buffer;
					sorted = false;
				}
			}
			pairs--;
		} while (!sorted);
	}

	void exec() {
		sort();
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] agrs) {
		new BubbleSort().exec();
	}

}
