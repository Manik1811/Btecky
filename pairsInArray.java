import java.util.*;

public class PairsInArray {
    public static void pairs(int n[]){
        for(int i=0;i<n.length;i++){
            int curr=n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+curr+","+n[j]+")");
        }
        System.out.println();
    }
    }
    public static void main(String args []) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int n[] = new int[size];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                n[i] = sc.nextInt();
            }
        }
        pairs(n);
    }
}
