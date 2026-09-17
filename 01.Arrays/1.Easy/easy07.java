import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class easy07 {
    
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

        endZ(nums,n);

        System.out.print("[");
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]);
            if(i < nums.length - 1 ){
                System.out.print(",");
            }    
        }    
        System.out.print("]");
    }

    static void endZ(int[] nums,int n){
        Queue<Integer> q = new LinkedList<>();
        int noZ = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0){
                noZ++;
            }
            else if(nums[i] != 0){
                q.offer(nums[i]);
            }
        }
        for(int i = 0; i<n; i++){
            if(!q.isEmpty()){
                nums[i] = q.poll();
            }
            if(i>=n-noZ){
                nums[i] = 0;
            }
        }
    }
}
