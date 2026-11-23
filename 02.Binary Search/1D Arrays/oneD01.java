import java.util.Scanner;

public class oneD01 {
    
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

        System.out.print("Enter the target: ");
        int k = scan.nextInt();
        scan.close();

        System.out.println(Bsearch(nums,k));
    }

    static int Bsearch(int[] nums, int k){
        int start = 0;
        int end = nums.length - 1;
        int mid = (start+end)/2;

        while (start<=end) { 
            if(nums[mid] == k){
                return mid;
            }
            if(nums[mid] > k){
                end = mid+1;
                mid = (start+end)/2;
            }
            if(nums[mid] < k){
                start = mid+1;
                mid = (start+end)/2;
            }
        } 
        return -1;
    }
}
