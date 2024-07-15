package org.example.Singleton.Eager;

public class EagerSingleton {
    /*
       Заранее инициализируем объект - решает проблему конкурентного доступа
       Теряется ленивая инициализация (объект будет создан во время инициализации класса)
       Отсутствует возможность обработки исключений во время вызова конструктора
     */
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}



