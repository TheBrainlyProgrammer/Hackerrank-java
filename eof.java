import java.util.*;

public class eof {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:\t");
        int n = sc.nextInt();
        sc.nextLine();
        String s[] = new String[n];
        for (int i = 1; i <= n; i++)
            while (sc.hasNextLine()) {
                s[i-1]+=sc.next()+" ";
            }
        for (int i = 0; i < n; i++)
            System.out.println(i+1 + " " + s[i]);
    }
}