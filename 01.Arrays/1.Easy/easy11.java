import java.util.Scanner;

public class easy11 {

    // !    INComplete  
    
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
        cons(nums,n);
    }

    static void cons(int[] nums, int n){
        int temp = 1,c1 = 1;
        for(int i = 0; i < n-1;i++){
            if(nums[i] == nums[i+1] &&  nums[i]== 1){
                c1++;
            }
            else if(nums[i] == 0){
                temp = c1;
                c1 = 1;
            }
        }
        if(c1>temp){
            System.out.println(c1);
        }
        else{
            System.out.println(temp);
        }
    }
}


