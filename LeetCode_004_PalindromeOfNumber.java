package Leetcode;

import java.util.Scanner;

public class LeetCode_004_PalindromeOfNumber {
    public static boolean isPalindrome(int x) {
        int revNum=x;
        int rem=0;
        int rev=0;
        if(x<0){
            return false;
        }
        else{
            while(revNum!=0){
                rem=revNum%10;
                rev=rev*10+rem;
                revNum=revNum/10;
            }
        }
        if(rev==x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        boolean y=isPalindrome(num);
        System.out.println("\nGiven number is palindrome?: "+y);
    }
}
