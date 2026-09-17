import java.util.Scanner;

public class easy10 {
    
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

        fill(nums,n);
    }

    static void fill(int[] nums, int n){
        int miss = 1;

        for(int i = 0; i<n; i++){
            if(miss == nums[i]){
                miss++;
            }
        }

        System.out.println("Missing No`s: "+miss);
    }
}
