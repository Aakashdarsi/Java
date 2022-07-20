import java.lang.Thread;
class A implements Runnable{
    @Override 
    public void run(){
        System.out.println("Thread runnable");
    }
}
class threads_using_runnable {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
        System.out.println("Main!!!!!!");
    }
}
