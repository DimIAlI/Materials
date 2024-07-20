package org.example.Creational.Singleton.Lazy.Synchronized.DoubleCheck;

public final class DoubleCheckSingleton {
    /*
       Решена проблема блока synchronized(синхронизация теперь происходит 1 раз),
       но не будет работать из-за оптимизации out-of-order execution.
       Также memory model не гарантирует, что другой поток увидит полностью инициализированный объект
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
    /*
      В чем проблема: 2 потока заходят в метод getInstance(), поток A заходит в первый if
      записывает значение INSTANCE себе в стек. Поток B в это время уже создал INSTANCE.
      Далее поток A заходит в блок синхронизации, заходит в if,
      дальше он должен сходить в head и снова проверить создан ли INSTANCE,
      он может этого не сделать из-за оптимизации out-of-order execution
      и инициализировать объект повторно
    */
