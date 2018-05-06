import java.util.Scanner;
public class Question{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("WELCOME TO C++ LOGIC!");
		System.out.println("C++ Logic will test your  knowledge on common mistakes beginning programmers make in C++ using a quiz format.");
		System.out.println("Some questions will be multiple choice and others will give you sample code to debug.");
		System.out.println("At the end of the quiz, your score will be calculated and a list of concepts you might want to further study will be provided.");
		System.out.println("These will both be sent to your professor as well.");
		System.out.println("Good luck!");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");


		System.out.println("QUESTION 1: Cin Statements ");
		System.out.println("What is the right syntax for a cin statement?");
		String name = in.nextLine();
		if (name.equals( "cin >>") ) {
			System.out.println("Correct!"); }
		else if (name.equals( "cin>>") ) {
			System.out.println("Correct!"); }
		else if (name.equals( ">>") ){
			System.out.println("Correct!"); }
		else if (name.equals( "<<") ){
			System.out.println("Arrows are in wrong direction."); }
		else {
			System.out.println("Incorrect answer. The correct answer was: cin >>");   }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");


		System.out.println("QUESTION 2: Cout Statements ");
		System.out.println("What is the right syntax for a cout statement?");
		String name2 = in.nextLine();
		if (name2.equals( "cout <<") ) {
			System.out.println("Correct!"); }
		else if (name2.equals( "cout<<") ) {
			System.out.println("Correct!"); }
		else if (name2.equals( "<<") ){
			System.out.println("Correct!"); }
		else if (name2.equals( ">>") ){
			System.out.println("Cout statements take the format of: cout << x; Note that it looks like there are arrows pointing FROM the variable TO cout. Your arrows are backwards."); }
		else if (name2.equals("cout>>") ) {
			System.out.println("Cout statements take the format of: cout << x; Note that it looks like there are arrows pointing FROM the variable TO cout. Your arrows are backwards."); }
		else {
			System.out.println("Incorrect answer. The correct answer was: cout <<");   }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");


		System.out.println("QUESTION 3: Debugging Compiler Error");
		System.out.println("Why would the code below not compile?");
		System.out.println(" ");
		System.out.println("int x;");
		System.out.println("cin >> x;");
		System.out.println("cout << x << endl");
		System.out.println(" "); 
		System.out.println("Choose the correct answer:");   
		System.out.println("A. Wrong direction for cin arrows");
		System.out.println("B. Uninitialized variable");
		System.out.println("C. Missing a semicolon.");
		String name3 = in.nextLine();
		if (name3.equals( "C") ) {
			System.out.println("Correct! There is a semicolon missing after the endl."); }
		else if (name3.equals( "c") ) {
			System.out.println("Correct! There is a semicolon missing after the endl."); }
		else if (name3.equals( "A") ) {
			System.out.println("Incorrect. The arrows are pointing in the right direction. The correct answer is C."); }
		else if (name3.equals( "a") ) {
			System.out.println("Incorrect. The arrows are pointing in the right direction. The correct answer is C."); }
		else if (name3.equals( "B") ) {
			System.out.println("Incorrect. The code will still compile with an unitialized variable, but be warned that they are dangerous. The correct answer is C."); }
		else if (name3.equals( "b") ) {
			System.out.println("Incorrect. The code will still compile with an unitialized variable, but be warned that they are dangerous. The correct answer is C."); }
		else {
			System.out.println("Invalid Input. The correct answer is C.");   }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");


		System.out.println("QUESTION 4: Magic");
		System.out.println("Which part of the 'magic' is incorrect? ");
		System.out.println("include <iostream>");
		System.out.println("using namespace std; ");
		System.out.println("int main() {");
		System.out.print("     }    ");
		System.out.println(" ");
		System.out.println("Choose the correct answer:");
		System.out.println("A. include <iostream>");
		System.out.println("B. using namespace std;");
		System.out.println("C. int main () {}");
		System.out.println("D. There is nothing wrong");
		String name4 = in.nextLine();
		if (name4.equals( "A") ) {
			System.out.println("Correct!"); }
		else if (name4.equals( "a") ) {
			System.out.println("Correct!"); }
		else if (name4.equals( "B") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); }
		else if (name4.equals( "b") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); }
		else if (name4.equals( "C") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); }
		else if (name4.equals( "c") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); }
		else if(name4.equals("D") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); }
		else if(name4.equals("d") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); }
		else {
			System.out.println("Invalid Input. The # is missing from in front of iostream.");  }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");


		System.out.println("QUESTION 5: User Input");
		System.out.println("How would you write code that outputs 42 if the user inputs 20?");
		System.out.println("x is an int that is storing the user's input.");
		System.out.println("Choose the correct answer:");
		System.out.println("A. if (x = 20)  cout << 42; ");
		System.out.println("B. if (x == 20) cout << 42 ");
		System.out.println("C. if (x != \"20\") cout << 42; ");
		System.out.println("D. if (x == \"20\") cout << 42; ");
		String name5 = in.nextLine();
		if (name5.equals( "D") ) {
			System.out.println("Correct!"); }
		else if (name5.equals( "d") ) {
			System.out.println("Correct!"); }
		else if (name5.equals( "A") ) {
			System.out.println("Incorrect. The correct answer is D.");
			System.out.println(" = BAD.");
			System.out.println(" == GOOD");
			System.out.println(" = equals assignment and == comparision. "); }
		else if (name5.equals( "a") ) {
			System.out.println("Incorrect. The correct answer is D.");
			System.out.println(" = BAD.");
			System.out.println(" == GOOD");
			System.out.println(" = equals assignment and == comparision. "); }
		else if (name5.equals( "B") ) {
			System.out.println("Incorrect. There is a missing semicolon.The correct answer is D."); }
		else if (name5.equals( "b") ) {
			System.out.println("Incorrect. There is a missing semicolon. The correct answer is D."); }
		else if(name5.equals("C") ) {
			System.out.println("Incorrect. != stands for NOT EQUALS. The correct answer is D."); }
		else if(name5.equals("c") ) {
			System.out.println("Incorrect. != stands for NOT EQUALS. The correct answer is D."); }
		else {
			System.out.println("Invalid Input. The correct answer is D.");  }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");


		System.out.println("QUESTION 6: For loops");
		System.out.println("Which of these is King Kerney's preferred way of outputting the numbers from 1 to 10?");
		System.out.println("Choose the correct answer:");
		System.out.println("A. for (int i = 0; i < 10; i++ ) ");
		System.out.println("   cout << i << endl;");
		System.out.println("   }");
		System.out.println("B. for (int i = 1; i <= 9; i++) { ");
		System.out.println("   cout << i << endl;");
		System.out.println("   }");
		System.out.println("C. for (int i = 0; i < 11; i++) { ");
		System.out.println("   cout << i << endl;");
		System.out.println("   }");
		System.out.println("D. for(int i = 6; i < 16; i++) }");
		System.out.println("   cout << i << endl;");
		System.out.println("   }");
		String name6 = in.nextLine();
		if (name6.equals( "A") ) {
			System.out.println("Correct!"); }
		else if (name6.equals( "a") ) {
			System.out.println("Correct!"); }
		else if (name6.equals( "D") ) {
			System.out.println("Incorrect. This for loop is off by one. The correct answer is A."); }
		else if (name6.equals( "d") ) {
			System.out.println("Incorrect. This for loop is off by one. The correct answer is A."); }
		else if (name6.equals( "B") ) {
			System.out.println("Incorrect. This for loop only prints the numbers from 1 through 9. The correct answer is A."); }
		else if (name6.equals( "b") ) {
			System.out.println("Incorrect. This for loop only prints the numbers 1 through 9. The correct answer is A."); }
		else if(name6.equals("C") ) {
			System.out.println("Incorrect. This for loop prints the numbers 1 through 11. The correct answer is A."); }
		else if(name6.equals("c") ) {
			System.out.println("Incorrect. This for loop prints the numbers 1 through 11. The correct answer is A."); }
		else {
			System.out.println("Invalid Input. The correct answer is A.");  }
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

	}
}

