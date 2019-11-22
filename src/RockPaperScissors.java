import java.util.Scanner;
/// Mark Hooks
///11/19/2019
/// this program is to create a game of rock paper scissors where the user enters either rock paper or scissors and the computer enters the same based on randomness
/// then the program compares the users input vs the computers input and decides who wins
public class RockPaperScissors {
    static Scanner scan = new Scanner(System.in);
    public static String getUserChoice(){
        String userchoice = scan.next();
        userchoice = userchoice.toLowerCase();
        return userchoice;
    }
    public static String getComputerChoice(){
        int computer = (int) (Math.random() * 3) + 1;
        String computerchoice = "";
        if(computer == 1){
            computerchoice = "rock";
        }else if(computer == 2){
            computerchoice = "scissors";
        }else{
            computerchoice = "paper";
        }
        return computerchoice;
    }
    public static String whoWins(String computerchoice, String userchoice){
        String whowins = "";
        if(computerchoice.equals("rock")&&userchoice.equals("paper")){
            whowins = "You chose paper.\n" +
                    "The computer chose rock.\n" +
                    "You win!";

        }else if(computerchoice.equals("paper")&&userchoice.equals("paper")){
            whowins = "You chose paper.\n" +
                    "The computer chose paper.\n" +
                    "You tied!";
        }else if(computerchoice.equals("scissors")&&userchoice.equals("paper")){
            whowins = "You chose paper.\n" +
                    "The computer chose scissors.\n" +
                    "The computer wins!";

        }else if(computerchoice.equals("rock")&&userchoice.equals("rock")){
            whowins = "You chose rock.\n" +
                    "The computer chose rock.\n" +
                    "You tied!";
        }else if(computerchoice.equals("paper")&&userchoice.equals("rock")){
            whowins="You chose rock.\n" +
                    "The computer chose paper.\n" +
                    "The computer wins!";
        }else if(computerchoice.equals("scissors")&&userchoice.equals("rock")){
            whowins="You chose rock.\n" +
                    "The computer chose scissors.\n" +
                    "You win!";
        }else if(computerchoice.equals("paper")&&userchoice.equals("scissors")){
            whowins = "You chose scissors.\n" +
                    "The computer chose paper.\n" +
                    "You win!";
        }else if(computerchoice.equals("rock")&&userchoice.equals("scissors")){
            whowins="You chose scissors.\n" +
                    "The computer chose rock.\n" +
                    "The computer wins!";
        }else if(computerchoice.equals("scissors")&&userchoice.equals("scissors")){
            whowins="You chose scissors.\n" +
                    "The computer chose scissors.\n" +
                    "You tied!";
        }
        return whowins;
    }
    public static void main(String[] args) {
        System.out.println("Please Enter either Rock Paper or Scissors");
        String computerchioce = "";
        String userchoice = "";
        userchoice += getUserChoice();
        computerchioce += getComputerChoice();
        System.out.println("You chose "+ userchoice+".\nThe computer chose "+ computerchioce+".\n"+whoWins(computerchioce, userchoice));
    }
}
