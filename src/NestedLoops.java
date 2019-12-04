import java.util.Scanner;

public class NestedLoops {
    public static String xSquare(){
        String str = "";
        for(int x = 1; x <= 5; x ++){
            for(int x2 = 1; x2<= 5; x2++){
                str += "X";
            }
            str += "\n";
        }
        return str;
    }
    public static String xSquare2(int n){
        String str = "";
        for(int x = 1; x <= n; x ++){
            for(int x2 = 1; x2<= n; x2++){
                str += "X";
            }
            str += "\n";
        }
        return str;
    }
    public static String flippedTriangle(int x){
        String str = "";
        for(int y = x; y >= 1; y --){
            for(int x2 = 1; x2<= y; x2++){
                str += "*";
            }
            str += "\n";
        }
        return str;

    }
    public static String multiplicationTable(){
        String str = "";
        for(int row = 1; row<=9; row ++){
            for(int num = 1; num<=9;num++){

                str+=" ";
                if(row * num<=9)
                    str += " ";
                str += num * row;
            }
            str+= "\n";
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(xSquare());
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        System.out.println(xSquare2(n));
        System.out.println("Enter n: ");
        int x = scan.nextInt();
        System.out.println(flippedTriangle(x));
        System.out.println(multiplicationTable());
    }

}
