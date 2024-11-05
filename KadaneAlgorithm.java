import java.util.Scanner;

public class KadaneAlgorithm {
    
    // Function to implement Kadane's algorithm
    public static int kadane(int[] array) {
        int maxSoFar = array[0]; 
        int maxEndingHere = array[0]; 
        
        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]); 
            maxSoFar = Math.max(maxSoFar, maxEndingHere); 
        }
        
        return maxSoFar; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
  
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
     
        int maxSum = kadane(array);
        
        System.out.println("The maximum sum of a contiguous subarray is: " + maxSum);
        
        scanner.close();
    }
}
