package org.example.Singleton.Lazy.Synchronized.DoubleCheck;

public class VolatileSingleton {
    /*
       volatile гарантирует, что все потоки увидят изменения в INSTANCE
     */
    private static volatile VolatileSingleton INSTANCE;
    int x = 1;

    private VolatileSingleton() {
    }

    public static VolatileSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (VolatileSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new VolatileSingleton();
                }
            }
        }
        return INSTANCE;
    }
}


