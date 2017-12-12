package conditions;

/**
 *brace brackets after switch statement and not in case 
 *
 *
 */
public class SwitchCase {
	long b = 23_482_345_629L;

	public static void main(String args[]) {
		char grade = 'B'; // switch only byte(1),short(2),int(4),char(2)
		switch (grade) {
		case 'A':case 'Z':
			System.out.println("Good job");
			System.out.println("no brackets");
		case 'B':
			System.out.println("Pretty good");
		case 'C':
			System.out.println("Passed");
		case 'D':
			System.out.println("Not so good");
		case 'F':
			System.out.println("Failed");
		default:
			System.out.println("Unknown grade");
		}

	}

}

/**
switch() similar to while() and for() -- remember for brakets

**/