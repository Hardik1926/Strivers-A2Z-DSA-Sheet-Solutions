import java.util.Scanner;

public class easy07 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the no of elements in Array: ");
        int n = scan.nextInt();

        int[] nums = new int[n];
        
        for(int i = 0; i<n;i++){
            System.out.print("Enter the Elements: ");
            int temp = scan.nextInt();
            nums[i] = temp ;
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
        int temp = 1;
        for(int i = 0; i<n-1 && temp<n; i++){
            temp = i+1;
            if(temp<n && nums[i] == 0){
                if(nums[temp] == 0){
                    temp++;
                }
                if(temp<n){
                    nums[i] = nums[temp];
                    nums[temp] = 0;
                }   
            }
        }
    }
}
