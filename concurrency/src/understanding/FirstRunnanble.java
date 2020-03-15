package understanding;

public class FirstRunnanble {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.setName("My thread");
        thread.start(); // this rns in a thread
//        thread.run(); // this runs in main, which is executor
    }

}
