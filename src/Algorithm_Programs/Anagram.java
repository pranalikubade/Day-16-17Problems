package Algorithm_Programs;
import java.util.Arrays;
import  java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String str1=scanner.next();
        System.out.println("Enter 2nd String ");
        String str2=scanner.next();
        if (str1.length()==str2.length()){
            char[] charArray1=str1.toLowerCase().toCharArray();
            char[] charArray2=str2.toLowerCase().toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            Boolean result=Arrays.equals(charArray1,charArray2);
            if (result==true){
                System.out.println(str1 +" and "+ str2+ " are anagram");
            }
            else {
                System.out.println(str1 +" and "+ str2+ " are not anagram");
            }
        } else {
            System.out.println(str1 +" and "+ str2+ " are not anagram");
        }
    }
}
