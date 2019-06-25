package classes;

public class Date {

	private int day;

	private int month;

	private int year;

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	boolean isLeapYear() {
		return (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0);
	}

	boolean isCorrect() {
		boolean correctDay;
		if (this.month == 2) {
			if (this.isLeapYear()) {
				correctDay = this.day >= 1 && this.day <= 29;
			} else {
				correctDay = this.day >= 1 && this.day <= 28;
			}
		} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
			correctDay = this.day >= 1 && this.day <= 30;
		} else {
			correctDay = this.day >= 1 && this.day <= 31;
		}
		return correctDay && (this.month > 0 && this.month <= 12) && this.year > 0;
	}

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

}
