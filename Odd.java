public class Odd {
    public static void main(String[] args) {
        long val = 0;
        int ind =0;
        for(int i =0;i<100;i++){
            if(i%2!=0){
                val =val+i;
                ind++;
            }
        }
        System.out.printf("%d is total no of odd number and their sum is %ld", ind , val);
    }
}
