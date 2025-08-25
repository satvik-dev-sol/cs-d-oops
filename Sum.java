import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS TO BE ADDED");
        String str= sc.nextLine();
        int val =0;
        int sum =0;
        for(char s : str.toCharArray()){
            val= Integer.parseInt(String.valueOf(s));
            sum =sum +val;
        }
        System.out.printf("The sum is %d ", sum);
        
    }
}
