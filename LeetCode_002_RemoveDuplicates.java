package Leetcode;

import java.util.Scanner;

public class LeetCode_002_RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] != nums[i])
            {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
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
        int newLength = removeDuplicates(nums);
        System.out.println("The array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
