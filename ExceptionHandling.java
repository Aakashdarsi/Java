import java.util.Scanner;


class ExceptionHandling {
public static void main(String[] args) {
    int a,b;
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    b = s.nextInt();
    try{
        int result = a/b;
        System.out.println(result);
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("Program finishedd!!!!!!!!");
    }
    s.close();
}    
}
