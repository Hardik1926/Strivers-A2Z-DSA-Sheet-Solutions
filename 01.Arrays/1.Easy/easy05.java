import java.util.Scanner;

public class easy05 {
  public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the no of elements in Array: ");
        int N = scan.nextInt();

        int[] ARR = new int[N];

        for(int i = 0; i<N;i++){
            System.out.print("Enter the Elements: ");
            int x = scan.nextInt();
            ARR[i] = x ;
        }
        scan.close();
        shiftL(ARR,N);
        System.out.print("[");
        for(int i = 0; i < N;i++){
            System.out.print(ARR[i]);
            if(i < N - 1 ){
                System.out.print(",");
            }    
        }    
        System.out.print("]");
  }

  static void shiftL(int[] ARR,int N){
    int temp = ARR[0];
    for(int i = 0; i<N-1;i++){
      ARR[i] = ARR[i+1];
    }
    ARR[N-1] = temp;
  }
}
