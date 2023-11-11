package com.adozgen.solid.isp.example2.good;

public class SmartThermostat implements ISwitchable, ITemperatureAdjustable {

    @Override
    public void turnOn() {
        // Termostatı aç
    }

    @Override
    public void turnOff() {
        // Termostatı kapat
    }

    @Override
    public void setTemperature(int temperature) {
        // Sıcaklığı ayarla
    }
}
