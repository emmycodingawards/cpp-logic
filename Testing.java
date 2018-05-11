/*
import java.util.Scanner;

public class Testing {

	public static final int Q1 = 1 << 0;
	public static final int Q2 = 1 << 1;
	public static final int Q3 = 1 << 2;
	public static final int Q4 = 1 << 3;
	public static final int Q5 = 1 << 4;
	public static final int Q6 = 1 << 5;
	public static final int Q7 = 1 << 6;
	public static final int Q8 = 1 << 7;
	public static final int Q9 = 1 << 8;
	public static final int Q10 = 1 << 9;
	public static final int Q11 = 1 << 10;
	public static final int Q12 = 1 << 11;

	public static int datafield;

	//Set passed in flag on data field
	public static void Set(int flag) {
		datafield |= flag;
	}
	//Clear the passed in flag
	public static void Clear(int flag) {
		datafield = datafield & ~flag;
	}
	//Return true if the passed in flag is set
	public static boolean isSet(int flag) {
		int _isSet = (datafield & flag);
		if (_isSet < 1)
			return false;
		else return true;
	}
	public static int score() {
		int total = 0;
		if(isSet(Q1))
			total++;
		if(isSet(Q2))
			total++;
		if(isSet(Q3))
			total++;
		if(isSet(Q4))
			total++;
		if(isSet(Q5))
			total++;
		if(isSet(Q6))
			total++;
		if(isSet(Q7))
			total++;
		if(isSet(Q8))
			total++;
		if(isSet(Q9))
			total++;
		if(isSet(Q10))
			total++;
		if(isSet(Q11))
			total++;
		if(isSet(Q12))
			total++;
		return total;
	}
	public static void main(String[] args) {
		System.out.println(datafield);
		Testing test = new Testing();
		test.Set(Q2);
		test.Set(Q4);
		System.out.println(datafield);
		System.out.println(test.isSet(Q1));
		System.out.println(test.score());
	}
}
*/
