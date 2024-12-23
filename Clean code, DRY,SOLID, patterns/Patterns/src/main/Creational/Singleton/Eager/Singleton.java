package org.example.Creational.Singleton.Eager;

enum Singleton {
    /*
       Инициализируется заранее (не поддерживает ленивую инициализацию)
       Безопасен в конкурентной среде - инициализируется во время загрузки и immutable,
       Поля ENUM final
    */
    INSTANCE
}

