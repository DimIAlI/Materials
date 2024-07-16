package org.example.Creational.Singleton.Lazy.Synchronized.DoubleCheck;

public class FinalFieldSingleton {
   /*
      Объявление поля final также гарантирует отношение happens-before
      (если это сложный объект, то его поля тоже должны быть final)
      Эта реализация имеет ленивую инициализацию и безопасна в многопоточной среде
   */
    private static volatile FinalFieldSingleton INSTANCE;
    final int x = 1;

    private FinalFieldSingleton() {
    }
    public static FinalFieldSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (FinalFieldSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FinalFieldSingleton();
                }
            }
        }
        return INSTANCE;
    }
}

