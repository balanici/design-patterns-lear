package singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
//        DbSingleton anotherInstance = new DbSingleton(); //because of private constructor
        DbSingleton instance1 = DbSingleton.getInstance();
        System.out.println(instance1);

    }
}
