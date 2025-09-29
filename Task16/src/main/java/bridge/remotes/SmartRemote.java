package bridge.remotes;

import bridge.devices.Device;

public class SmartRemote extends AdvancedRemote {

    public SmartRemote(Device device) {
        super(device);
    }
    public void voiceControl(String voice) {
        switch(voice.toLowerCase()) {
            case "mute":
                System.out.println("Voice control activated: Muting..");
                this.mute();
                break;
            case "volume down":
                System.out.println("Voice control activated: Volume down..");
                this.volumeDown();
                break;
            case "volume up":
                System.out.println("Voice control activated: Volume up..");
                this.volumeUp();
                break;
            case "channel up":
                System.out.println("Voice control activated: Channel up..");
                this.channelUp();
                break;
            case "channel down":
                System.out.println("Voice control activated: Channel down..");
                this.channelDown();
                break;
            case "power":
                System.out.println("Voice control activated: Power..");
                this.power();
                break;

            default:
                System.out.println("Invalid voice command.");
        }
    }
}
