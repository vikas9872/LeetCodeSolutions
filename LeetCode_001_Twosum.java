package Leetcode;
import java.util.Scanner;
public class LeetCode_001_Twosum {
    public static int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target: \n");
        int target=sc.nextInt();
        System.out.println("Enter the number of elements in array: \n");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the elements to array: \n");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }

    }
}
