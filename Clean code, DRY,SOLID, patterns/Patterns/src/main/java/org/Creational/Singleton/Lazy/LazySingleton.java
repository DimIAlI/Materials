package org.example.Creational.Singleton.Lazy;

public class LazySingleton {
    /*
       Не подходит для многопоточной среды,
       т.к. несколько потоков могут одновременно инициализировать несколько объектов
     */
    private static LazySingleton INSTANCE;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}

