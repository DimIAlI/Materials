package org.example.Singleton.Lazy.Synchronized.DoubleCheck;

public class FinalFieldSingleton {
   /*
      Объявление поля final также гарантирует отношение happens-before
      (если это сложный объект, то его поля тоже должны быть final)
   */
    private static FinalFieldSingleton INSTANCE;
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

