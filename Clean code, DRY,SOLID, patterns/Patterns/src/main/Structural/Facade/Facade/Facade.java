package org.example.Structural.Facade.Facade;


class Facade {

    Power power = new Power();
    DVDRom dvdrom = new DVDRom();
    SSD ssd = new SSD();

    void copy() {
        power.on();
        dvdrom.load();
        ssd.copyFromDVD(dvdrom);
        power.off();
    }
}
