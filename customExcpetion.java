import java.util.Scanner;

class NegativeException extends Exception{
    public  String toString(){
        return "Negative Dimensions can't be handled";
    }
};
class customExcpetion {
    static int result(int a,int b) throws NegativeException{
        if(a<0|| b<0){
            throw new NegativeException();
        }
        return a*b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        s.close();
        try{
            System.out.println(result(a,b));
        }
        catch(NegativeException e){
            System.out.println(e);
        }
    }
    
}
