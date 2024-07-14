package org.example.Singleton.Lazy.Synchronized.DoubleCheck;

public class DoubleCheckSingleton {
    /*
       Решена проблема блока synchronized(синхронизация теперь происходит 1 раз),
       но memory model не гарантирует, что другой поток увидит полностью инициализированный объект
       (Instance.x может быть равен 0 при обращении к нему другого потока),
       так как нет happens-before.
    */
    private static DoubleCheckSingleton INSTANCE;
    int x = 1;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}


