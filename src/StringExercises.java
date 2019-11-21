import java.util.Scanner;

public class StringExercises {
    static Scanner scan = new Scanner(System.in);
    private static String printTheLetters(String userword){
        String letters = "";
        for(int x = 0; x < userword.length(); x++){
            letters += "\n "+ userword.substring(x, x+1);
        }return letters;
    }
    public static String everyOtherLetter(String s){
        String everyother = "";
        for(int z = 0; z<s.length(); z+=2){

                everyother += s.substring(z, z+1);
        }
        return everyother;
    }
    public static int countingTheVowels(String s){
        int vowel = 0;
        for(int z = 0; z<s.length(); z++) {
            s = s.toLowerCase();
            if (s.substring(z, z + 1).equals("a") || s.substring(z, z + 1).equals("e")|| s.substring(z, z + 1).equals("i")|| s.substring(z, z + 1).equals("o")|| s.substring(z, z + 1).equals("u")) {
                vowel +=1;
            }
        }return vowel;
    }
    public static String differentStrings(String s1, String s2){
        return "";
    }
    public static void main(String[] args) {
        System.out.println(printTheLetters("Pizza"));
        System.out.println(everyOtherLetter("Computer Science"));
        System.out.println(countingTheVowels("COmpUter science"));
    }
}
