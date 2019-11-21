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
            whowins = "User Wins!";

        }else if(computerchoice.equals("paper")&&userchoice.equals("paper")){
            whowins = "Tie";
        }else if(computerchoice.equals("scissors")&&userchoice.equals("paper")){
            whowins = "Computer Wins";

        }else if(computerchoice.equals("rock")&&userchoice.equals("rock")){
            whowins = "Tie";
        }else if(computerchoice.equals("paper")&&userchoice.equals("rock")){
            whowins="Computer Wins!";
        }else if(computerchoice.equals("scissors")&&userchoice.equals("rock")){
            whowins="User Wins!";
        }else if(computerchoice.equals("paper")&&userchoice.equals("scissors")){
            whowins = "User Wins!";
        }else if(computerchoice.equals("rock")&&userchoice.equals("scissors")){
            whowins="Computer Wins!";
        }else if(computerchoice.equals("scissors")&&userchoice.equals("scissors")){
            whowins="Tie";
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
