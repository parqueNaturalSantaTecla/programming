package programming.sentences;

public class Antipodes {

	void exec() {
		int latitudeGrades = 40;
		int latitudeGradesAbs;
		char latitudeCardinalPoint;
		if (latitudeGrades < 0) {
			latitudeGradesAbs = -latitudeGrades;
			latitudeCardinalPoint = 'S';
		} else {
			latitudeGradesAbs = latitudeGrades;
			latitudeCardinalPoint = 'N';
		}
		int longitudeGrades = 23;
		int longitudeGradesAbs;
		char longitudeCardinalPoint;
		if (longitudeGrades < 0) {
			longitudeGradesAbs = -longitudeGrades;
			longitudeCardinalPoint = 'O';
		} else {
			longitudeGradesAbs = longitudeGrades;
			longitudeCardinalPoint = 'E';
		}
		System.out.println(latitudeGradesAbs + "�" + latitudeCardinalPoint + " " +
				longitudeGradesAbs + "�" + longitudeCardinalPoint);
		int antipodeLatitudeGrades = latitudeGradesAbs;
		char antipodeLatitudeCardinalPoint;
		if (latitudeCardinalPoint == 'N') {
			antipodeLatitudeCardinalPoint = 'S';
		} else {
			antipodeLatitudeCardinalPoint = 'N';
		}
		int antipodeLongitudeGrades = 180 - longitudeGradesAbs;
		char antipodeLongitudeCardinalPoint;
		if (longitudeCardinalPoint == 'E') {
			antipodeLongitudeCardinalPoint = 'W';
		} else {
			antipodeLongitudeCardinalPoint = 'E';
		}
		System.out.println(antipodeLatitudeGrades + "�" + antipodeLatitudeCardinalPoint + " " +
				antipodeLongitudeGrades + "�" + antipodeLongitudeCardinalPoint);
	}
	
	public static void main(String[] agrs) {
		new Antipodes().exec();
	}
}
