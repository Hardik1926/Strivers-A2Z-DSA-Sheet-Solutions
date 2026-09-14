import java.util.Scanner;

//! Not Complete

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
    }   

    static void Arr(){
        
    }
}


// use set set remove duplicates
