
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create scanner called scan
        Scanner scan=new Scanner(System.in);

        //start the game
        System.out.println("Hello Human, lets play Rock-Paper-Scissors.");
        System.out.println("Please press: R for Rock, P for Paper or S for Scissors below.");

        //Human move: capture human input
        String humanselection=scan.next();
        String humanmove="";
        //transform input into game-move
        if (humanselection.equals("r")||humanselection.equals("R")){
            humanmove = "Rock";
        }else if (humanselection.equals("p")||humanselection.equals("P")){
            humanmove = "Paper";
        }else if (humanselection.equals("s")||humanselection.equals("S")){
            humanmove = "Scissors";
        }else {
            System.out.println("Invalid move.");}
        //only continue the program if it's a valid input
        if (!humanmove.equals("Rock")&&!humanmove.equals("Paper")&&!humanmove.equals("Scissors")){
            System.out.println("Please play again, thanks!!");}
            else {

                // Computer move: Generate random integer between 0,1 and 2
                int randomnumber = (int) (Math.random() * 3);
                // Take the number and  transform it into a rock, paper or scissors
                String computermove = "";
                if (randomnumber == 0) {
                    computermove = "Rock";
                } else if (randomnumber == 1) {
                    computermove = "Paper";
                } else {
                    computermove = "Scissors";
                }

                //display moves
                System.out.println("Player: " + humanmove + " vs Computer: " + computermove);

                //calculate and display outcome
                if (humanmove.equals(computermove)) {
                    System.out.println("Result: It's a tie!!");
                } else if (humanmove.equals("Rock") && computermove.equals("Scissors")
                        || (humanmove.equals("Paper") && computermove.equals("Rock"))
                        || (humanmove.equals("Scissors") && computermove.equals("Paper"))) {
                    System.out.println("Result: You win!!");
                } else {
                    System.out.println("Result: You lose!!");
                }

            }





    }
}
