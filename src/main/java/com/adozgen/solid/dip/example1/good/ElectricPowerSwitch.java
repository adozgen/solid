package com.adozgen.solid.dip.example1.good;

import lombok.Getter;

class ElectricPowerSwitch {
    public ISwitchable device;
    @Getter
    public boolean on;

    public ElectricPowerSwitch(ISwitchable device) {
        this.device = device;
        this.on = false;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            device.turnOff();
            this.on = false;
        } else {
            device.turnOn();
            this.on = true;
        }
    }
}