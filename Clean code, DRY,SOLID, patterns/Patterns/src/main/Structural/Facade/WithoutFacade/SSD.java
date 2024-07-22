package org.example.Structural.Facade.WithoutFacade;

class SSD {

    void copyFromDVD(DVDRom dvd) {
        System.out.println(dvd.hasData() ?
                "Копируем данные с диска" : "Вставьте диск с данными");
    }
}
