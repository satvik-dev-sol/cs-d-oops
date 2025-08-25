import java.util.Arrays;
import java.util.Scanner;

public class Sort {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY");
    int size = sc.nextInt();    
    int[] arr = new int[size];
    System.out.println("ENTER THE ELEMENTS OF ARRAY");
    for(int i =0;i<size;i++){
        arr[i] = sc.nextInt();  
}
    Arrays.sort(arr);
    System.out.println("Largest element is: " + arr[size-1]);
    System.out.println("Smallest element is: " + arr[0]);
}
}
