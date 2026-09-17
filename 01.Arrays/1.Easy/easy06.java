import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class easy06 {
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

        System.out.print("Rotate by: ");
        int k = scan.nextInt();
        System.out.print("Right(1) OR Left(2): ");
        int dir = scan.nextInt();
        scan.close();

        rotate(nums, n, k, dir);
        System.out.print("[");
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]);
            if(i < nums.length - 1 ){
                System.out.print(",");
            }    
        }    
        System.out.print("]");
    }
    
    static void rotate(int[] nums,int n, int k, int dir){
        Queue<Integer> front = new LinkedList<>();
        Queue<Integer> back = new LinkedList<>();
        
        for(int i = 0;i<n;i++){
            if(i<n-k){
                front.offer(nums[i]);
            }
            if(i>=n-k){
                back.offer(nums[i]);
            }
        }

        if(dir == 1){
            for(int i = 0; i<n ; i++){
                if(!back.isEmpty()){
                    nums[i] = back.poll();
                }
                else if(!front.isEmpty()){
                    nums[i] = front.poll();
                }
            }
        }
        else if(dir == 2){
            for(int i = 0; i<n ; i++){
                if(!back.isEmpty()){
                    nums[i] = back.poll();
                }
                else if(!front.isEmpty()){
                    nums[i] = front.poll();
                }
            }
        }
    }
}
