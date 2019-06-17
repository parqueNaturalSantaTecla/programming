package programming.sentences;

public class SelectionSort {

	int[] data = new int[] { 3, 5, 7, 23, 2, 56, 86, 4, 3, 5, 1, 1, 99 };

	void sort() {
		for (int i = 0; i < data.length - 1; i++) {
			int minimumPosition = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[minimumPosition] > data[j]) {
					minimumPosition = j;
				}
			}
			if (minimumPosition != i) {
				int buffer = data[i];
				data[i] = data[minimumPosition];
				data[minimumPosition] = buffer;
			}
		}
	}

	void exec() {
		sort();
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] agrs) {
		new SelectionSort().exec();
		int rest = 237;
		rest %= 20;
		System.out.println(rest);
	}

}
