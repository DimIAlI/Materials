package org.example.Singleton.Lazy;

public class DemandHolderSingleton {
    /*
       Решается проблема ленивой инициализации
       Проблема вылета исключений при создании объекта сохраняется
    */
    private DemandHolderSingleton() {
    }

    private static class SingletonHolder {
        private static final DemandHolderSingleton INSTANCE = new DemandHolderSingleton();
    }

    public static DemandHolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
