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
        System.out.println(once(nums, n));
    }

    static int once(int[] nums,int n){
        int element = 0;
        for (int num : nums) {
            element ^=num;
            //  ^ is a fucking XOR gate like not Or gate
            // Fun Fact: I also did not know about it .
        }
        return element;
    }
}
