import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class easy09 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the no of elements in Array1: ");
        int n = scan.nextInt();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i<n;i++){
            System.out.print("Enter the Elements: ");
            int x = scan.nextInt();
            set1.add(x);
        }

        System.out.print("Enter the no of elements in Array2: ");
        int m = scan.nextInt();

        for(int i = 0; i< m;i++){
            System.out.print("Enter the Elements: ");
            int x = scan.nextInt();
            set2.add(x);
        }
        scan.close();
        Set<Integer> union = new HashSet<>(set1);

        union.addAll(set2);

        System.out.println("Union: "+union);
    }
}
