import java.util.*;

class loop2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of queries: \t");
        int q = sc.nextInt();
        int a[] = new int[q];
        int b[] = new int[q];
        int n[] = new int[q];
        for (int i = 0; i < q; i++) {
            // System.out.println("Enter value of a,b and n for each query: \t");
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int s = a[i];
            for (int j = 0; j < n[i]; j++) {
                s += (int) (Math.pow(2, j) * b[i]);
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }
}