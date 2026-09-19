import java.util.Scanner;

public class easy12_imcomplete {
    
    public static void main(String[] args) {

        // ! Imcomplete
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the no of elements in Array: ");
        int N = scan.nextInt();

        int[] A = new int[N];
        
        for(int i = 0; i<N;i++){
            System.out.print("Enter the Elements: ");
            int x = scan.nextInt();
            A[i] = x ;
        }

        System.out.println("Enter the No: ");
        int K = scan.nextInt();
        scan.close();

        sumarray(A,N,K);
    }

    static void sumarray(int[] A,int N,int K){
    }
}
