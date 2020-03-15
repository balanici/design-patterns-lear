package understanding;

public class RunningA {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();

        Runnable r1 = () -> a.a();
        Runnable r2 = () -> a.b();

        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();
        //her a() and b() are blocked and can't continue to c();
        //t1 is blocked and cant enter b(0 method
        //t2 is blocked and cant enter c(0 method

    }
}
