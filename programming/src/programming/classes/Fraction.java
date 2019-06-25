package programming.classes;

public class Fraction {

	int numerator;

	int denominator;

	Fraction() {
	}

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	Fraction add(Fraction fraction1, Fraction fraction2) {
		Fraction result = new Fraction();
		result.numerator = fraction1.numerator * fraction2.denominator + fraction2.numerator * fraction1.denominator;
		result.denominator = fraction1.denominator * fraction2.denominator;
		return result;
	}

	Fraction substract(Fraction fraction1, Fraction fraction2) {
		Fraction result = new Fraction();
		result.numerator = fraction1.numerator * fraction2.denominator - fraction2.numerator * fraction1.denominator;
		result.denominator = fraction1.denominator * fraction2.denominator;
		return result;
	}

	Fraction multiply(Fraction fraction1, Fraction fraction2) {
		return new Fraction(fraction1.numerator * fraction2.numerator, fraction1.denominator * fraction2.denominator);
	}

	Fraction inverse(Fraction fraction) {
		return new Fraction(fraction.denominator, fraction.numerator);
	}

	Fraction divide(Fraction fraction1, Fraction fraction2) {
		return this.multiply(fraction1, this.inverse(fraction2));
	}

	int getNumerator() {
		return numerator;
	}

	void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	int getDenominator() {
		return denominator;
	}

	void setDenominator(int denominator) {
		this.denominator = denominator;
	}

}
