package singleton;

public class DbSingletonDemoLazy {

    public static void main(String[] args) {
        DbSingletonLazy instance = DbSingletonLazy.getInstance();
        System.out.println(instance);
//        DbSingleton anotherInstance = new DbSingleton(); //because of private constructor
        DbSingletonLazy instance1 = DbSingletonLazy.getInstance();
        System.out.println(instance1);

    }
}
