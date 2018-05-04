import java.util.Scanner;
public class Question{
         public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
            // String answer_one;
        System.out.println("What is right syntax for cin? ");
          String name = in.nextLine();
                   if (name.equals( "cin >>") ) {
            System.out.println("Your answer is correct."); }
                  else if (name.equals( "cin>>") ) {
                System.out.println("Your answer is correct."); }
            else if (name.equals( ">>") ){
                System.out.println("Your answer is correct."); }
            else if (name.equals( "<<") ){
                System.out.println("Arrows are in wrong direction."); }

            else {
                System.out.println("Oops! YOU ARE SCREWED.");   }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

            // System.out.print("\f");

        System.out.println("2.What is right syntax for cout? ");
          String name2 = in.nextLine();
            if (name2.equals( "cout <<") ) {
                System.out.println("Your answer is correct."); }
            else if (name2.equals( "cout<<") ) {
                System.out.println("Your answer is correct."); }
            else if (name2.equals( "<<") ){
                System.out.println("Your answer is correct."); }
            else if (name2.equals( ">>") ){
                System.out.println("Hey, it looks like you're trying to do a cout statement. In order to do a cout statement, you want to type something like this: cout << x; Note that it looks like there are arrows pointing FROM the variable TO cout. I think you might have done yours backwards (cout >> x; is wrong).." ); }
            else if (name2.equals("cout>>") ) {
            System.out.println("Hey, it looks like you're trying to do a cout statement. In order to do a cout statement, you want to type something like this: cout << x; Note that it looks like there are arrows pointing FROM the variable TO cout. I think you might have done yours backwards (cout >> x; is wrong).."); }
             else {
                System.out.println("Oops! YOU ARE SCREWED.");   }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
                  
                //  System.out.print("\f");   
                 
              System.out.println("3. Why would the code below not compile?");
              System.out.println("int x;");
              System.out.println("cin >> x;");
              System.out.println("cout << x << endl");
               System.out.println(" "); 
               System.out.println("Choose an Appropriate answer:");   
                 System.out.println("A. Wrong cin Arrows.");
                 System.out.println("B. uninitialized variable.");
                 System.out.println("C. Missing a Semicolon.");
                 String name3 = in.nextLine();
             if (name3.equals( "C") ) {
                System.out.println("Your answer is correct."); }
            else if (name3.equals( "c") ) {
                System.out.println("Your answer is correct."); }
            else if (name3.equals( "A") ) {
                System.out.println("I know it is disappointing, but ARROWS are perfectly fine."); }
            else if (name3.equals( "a") ) {
                System.out.println("I know it is disappointing, but ARROWS are perfectly fine."); }
            else if (name3.equals( "B") ) {
                System.out.println("Hmm ... that can be an issue, but NOT this time."); }
            else if (name3.equals( "b") ) {
                System.out.println("Hmm ... that can be an issue, but NOT this time."); }
            else {
                  System.out.println("Oops! YOU ARE SCREWED.");   }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
                  
                //  System.out.print("\f");
 
                  System.out.println("4. Which part of 'The Magic' is missing? ");
                  System.out.println("#include <iostream>");
                  System.out.println("int main() {");
                  System.out.print("     }    ");
                  System.out.println(" ");
                   System.out.println("Choose an Appropriate answer:");
        System.out.println("A. cout << 'Hello World!' << endl;");
        System.out.println("B. int main() {}");
        System.out.println("C. using namespace std;");
        System.out.println("D. #include <cmath>");
                  String name4 = in.nextLine();
        if (name4.equals( "C") ) {
            System.out.println("Your answer is correct."); }
        else if (name4.equals( "c") ) {
            System.out.println("Your answer is correct."); }
        else if (name4.equals( "A") ) {
            System.out.println(" Well! cout statements are NOT part of magic."); }
        else if (name4.equals( "a") ) {
            System.out.println("Well! cout statements are NOT part of magic."); }
        else if (name4.equals( "B") ) {
            System.out.println("This is not missing .... try{ EYE exam}, catch{ WEAR GLASSES} ."); }
        else if (name4.equals( "b") ) {
            System.out.println("This is not missing .... try{ EYE exam}, catch{ WEAR GLASSES} ."); }
        else if(name4.equals("D") ) {
            System.out.println(" NOPE."); }
        else if(name4.equals("d") ) {
            System.out.println(" NOPE."); }
        else {
            System.out.println("Oops! YOU ARE SCREWED.");  }
                  System.out.println(" ");
                  System.out.println(" ");


        System.out.println("5. How should you write code that will output 42 if the user types in 20 as the input?");
        System.out.println("s is an int that has the user's input already read in. And double quotes are represented as: ' ' ") ;

        System.out.println("Choose an Appropriate answer:");
        System.out.println("A. if (s = 20)  cout << 42; ");
        System.out.println("B. if ( s == 20) cout << 42; ");
        System.out.println("C. if (s != '20') cout << 42; ");
        System.out.println("D. if ( s == '20') cout << 42; ");
        String name5 = in.nextLine();
        if (name5.equals( "D") ) {
            System.out.println("Your answer is correct."); }
        else if (name5.equals( "d") ) {
            System.out.println("Your answer is correct."); }
        else if (name5.equals( "A") ) {
            System.out.println(" = BAD.");
            System.out.println(" == GOOD");
            System.out.println(" = equals assignment and == comparision. "); }
        else if (name5.equals( "a") ) {
            System.out.println(" = BAD.");
            System.out.println(" == GOOD");
            System.out.println(" = equals assignment and == comparision. "); }
        else if (name5.equals( "B") ) {
            System.out.println("Oops! way close, but it's missing semicolon. COMPILER ERROR ."); }
        else if (name5.equals( "b") ) {
            System.out.println("Oops! way close, but it's missing semicolon. COMPILER ERROR ."); }
        else if(name5.equals("C") ) {
            System.out.println(" != NOT EQUALS #we wand EQUALS. "); }
        else if(name5.equals("c") ) {
            System.out.println(" != NOT EQUALS #we wand EQUALS. "); }
        else {
            System.out.println("Oops! YOU ARE SCREWED.");  }
                  System.out.println(" ");
                  System.out.println(" ");

        System.out.println("6. Which one of these is the preferred way of outputting the numbers from 1 to 10? ");
        System.out.println("Choose an Appropriate answer:");
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
            System.out.println("Your answer is correct."); }
        else if (name6.equals( "a") ) {
            System.out.println("Your answer is correct."); }
        else if (name6.equals( "D") ) {
            System.out.println(" Wrong. Your answer is off by one."); }
        else if (name6.equals( "d") ) {
            System.out.println(" Wrong. Your answer is off by one."); }
        else if (name6.equals( "B") ) {
            System.out.println("Wrong. This only prints number from 1 to 9."); }
        else if (name6.equals( "b") ) {
            System.out.println("Wrong. This only prints number from 1 to 9."); }
        else if(name6.equals("C") ) {
            System.out.println(" Wrong. This prints an extra number (1 to 11). "); }
        else if(name6.equals("c") ) {
            System.out.println(" Wrong. This prints an extra number (1 to 11). "); }
        else {
            System.out.println("Oops! YOU ARE SCREWED.");  }
        System.out.println(" ");
        System.out.println(" ");


     }
}

