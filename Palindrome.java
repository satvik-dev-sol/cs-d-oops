import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);  
    }
        if(str.equals(rev)){
            System.out.println("This is Palindrome");
        }
        else{
            System.out.println("This is not Palindrome");
        }
        sc.close();
    }
    
}
