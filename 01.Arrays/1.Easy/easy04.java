/*
QUESTION:-

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/ 

import java.util.Scanner;
import java.util.Stack;

public class easy04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the no of elements in Array: ");
        int n = scan.nextInt();

        int[] nums = new int[n];
        
        for(int i = 0; i<n;i++){
            System.out.print("Enter the Elements: ");
            int x = scan.nextInt();
            nums[i] = x ;
        }
        scan.close();
 
        System.out.println("The No of unique elements: "+(rm_dups(nums)+1));
        System.out.print("[");
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]);
            if(i < nums.length - 1 ){
                System.out.print(",");
            }    
        }    
        System.out.print("]");
    }   

    static int rm_dups(int[] nums){
        Stack<Integer> temp = new Stack<Integer>();
        int k = 0;       
        for(int i = 1; i < nums.length;i++){
            if(nums[i] != nums[i-1]){
                temp.push(nums[i]);
                k++;
            }
        }
        int r = k;

        for(int i = 1; i < nums.length;i++){
            if(!temp.empty())
                {
                nums[r] = temp.pop();
                r--;
            }
        } 
        return k;  
    }
}

