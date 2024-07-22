package org.example.Structural.Facade.Facade;

class DVDRom {
    private boolean data = false;

    boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}
