import java.util.Scanner;
//import java.util.BitSet;
//import java.lang.Object;
import java.io.*;
import java.net.*;

public class Question{
// In order to use Bitfield do the following:
// All variables a methods are static so must be
// accesed by doing Bitfield.method
// The following are valid commands:
// Bitfield.set(*);
// Bitfield.clear(*);
// Bitfield.isSet(*);
// Bitfield.score();
// * - Replace the astirsk with Q1 through Q12 depending on the question
// Total for 1111 1111 1111 = 4095	
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

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

// Using BitSet to set binary value, i.e. q1.set(0) == 00000001
/*		LEGACY***
		BitSet q1 = new BitSet(N_BITS);
		BitSet q2 = new BitSet(N_BITS);
		BitSet q3 = new BitSet(N_BITS);
		BitSet q4 = new BitSet(N_BITS);
		BitSet q5 = new BitSet(N_BITS);
		BitSet q6 = new BitSet(N_BITS);
		BitSet q7 = new BitSet(N_BITS);
		BitSet q8 = new BitSet(N_BITS);
		BitSet q9 = new BitSet(N_BITS);
		BitSet q10 = new BitSet(N_BITS);
		BitSet q11 = new BitSet(N_BITS);
		BitSet q12 = new BitSet(N_BITS);

		q1.set(0);
		q2.set(1);
		q3.set(2);
		q4.set(3);
		q5.set(4);
		q6.set(5);
		q7.set(6);
		q8.set(7);
		q9.set(8);
		q10.set(9);
		q11.set(10);
		q12.set(11);
*///	LEGACY***

//		Bitfield testing = new Bitfield();
//		Bitfield.Set(Q2);
//		System.out.println(Bitfield.score());

// End of Bitset initalization q1 through q12 for each question
		LL cpp_ll = new LL();	
		System.out.println();

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
		System.out.println("Fun fact: The source code for this program was written in Java.");
		System.out.println("You are learning about C++ in Java. Mind boggling, right?");
		System.out.println(" ");
		System.out.println(" ");
		
		//Question 1
		System.out.println("QUESTION 1: Cin Statements ");
		System.out.println("What is the right syntax for a cin statement?");
		String name = in.nextLine();
		if (name.equals( "cin >>") ) {
			System.out.println("Correct!");
			Bitfield.set(Q1);
		}
		else if (name.equals( "cin>>") ) {
			System.out.println("Correct!");
			Bitfield.set(Q1);
		}
		else if (name.equals( ">>") ){
			System.out.println("Correct!");
			Bitfield.set(Q1);
		}
		else if (name.equals( "<<") ){
			System.out.println("Arrows are in wrong direction."); }
		else {
			System.out.println("Incorrect answer. The correct answer was: cin >>");   }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(1, "cin statements"); //write 1st topic into the end of the linked list

		//Question2
		System.out.println("QUESTION 2: Cout Statements ");
		System.out.println("What is the right syntax for a cout statement?");
		String name2 = in.nextLine();
		if (name2.equals( "cout <<") ) {
			System.out.println("Correct!");
			Bitfield.set(Q2);
		}
		else if (name2.equals( "cout<<") ) {
			System.out.println("Correct!");
			Bitfield.set(Q2);
		}
		else if (name2.equals( "<<") ){
			System.out.println("Correct!"); 
			Bitfield.set(Q2);
		}
		else if (name2.equals( ">>") ){
			System.out.println("Cout statements take the format of: cout << x; Note that it looks like there are arrows pointing FROM the variable TO cout. Your arrows are backwards."); }
		else if (name2.equals("cout>>") ) {
			System.out.println("Cout statements take the format of: cout << x; Note that it looks like there are arrows pointing FROM the variable TO cout. Your arrows are backwards."); }
		else {
			System.out.println("Incorrect answer. The correct answer was: cout <<");   }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(2, "cout statements"); //write 2nd topic into the end of the linked list

		//Question 3
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
			System.out.println("Correct! There is a semicolon missing after the endl."); 
			Bitfield.set(Q3);
		}
		else if (name3.equals( "c") ) {
			System.out.println("Correct! There is a semicolon missing after the endl."); 
			Bitfield.set(Q3);
		}
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
		cpp_ll.insert_last(3, "debugging compiler error"); //write 3rd topic into the end of the linked list

		//Question 4
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
			System.out.println("Correct!"); 
			Bitfield.set(Q4);
		}
		else if (name4.equals( "a") ) {
			System.out.println("Correct!"); 
			Bitfield.set(Q4);
		}
		else if (name4.equals( "B") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); 
			System.out.println("The correct answer is A."); }
		else if (name4.equals( "b") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); 
			System.out.println("The correct answer is A."); }
		else if (name4.equals( "C") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); 
			System.out.println("The correct answer is A."); }
		else if (name4.equals( "c") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); 
			System.out.println("The correct answer is A."); }
		else if(name4.equals("D") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); 
			System.out.println("The correct answer is A."); }
		else if(name4.equals("d") ) {
			System.out.println("Incorrect. The # is missing from in front of iostream."); 
			System.out.println("The correct answer is A."); }
		else {
			System.out.println("Invalid Input. The # is missing from in front of iostream.");  
			System.out.println("The correct answer is A."); }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(4, "magic"); //write 4th topic into the end of the linked list

		//Question 5
		System.out.println("QUESTION 5: If Statements");
		System.out.println("How would you write code that outputs 42 if the user inputs 20?");
		System.out.println("x is an int that is storing the user's input.");
		System.out.println("Choose the correct answer:");
		System.out.println("A. if (x = 20)  cout << 42; ");
		System.out.println("B. if (x == 20) cout << 42 ");
		System.out.println("C. if (x != \"20\") cout << 42; ");
		System.out.println("D. if (x == \"20\") cout << 42; ");
		String name5 = in.nextLine();
		if (name5.equals( "D") ) {
			System.out.println("Correct!"); 
			Bitfield.set(Q5);
		}
		else if (name5.equals( "d") ) {
			System.out.println("Correct!"); 
			Bitfield.set(Q5);
		}
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
		cpp_ll.insert_last(5, "if statements"); //write 5th topic into the end of the linked list

		//Question 6
		System.out.println("QUESTION 6: For Loops");
		System.out.println("Which of these is King Kerney's preferred way of outputting the numbers from 1 to 10?");
		System.out.println(" " );
		System.out.println("Choose the correct answer:");
		System.out.println(" ");
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
			System.out.println("Correct!"); 
			Bitfield.set(Q6);
		}
		else if (name6.equals( "a") ) {
			System.out.println("Correct!"); 
			Bitfield.set(Q6);
		}
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
		cpp_ll.insert_last(6, "for loops"); //write 6th topic into the end of the linked list

		//Question 7
		System.out.println("QUESTION 7: Power operator");
		System.out.println("How would you raise 3 to the 4th power in C++?");
		System.out.println("Choose an Appropriate answer:");
		System.out.println("A. pow(x, 4)");
		System.out.println("B. 3^4 ");
		System.out.println("C. pow(3,4) ");
		System.out.println("D. 3*3*3*3 ");
		String name7 = in.nextLine();
		if (name7.equals( "A") ) {
			System.out.println("Incorrect. Instead of x there should be 3."); 
			System.out.println("The correct answer is C."); }
		else if (name7.equals( "a") ) {
			System.out.println("Incorect. Instead of x there should be 3."); 
			System.out.println("The correct answer is C."); }
		else if (name7.equals( "B") ) {
			System.out.println("Incorrect. You've used the caret operator (^) with two integers, probably expecting it to raise one integer to the other. This operator in C++ is responsible for XOR (exclusive OR).");
			System.out.println("If you want to raise an integer to a power, use the <cmath> function pow()."); 
			System.out.println("The correct answer is C."); }
		else if (name7.equals( "b") ) {
			System.out.println("Incorrect. You've used the caret operator (^) with two integers, probably expecting it to raise one integer to the other. This operator in C++ is responsible for XOR (exclusive OR).");
			System.out.println("If you want to raise an integer to a power, use the <cmath> function pow()."); 
			System.out.println("The correct answer is C."); }
		else if (name7.equals( "D") ) {
			System.out.println("Incorrect. This is only valid in math, not in C++."); 
			System.out.println("The correct answer is C."); }
		else if (name7.equals( "d") ) {
			System.out.println("Incorrect. This is only valid in math, not in C++."); 
			System.out.println("The correct answer is C."); }
		else if(name7.equals("C") ) {
			System.out.println("Correct! "); 
			Bitfield.set(Q7);
		}
		else if(name7.equals("c") ) {
			System.out.println("Correct! "); 
			Bitfield.set(Q7);
		}
		else {
			System.out.println("Invalid Input.The correct answer is C.");  }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(7, "power operator"); //write 7th topic into the end of the linked list

		//Question 8
		System.out.println("QUESTION 8: For Loop Syntax");
		System.out.println("What is wrong with the statement below?");
		System.out.println(" ");
		System.out.println("for (int i = 0; i < 10; i++);");
		System.out.println(" ");
		System.out.println("Choose the correct answer:");
		System.out.println(" ");
		System.out.println("A. Nothing is wrong.");
		System.out.println("B. Extra semicolon after the for loop.");
		System.out.println("C. This syntax is only used in C#. ");
		String name8 = in.nextLine();
		if (name8.equals( "A") ) {
			System.out.println("Incorrect. A for loop does not require a semicolon after its declaration. ");
			System.out.println("A proper for loop is constructed as follows: for (int i = 0; i < 10; i++) { stuff to do.. } ");
			System.out.println("The correct answer is B.");}
		else if (name8.equals( "a") ) {
			System.out.println("Incorrect. A for loop does not require a semicolon after its declaration. ");
			System.out.println("A proper for loop is constructed as follows: for (int i = 0; i < 10; i++) { stuff to do.. } ");
			System.out.println("The correct answer is B."); }
		else if (name8.equals( "B") ) {
			System.out.println("Correct! A for loop does not require a semicolon after its declaration."); 
			Bitfield.set(Q8);
		}
		else if (name8.equals( "b") ) {
			System.out.println("Correct! A for loop does not require a semicolon after its declaration."); 
			Bitfield.set(Q8);
		}
		else if(name8.equals("C") ) {
			System.out.println("Incorrect. The correct answer is B."); }
		else if(name8.equals("c") ) {
			System.out.println("Incorrect. The correct answer is B."); }
		else {
			System.out.println("Invalid Input. The correct answer is B.");  }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(8, "for loop syntax"); //write 8th topic into the end of the linked list

		//Question 9
		System.out.println("QUESTION 9: Variable Sized Array");
		System.out.println("What is the right syntax in C++ to declare a variable sized array?");
		System.out.println(" ");
		System.out.println("Choose the correct answer:");
		System.out.println(" ");
		System.out.println("A. int arr[x];");
		System.out.println("B.  int *p = arr[x]; ");
		System.out.println("C.  int *p = new arr[x]; ");
		String name9 = in.nextLine();
		if (name9.equals( "A") ) {
			System.out.println("Incorrect. To declare a variable sized array. You must invoke the new function. As so, int *p = new arr[x]; This will create an");
			System.out.println("integer pointer to the beginning of an int arr with size x.. ");
			System.out.println("The correct answer is C."); }
		else if (name9.equals( "a") ) {
			System.out.println("Incorrect. To declare a variable sized array. You must invoke the new function. As so, int *p = new arr[x]; This will create an");
			System.out.println("integer pointer to the beginning of an int arr with size x.. ");
			System.out.println("The correct answer is C."); }
		else if (name9.equals( "B") ) {
			System.out.println("Incorrect. To declare a variable sized array. You must invoke the new function. But this is missing the new function."); }
		else if (name9.equals( "b") ) {
			System.out.println("Incorrect. To declare a variable sized array. You must invoke the new function. But this is missing the new function."); }
		else if(name9.equals("C") ) {
			System.out.println("Correct!");
			System.out.println("To declare a variable sized array. You must invoke the new function. As so, int *p = new arr[x]; This will create an");
			System.out.println("integer pointer to the beginning of an int arr with size x. "); 
			Bitfield.set(Q9);
		}
		else if(name9.equals("c") ) {
			System.out.println("Correct!");
			System.out.println("To declare a variable sized array. You must invoke the new function. As so, int *p = new arr[x]; This will create an");
			System.out.println("integer pointer to the beginning of an int arr with size x. "); 
			Bitfield.set(Q9);
		}
		else {
			System.out.println("Invalid Input. The correct answer is C.");  }
		System.out.println(" " );
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(9, "Variable sized arrays"); //write 9th topic into the end of the linked list

		//Question 10
		System.out.println("QUESTION 10: Null pointer");
		System.out.println("Why would the code below not work?");
		System.out.println(" " );
		System.out.println("int *x = null_ptr; cout << *x; ");
		System.out.println(" ");
		System.out.println("Choose the correct answer:");
		System.out.println(" ");
		System.out.println("A. It prints whatever is in the memory address.");
		System.out.println("B. Nothing is wrong. ");
		System.out.println("C. You cannot cout a pointer.");	
		System.out.println("D. You are dereferencing a null pointer.");
		String name10 = in.nextLine();
		if (name10.equals( "A") ) {
			System.out.println("Incorrect. You are dereferencing a null pointer. ");
			System.out.println("The correct answer is D.");}
		else if (name10.equals( "a") ) {
			System.out.println("Incorrect. You are dereferencing a null pointer. ");
			System.out.println("The correct answer is B."); }
		else if (name10.equals( "B") ) {
			System.out.println("Incorrect. You are dereferencing a null pointer. ");
			System.out.println("The correct answer is D.");}
		else if (name10.equals( "b") ) {
			System.out.println("Incorrect. You are dereferencing a null pointer. ");
			System.out.println("The correct answer is D.");}
		else if (name10.equals( "C") ) {
			System.out.println("Incorrect. You are dereferencing a null pointer. ");
			System.out.println("The correct answer is D.");}
		else if (name10.equals( "c") ) {
			System.out.println("Incorrect. You are dereferencing a null pointer. ");
			System.out.println("The correct answer is D.");}	
		else if(name10.equals("D") ) {
			System.out.println("Correct!"); 
			Bitfield.set(Q10);
		}
		else if(name10.equals("d") ) {
			System.out.println("Correct!"); 
			Bitfield.set(Q10);
		}
		else {
			System.out.println("Invalid Input. The correct answer is D.");  }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(10, "null pointers"); //write 10th topic into the end of the linked list

		//Question 11
		System.out.println("QUESTION 11: And/Or Operators");
		System.out.println("What will the code print to the screen?");
		System.out.println( " ");
		System.out.println("int x = 5; int y = 8;");
		System.out.println("cin >> x, y;");
		System.out.println("if (x == 5 & y == 8) { cout << \"AWESOME;\" } ");
		System.out.println("else cout << \"WRONG\" ");
		System.out.println( " ");
		System.out.println( "Please type in your answer below: ");
		String name11 = in.nextLine();
		if (name11.equals( "AWESOME") ) {
			System.out.println("Inorrect. You have not used the && operator properly."); }
		else if (name11.equals( "Awesome") ) {
			System.out.println("Incorrect. You've not used the && operator properly."); }
		else if (name11.equals( "awesome") ){
			System.out.println("Incorrect! You've not used the && operator properly."); }
		else if (name11.equals( "WRONG") ){
			System.out.println(" Correct!"); 
			Bitfield.set(Q11);
		}
		else if (name11.equals( "wrong") ){
			System.out.println(" Correct!"); 
			Bitfield.set(Q11);
		}
		else if (name11.equals( "Wrong") ){
			System.out.println(" Correct!"); 
			Bitfield.set(Q11);
		}
		else {
			System.out.println("Invalid Input. The correct answer was: WRONG");   }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(11, "and/or operators"); //write 11th topic into the end of the linked list

		//Question 12
		System.out.println("QUESTION 12: Bonus Question");
		System.out.println("Who invented the first compiler?");
		System.out.println(" ");
		System.out.println("Choose the correct answer:");
		System.out.println(" ");
		System.out.println("A. Grace Hopper");
		System.out.println("B. Ada Lovelace");
		System.out.println("C. Bill Gates");
		System.out.println("D. Bill Kerney");
		String name12 = in.nextLine();
		if (name12.equals( "A") ) {
			System.out.println("Correct!"); 
			Bitfield.set(Q12);
		}
		else if (name12.equals( "a") ) {
			System.out.println("Correct!"); 
			Bitfield.set(Q12);
		}
		else if (name12.equals( "B") ) {
			System.out.println("Incorrect. But Ada Lovelace was the first computer programmer.");
			System.out.println("The correct answer is A."); }
		else if (name12.equals( "b") ) {
			System.out.println("Incorrect. But Ada Lovelace was the first computer programmer."); 
			System.out.println("The correct answer is A."); }
		else if (name12.equals( "C") ) {
			System.out.println("Incorrect. Computer science is much older than Mr. Gates.");
			System.out.println("The correct answer is A.");}
		else if (name12.equals( "c") ) {
			System.out.println("Incorrect. Computer science is much older than Mr. Gates.");
			System.out.println("The correct answer is A."); }
		else if(name12.equals("D") ) {
			System.out.println("Incorrect. King Kerney invented the debugger EZPC, which is what this quiz was based off.");
			System.out.println("The correct answer is A."); }
		else if(name12.equals("d") ) {
			System.out.println("Incorrect. King Kerney invented the debugger EZPC, which is what this quiz was based off.");
			System.out.println("The correct answer is A."); }
		else {
			System.out.println("Invalid Input. The correct answer is A.");  }
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		cpp_ll.insert_last(12, "history of computer science"); //write 12th topic into the end of the linked list

		System.out.println(" ");
		System.out.println("Congratulations!");
		System.out.println("You have reached the end of the C++ Logic Quiz!");
		System.out.print("Your score: ");
		//Call on Bitfield for score
		System.out.println(Bitfield.score() + "/12");
		System.out.println("The topics you should work on are as follows: ");
		//Call on Linked List connected to Bitfield
		
		//Network call on localhosesocket 2021. Sends score to the server & receives a confirmation message.
		System.out.println("Your score has just been sent to your professor through our network.");
		try
		{
		Network client = new Network();
		client.run(Bitfield.score());
		}
		catch(Exception e){

			e.printStackTrace();
		};
		//End of network call

		System.out.println(" ");
		System.out.println("Good luck in your future computer science endeavors!");
	}

}


