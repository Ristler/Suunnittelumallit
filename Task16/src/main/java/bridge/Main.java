package bridge;

import bridge.devices.Device;
import bridge.devices.Radio;
import bridge.devices.Tv;
import bridge.remotes.AdvancedRemote;
import bridge.remotes.BasicRemote;
import bridge.remotes.SmartRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.power();
        device.printStatus();

        smartRemote.voiceControl("power");
        device.printStatus();
        smartRemote.voiceControl("mute");
        device.printStatus();

    }
}