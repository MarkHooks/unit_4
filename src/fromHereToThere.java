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

    public static void main(String[] args){
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("From Here To There("+start+","+end+")-> " +fromHereToThere(start, end));
        int z = 1;
        int y = scan.nextInt();
        System.out.println("factors("+y+")-> the factors of "+y+" are: "+factors(y));

    }
}
