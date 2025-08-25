import java.util.Scanner;

public class Greatest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THREE NUMBER");
        int[] arr = new int[3];
        for (int i =0;i<3;i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0] > arr[1] && arr[0] >arr[2]){
            System.out.printf("%d is the greatest number", arr[0]);
        }
        else if (arr[1] > arr[0] && arr[1] >arr[2]){
           System.out.printf("%d is the greatest number", arr[1]);
        }
        else{
            System.out.printf("%d is the greatest number", arr[2]);
        }

        sc.close();
    }
}
