import java.util.Scanner;

class throwandthrowsAbdul {
    static int result(int a,int b) throws Exception{
        if(a<0 || b<0){
            throw new Exception("Dimensions can't be negative");
        }
        return a*b;
    }
    public static void main(String[] args) {
    int a,b;
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    b = s.nextInt();
    s.close();
    try{
    System.out.println(result(a, b));

    }
    catch(Exception e){
        System.out.println(e);
    }
           
    }
}
