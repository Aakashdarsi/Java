import java.lang.Thread;
class A extends Thread {
    @Override
    public void run(){
        System.out.println("threads executed");
    }
}
class threads {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        System.out.println("Main Thread Executed");
        
    }
}
