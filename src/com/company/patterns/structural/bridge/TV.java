package com.company.patterns.structural.bridge;

public class TV implements Device {

    private boolean enable = false;
    private int channel = 1;
    private int volume = 5;

    @Override
    public boolean isEnabled() {
        return this.enable;
    }

    @Override
    public void enable() {
        this.enable = true;
    }

    @Override
    public void disable() {
        this.enable = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "enable=" + enable +
                ", channel=" + channel +
                ", volume=" + volume +
                '}';
    }
}
