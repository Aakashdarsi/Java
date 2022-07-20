import java.util.Scanner;


class ThrowAndTrows {
    
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        Demo t = new Demo();
        System.out.println(Demo.result(a,b));
        s.close();
    }
}
class Demo {
      static int result(int a,int b) throws ArithmeticException{
        return a/b;
    }
}