package org.example.Structural.Facade.WithoutFacade;

class Main {

    public static void main(String[] args) {
        Power power = new Power();
        power.on();

        DVDRom dvdrom = new DVDRom();
        dvdrom.load();

        SSD ssd = new SSD();
        ssd.copyFromDVD(dvdrom);
        power.off();
    }
}
