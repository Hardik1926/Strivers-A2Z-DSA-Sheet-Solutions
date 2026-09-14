import java.util.Arrays;
import java.util.Scanner;

public class easy02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the no of elements in Array: ");
        int n = scan.nextInt();

        int[] nums = new int[n];

        for(int i =0;i<n;i++){
            System.out.print("Enter the NOs: ");
            int x = scan.nextInt();
            nums[i] = x;

        }

        Arrays.sort(nums);

        System.out.println(nums[n-2]);
        
        scan.close();
    }
}