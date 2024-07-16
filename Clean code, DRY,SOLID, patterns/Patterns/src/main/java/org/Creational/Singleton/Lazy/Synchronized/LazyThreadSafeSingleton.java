package org.example.Creational.Singleton.Lazy.Synchronized;

public class LazyThreadSafeSingleton {
   /*
      Решает проблему с конкурентным доступом,
      но synchronized блок нужен только при первой инициализации,
      все последующие обращения также будут отрабатываться в synchronized блоке,
      что забирает время
   */
    private static LazyThreadSafeSingleton INSTANCE;

    private LazyThreadSafeSingleton() {
    }

    public static synchronized LazyThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyThreadSafeSingleton();
        }
        return INSTANCE;
    }
}


