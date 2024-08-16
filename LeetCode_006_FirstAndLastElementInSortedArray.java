package Leetcode;

import java.util.Scanner;

public class LeetCode_006_FirstAndLastElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=-1;
        result[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                result[1]=i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target: \n");
        int target= sc.nextInt();
        System.out.println("Enter the number of elements in array: \n");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the elements to array: \n");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int[] result= searchRange(nums,target);
        for(int x=0;x<result.length;x++){
            System.out.println("Elements are present at: "+result[x]+" positions");
        }
    }
}
