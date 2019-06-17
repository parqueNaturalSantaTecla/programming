package programming.expressions;

public class WinnerLooser {

	final int COMBINATION_LENGTH = 4;

	final int MAX_ATTEMPTS = 10;

	boolean isWinner(int blacks, int whites) {
		return blacks == COMBINATION_LENGTH;
	}

	boolean isLooser(int attempts) {
		return attempts == MAX_ATTEMPTS;
	}

	void exec() {
		int blacks = 2;
		int whites = 2;
		int attempts = 3;
		if (isWinner(blacks, whites)) {
			System.out.println("Partida ganada!! :-) " + blacks + " muertos y " + whites + " heridos");
		} else if (isLooser(attempts)) {
			System.out.println("Partida perdida!! :-(");
		} else System.out.println("Continúa jugando!");
	}

	public static void main(String[] args) {
		new WinnerLooser().exec();
	}

}
