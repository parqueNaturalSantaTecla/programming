package programming.sentences;

public class Antipodes {

	void exec() {
		int latitudeGrades = 40;
		char latitudeCardinalPoint = 'N';
		int longitudeGrades = 23;
		char longitudeCardinalPoint = 'E';
		System.out.println(latitudeGrades + "�" + latitudeCardinalPoint + " " +
				longitudeGrades + "�" + longitudeCardinalPoint);
		
		int antipodeLatitudeGrades = latitudeGrades;
		char antipodeLatitudeCardinalPoint;
		if (latitudeCardinalPoint == 'N') {
			antipodeLatitudeCardinalPoint = 'S';
		} else {
			antipodeLatitudeCardinalPoint = 'N';
		}
		int antipodeLongitudeGrades = 180 - longitudeGrades;
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
