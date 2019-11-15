import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll = (int) (Math.random() * 6) + 1;
        int score = 0;

        System.out.println("Welcome to Piglet!");
        score +=roll;
        System.out.println("You got a "+score+"!");
        if(score == 1) {
            System.out.println("You rolled a 1!\n You got 0 points");
        }
        while(score>1) {
            System.out.println("Roll again?");
            String rollagain = scan.next();
            if (rollagain.equals("y")||rollagain.equals("yes")) {
                roll = (int) (Math.random() * 6) + 1;
                score += roll;
                System.out.println("You rolled a "+roll);
                if(roll == 1){
                    System.out.println("You got 0 points");
                    break;
                }
            }else if(rollagain.equals("n")||rollagain.equals("no")){
                System.out.println("You got "+score+" points");
                break;
            }
        }


    }
}
