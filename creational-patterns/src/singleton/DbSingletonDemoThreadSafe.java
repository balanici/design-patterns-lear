package singleton;

public class DbSingletonDemoThreadSafe {

    public static void main(String[] args) {
        DbSingletonThreadSafe instance = DbSingletonThreadSafe.getInstance();
        System.out.println(instance);
//        DbSingleton anotherInstance = new DbSingleton(); //because of private constructor
        DbSingletonThreadSafe instance1 = DbSingletonThreadSafe.getInstance();
        System.out.println(instance1);

    }
}
