import java.util.*;
public class Task3 {
 
    public static int solution(int[] A)
    {
        int n = A.length;
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
 
            if (A[i] > 0 && A[i] <= n)
                present[A[i]] = true;
        }

        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;
 
        return n + 1;
    }

     public static int [] readNumsFromCommandLine() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lentgh of numbers:");
        int count = s.nextInt();
   
        int [] numbers = new int[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }

        return numbers;
    }
 
    public static void main(String[] args)
    {
 
        int A[] = readNumsFromCommandLine();
        System.out.println(solution(A));
    }
}
