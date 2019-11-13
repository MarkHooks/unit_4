import javax.print.DocFlavor;
import java.util.Scanner;

public class fromHereToThere {
    static Scanner scan = new Scanner(System.in);
    private static String fromHereToThere(int start, int end){
        String str = "";
        if(start<end) {
            while (start < end) {

                str += start++ + " ";

            }
        }
        else
            return "Invalid input";
        return str+end ;
    }
    private static String factors(int y){
        String factor = "";
        int z = 1;
            while (z<= y) {
                if(y%z == 0)
                    factor += z + " ";
                z++;

            }


        return factor;
    }
    private static String CountPosAndNeg(){
        System.out.println("Enter a positive or negative number or 0 to quit");
        int usnum = scan.nextInt();
        int posnum = 0;
        int negnum = 0;
        int numpos = 1;

            if (usnum > 0) {
                posnum ++;
                while(usnum!=0){
                    System.out.println("Enter a positive or negative number or 0 to quit");
                    usnum = scan.nextInt();
                    if(usnum>0)
                        posnum++;
                    else if(usnum<0)
                        negnum++;
                }
            } else if(usnum< 0){
                while (usnum != 0) {
                    negnum++;
                    System.out.println("Enter a positive or negative number or 0 to quit");
                    usnum = scan.nextInt();
                    if(usnum<0)
                        negnum++;
                    else if(usnum>0)
                        posnum++;
                }
            }
        return "There were "+posnum+ " positive and "+negnum+" negative numbers";
    }
    private static String findMinAndMax(){
        System.out.println("Number: ");
        int usenum = scan.nextInt();
        int n = 1;
        int minval = Integer.MAX_VALUE, maxval = 0;
        while(n<=5){
            n++;
            System.out.println("Number: ");
            usenum = scan.nextInt();
            if(usenum> maxval)
                maxval = usenum;
            else if(usenum < minval)
                minval = usenum;
        }
        return "Max value is : "+maxval+"\nMin value is: "+ minval;
    }
    public static double gradePoint(){
        double gpa = 1;
        int g = 1;
        System.out.println("grade");
        while(g<= 7){
            String usegrade = scan.next();
            g++;
            if(usegrade.equals("A")){
                gpa += 4.0;
            }else if(usegrade.equals("B")){
                gpa += 3.0;
            }else if(usegrade.equals("C")){
                gpa += 2.0;
            }else if(usegrade.equals("D")){
                gpa+=1.0;
            }else if(usegrade.equals("F")) {
                gpa += 0.0;
            }
        }
        gpa = gpa/7;
        gpa = (int)((gpa* 100)+.5);
        gpa = (double)(gpa/100);
        return gpa;
    }
    public static void main(String[] args){
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("From Here To There("+start+","+end+")-> " +fromHereToThere(start, end));
        int z = 1;
        int y = scan.nextInt();
        System.out.println("factors("+y+")-> the factors of "+y+" are: "+factors(y));


        System.out.println(CountPosAndNeg());
        System.out.println(findMinAndMax());
        System.out.println("GPA = "+gradePoint());
    }
}
