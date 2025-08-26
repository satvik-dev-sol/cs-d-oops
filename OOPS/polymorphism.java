package OOPS;
//static binding or early binding
public class polymorphism {


    polymorphism(){

    }
    polymorphism(int a){

    }
    polymorphism (int a , int b){

    }

    public static void main(String[] args) {
        System.out.println("A");
        polymorphism p = new polymorphism();
        p.m1();

    }
    public static void main() {
    System.out.println("A");
    polymorphism p = new polymorphism();
    p.m1();
    }

    void m1(){
        System.out.println("B");
    }   
    int m1(int a , String b){
        return a;
    }
    void m1( String b,int a ){
        
    }


}
