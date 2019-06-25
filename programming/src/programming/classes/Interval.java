package programming.classes;

public class Interval {

	private int min;

	private int max;

	Interval(int min, int max) {
		this.min = min;
		this.max = max;
	}

	boolean includes(int value) {
		return this.min <= value && value <= this.max;
	}

	int getMin() {
		return min;
	}

	void setMin(int min) {
		this.min = min;
	}

	int getMax() {
		return max;
	}

	void setMax(int max) {
		this.max = max;
	}

}