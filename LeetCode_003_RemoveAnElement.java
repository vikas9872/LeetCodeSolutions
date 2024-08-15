package Leetcode;

import java.util.Scanner;

public class LeetCode_003_RemoveAnElement {
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: \n");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the elements to array: \n");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value: \n");
        int val=sc.nextInt();
        int res=removeElement(nums, val);
        for (int i = 0; i < val-1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
