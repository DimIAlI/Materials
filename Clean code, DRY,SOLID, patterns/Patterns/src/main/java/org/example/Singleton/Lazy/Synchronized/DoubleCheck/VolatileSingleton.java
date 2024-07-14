package org.example.Singleton.Lazy.Synchronized.DoubleCheck;

public class VolatileSingleton {
    /*
       volatile гарантирует, что все потоки увидят изменения в INSTANCE
       есть проблема с переменной x, так как есть возможность получить INSTANCE.x
       с инициализацией по умолчанию
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


