package programming.expressions;

public class Mesh {

	final int MAX = 15;

	boolean condition(int row, int column) {
//		return row==0 && column==0; // punto en esquina superior izquierda
//		return row==3 && column==12; // punto particular
//		return row==MAX/2 && column==MAX/2; // punto central
//		return (row+column)%2==0; // alternos
//		return (row+column)%2==1; // alternos
//		return row==MAX/2; // fila
//		return column==MAX/2; // columna
//		return row==MAX/2 || column==MAX/2; // cruz centrada
//		return 5 <= row && row <= 10 && 5 <= column && column <= 10;
//		return row - column == 0; // diagonal principal
//		return row + column == MAX - 1; // diagonal inversa
//		return row - column == 5; // paralela a diagonal principal
//		return row + column == 5; // paralela a diagonal inversa
//		return row - column == 0 || row + column == MAX - 1; // aspa
//		return row - column == 3 || row + column == MAX - 3; // aspa desplazada
//		return row == MAX / 2 || column == MAX / 2 || row - column == 0 || row + column == MAX - 1;
//		return row==0 || row==MAX-1 || column==0 || column==MAX-1; // marco externo
		return row==1 || row==MAX-2 || column==1 || column==MAX-2; // marco interno
	}

	public void exec() {
		System.out.print(" ");
		for (int j = 0; j < MAX; j++) {
			System.out.print(j % 10);
		}
		System.out.println();
		for (int i = 0; i < MAX; i++) {
			System.out.print(i % 10);
			for (int j = 0; j < MAX; j++) {
				if (condition(i, j)) {
					System.out.print("*");
				} else {
					System.out.print("·");
				}
			}
			System.out.println();
		}
	}
	
	void main(String[] args) {
		new Mesh().exec();
	}
	
}
