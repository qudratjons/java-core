package com.company.patterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Device device = new TV();
        System.out.println(device);

        Remote remote = new Remote(device);
        remote.togglePower();
        remote.channelDown();
        System.out.println(device);


        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.mute();
        System.out.println(device);
    }
}
