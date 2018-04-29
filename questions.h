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

            System.out.flush();

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

    }
}

