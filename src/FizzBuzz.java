import java.util.Scanner;

public class FizzBuzz {
    static Scanner scan = new Scanner(System.in);
    public static String fizzBuzz(int x){
        String str = "";
        for(int i = 1; i<=x; i++){
            if(i%3 == 0 && i %5 == 0){
                str += "fizzBuzz ";
            }else if(i %5 == 0){
                str += "buzz ";
            }else if(i %3 == 0){
                str += "fizz ";
            }else{
                str += i + " ";
            }
            if(i%20 == 0){
                str += "\n";
            }
        }
        return str;
    }

    public static void main(String[] args){
        System.out.println("enter the number you want to count up to: ");
        int x = scan.nextInt();
        System.out.println(fizzBuzz(x));
    }
}
