import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("ENTER THE ARMSTRONG NUMBER: %d", num  );
        String temp = String.valueOf(num);
        long val =0;
        long cube =0;
        long len =temp.length();
        for (char s  : temp.toCharArray()){
            cube = (long)Math.pow(Integer.parseInt(String.valueOf(s)), len);

            val = val + cube;
        }
        if(val==num){
            System.out.println("This is Armstrong Number");
        }
        else{
            System.out.println("This is not an Armstrong Number");
        }
        sc.close();


    }
}
