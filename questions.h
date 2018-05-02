import java.util.Scanner;
public class One{
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

            System.out.print("\f");

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
                  
                  System.out.print("\f");
       
                  
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
            esle if (name3.equals( "B") ) {
                System.out.println("Hmm ... that can be an issue, but NOT this time."); }
            else if (name3.equals( "b") ) {
                System.out.println("Hmm ... that can be an issue, but NOT this time."); }
            else {
                  System.out.println("Oops! YOU ARE SCREWED.");   }
                  
    }
}

