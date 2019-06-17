package programming.expressions;

public class Serie {

	final int MAX = 9;

	int condition(int number) {
		return number; // en orden
//		return number + 1; // en orden del 1 al 9
//		return (MAX-1) - number; // en orden inverso del 0 al 8
//		return number % 3; // serie de 0,1,2
//		return number * 2; // de 2 en 2
//		return (number + 1) * MAX; // la tabla del 9
	}

	void exec() {
		for (int i = 0; i < MAX; i++) {
			System.out.println(condition(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Serie().exec();
	}

}
