package Algorithm_Programs;

import java.util.Scanner;

public class PrimeNoInRange {
    public static boolean isPallindrome(String primeno) {
        int temp = primeno;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
     int i=0;
        int num=0;
        String primeNo=" ";
        for ( i=2;i<=1000;i++){
            int count=0;
            for (num = i; 1 <= num; num--) {
                if (i % num == 0) {
                    count=count+1;
                }
            }
            if (count==2){

                 primeNo=primeNo+i+" ";
            }
        }
        System.out.println("Prime numbers from 1 to 1000 are:");
        System.out.println(primeNo);


    }
}
