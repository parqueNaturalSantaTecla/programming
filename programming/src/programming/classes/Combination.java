package programming.classes;

import java.util.Random;

public abstract class Combination {
	
	private static final int WIDTH = 4;
	
	private static final char[] ALL_COLORS = {'r', 'y', 'b', 'o', 'g', 'p'};

	private char[] colors;
	
	Combination (){
		this.colors = new char[Combination.WIDTH];
		Random random;
		for (int i = 0; i < this.colors.length; i++) {
			random = new Random(System.currentTimeMillis());
			this.colors[i] = Combination.ALL_COLORS[random.nextInt(Combination.WIDTH)];
		}
	}
	
	Combination(char[] colors){
		this.colors = colors;
	}

	boolean contains(char color, int position) {
		return this.colors[position] == color;
	}

	boolean contains(char color) {
		for (int i = 0; i < this.colors.length; i++) {
			if (this.colors[i] == color) {
				return true;
			}
		}
		return false;
	}
	
	boolean isEqual(Combination combination) {
		int equals = 0;
		for (int i = 0; i < Combination.WIDTH; i++) {
			for (int j = 0; j < Combination.WIDTH; j++) {
				if (this.colors[i] == combination.getColors()[j]) {
					equals++;
				}
			}
		}
		return equals == Combination.WIDTH;
	}

	static int getWidth() {
		return Combination.WIDTH;
	}
	
	char[] getColors() {
		return colors;
	}

	void setColors(char[] colors) {
		this.colors = colors;
	}
	
}
