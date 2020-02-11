package singleton;

public class DbSingletonThreadSafe {

    private static DbSingletonThreadSafe instance = null;

    private DbSingletonThreadSafe() {
    }

    public static DbSingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DbSingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new DbSingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
