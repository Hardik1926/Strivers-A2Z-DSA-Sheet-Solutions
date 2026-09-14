import java.util.Scanner;

public class easy04 {

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

        rm_dups(nums);
    }   

    static void rm_dups(int[] nums){
        int count = 0;
        int[] temp = nums.clone();        
        for(int i = 1; i < nums.length;i++){
            if(nums[i] == nums[i-1]){
                temp[i] = 2147483647;
            }
        }

        int[] newnums = new int[nums.length];
        int j = 0;
        for(int num : temp){
            if(num != 2147483647){
                newnums[j] = num;
                j++;
                count++;
            }
        }

        System.out.printf("No of Unique elements: %d",count);
        System.out.println();

        System.out.print("[");
        for(int i = 0; i < newnums.length;i++){
            if(i == newnums.length - 1 ){
                break;
            }
            
            System.out.print(newnums[i] + ",");
        }    
        System.out.println("]");   
    }
}

