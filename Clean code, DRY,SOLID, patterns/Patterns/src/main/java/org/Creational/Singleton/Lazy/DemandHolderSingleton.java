package org.example.Creational.Singleton.Lazy;

public final class DemandHolderSingleton {
    /*
       Решается проблема ленивой инициализации
       Проблема вылета исключений при создании объекта сохраняется
    */
    private DemandHolderSingleton() {
    }

    public static DemandHolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final DemandHolderSingleton INSTANCE = new DemandHolderSingleton();
    }

    public static DemandHolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
