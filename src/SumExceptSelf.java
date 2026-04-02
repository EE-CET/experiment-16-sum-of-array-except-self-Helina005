   
        import java.util.Scanner;

public class SumExceptSelf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        long totalSum = 0;

        // Read array elements and calculate total sum
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        // Calculate and print the result
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long resultValue = totalSum - arr[i];
            output.append(resultValue);
            
            // Add space between elements, but not after the last one
            if (i < n - 1) {
                output.append(" ");
            }
        }

        System.out.println(output.toString());
        sc.close();
    }

}
