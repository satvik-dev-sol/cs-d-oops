package OOPS;


class A1 {
    void m1(){
         System.out.println("class A1 method m1");
     }
    }

     class B1 extends A1 {
        // @Override
        void b1(){
            System.out.println("class b2 from method b2");
        }
     }
public class Dpoly {
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        A1 b1 = new B1();
        b1.m1();
    }
    
}
