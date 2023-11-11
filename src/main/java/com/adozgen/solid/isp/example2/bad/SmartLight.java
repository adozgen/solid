package com.adozgen.solid.isp.example2.bad;

public class SmartLight implements ISmartDevice {

    @Override
    public void turnOn() {
        // Işığı aç
    }

    @Override
    public void turnOff() {
        // Işığı kapat
    }

    @Override
    public void setTemperature(int temperature) {
        // Bu işlevsellik ışık için geçerli değil!
        throw new UnsupportedOperationException();
    }

    @Override
    public void activateEmergencyMode() {
        // Acil durum modu genellikle ışıklar için geçerli değildir.
        throw new UnsupportedOperationException();
    }
}
