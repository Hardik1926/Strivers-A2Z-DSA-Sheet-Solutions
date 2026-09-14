import java.util.Arrays;
import java.util.Scanner;

public class easy03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the no of elements in Array: ");
        int n = scan.nextInt();
        // [3,4,5,1,2]

        int[] ognums = new int[n];
        int[] nums = new int[n]; 
        int[] newnums = new int[n]; 
        boolean isEqual;             

        for(int i =0 ; i<n ; i++){
            System.out.print("Enter the NOs: ");
            int x = scan.nextInt();
            ognums[i] = x;
        }

        nums = ognums.clone();

        Arrays.sort(nums);

        newnums = nums.clone();

        for(int j = 0; j < n; j++){
            isEqual = rotate(n, nums, newnums, ognums);
            if(isEqual){
                System.out.println(isEqual);
                break;
            }
            nums = newnums.clone();
        }

        isEqual = Arrays.equals(newnums, ognums);
        if(!isEqual){
            System.out.println(isEqual);
        }
        
        scan.close();

    }

    static boolean rotate(int n ,int[] nums,int[] newnums,int[] ognums) {
        for(int j = 0;j < n;j++){
            if(j< n-1){
            newnums[j] = nums[j+1];         
            }

            else{
                newnums[n-1] = nums[0];
            }

        }

        boolean isEqual = Arrays.equals(newnums, ognums);
        return isEqual;
    }
}