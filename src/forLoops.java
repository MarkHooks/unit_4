import java.util.Scanner;

public class forLoops {

    private static String printingHasTags(int numhashtag){
        String hashtag = "";
        if(numhashtag>0){
            for(int x = 1; x<= numhashtag;){
                x ++;
                hashtag += "#";
            }
        }else{
            hashtag +="";
        }
        return hashtag;

    }
    private static String countDown(int num1, int num2){
        String count = "";
        if (num2>num1){
            for(int count2 = num2;count2 >=num1; count2--){
                count += " " + num2--;
            }
        }return count;
    }
    private static String countDown2(int num1, int num2){
        String count = "";
        if (num2>num1){
            for(int count2 = num2;count2 >=num1; count2--){
                count += " " + num2--;
            }
        }else if(num1>num2){
            for(int count3 = num1;count3 >=num2; count3++){
                count += " " + count3;
            }
        }else return "";
        return count;
    }
    public static void main(String[] args) {
        System.out.println(printingHasTags(7));
        System.out.println(countDown(0, 10));
        System.out.println(countDown(10, 0));
    }
}
