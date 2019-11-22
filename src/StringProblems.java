import java.util.Scanner;

public class StringProblems {
    static Scanner scan = new Scanner(System.in);
    public static String printTheLetters(String userword){
        String letters = "";
        for(int x = 0; x < userword.length(); x++){
            letters += userword.substring(x, x+1) +"\n";
        }return letters;
    }
    public static String everyOtherLetter(String s){
        String everyother = "";
        for(int z = 0; z<s.length(); z+=2){

                everyother += s.substring(z, z+1);
        }
        return everyother;
    }
    public static int countTheVowels(String s){
        int vowel = 0;
        for(int z = 0; z<s.length(); z++) {
            s = s.toLowerCase();
            if (s.substring(z, z + 1).equals("a") || s.substring(z, z + 1).equals("e")|| s.substring(z, z + 1).equals("i")|| s.substring(z, z + 1).equals("o")|| s.substring(z, z + 1).equals("u")) {
                vowel +=1;
            }
        }return vowel;
    }
    public static String differentStrings(String s1, String s2){
        int num = 0;
        String s3 = "";
        if(s1.equals(s2)){
            s3 = s1+" and "+s2+" are the same";
            return s3;
        }else{
            for(int i= 0; i<s2.length(); i++){
                while(s1.substring(i, i+1).equals(s2.substring(i, i+1))){
                    num++;
                    s3 = s1+" and "+s2+" are not the same. They differ at letter number "+num;

                    break;
                }
            }
        }
        return s3;
    }
    public static boolean isPalindrome(String s){
        String backwards = "";
        boolean s2;
        s = s.toLowerCase();
        for(int i = s.length() -1;i>=0;i--){
            backwards = backwards + s.charAt(i);
        }if(backwards.equals(s)){
            s2 = true;
        }else {
            s2 = false;
        }return s2;
    }
    public static void main(String[] args) {
        System.out.println(printTheLetters("Pizza"));
        System.out.println(everyOtherLetter("Computer Science"));
        System.out.println(countTheVowels("COmpUter science"));
        System.out.println(differentStrings("Flint", "Flont"));
        System.out.println(isPalindrome("deed"));
    }
}
