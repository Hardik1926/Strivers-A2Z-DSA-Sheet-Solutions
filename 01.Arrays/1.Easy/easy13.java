import java.util.Scanner;

public class easy13 {
    
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
        once(nums, n);
    }

    static int once(int[] nums,int n){
        int element = 0;

        for(int i =0;i<n-1;){
        }
        return element;
    }
}
