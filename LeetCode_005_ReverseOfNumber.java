package Leetcode;

import java.util.Scanner;

public class LeetCode_005_ReverseOfNumber {
    public static int reverse(int x) {
        int rem=0;
        int revNum=x;
        int rev=0;
        while(revNum!=0){
            rem=revNum%10;
            rev=rev*10+rem;
            revNum=revNum/10;
            // To check if the number exceeds Int32 range
            if(rev%10!=rem){
                return 0;
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int reversedNumber=reverse(num);
        System.out.println("Reversed Number: "+reversedNumber);
    }
}
