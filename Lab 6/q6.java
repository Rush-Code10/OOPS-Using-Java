public class q6 {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker();

        speaker.connectToWiFi("HomeNetwork");
        speaker.pairDevice("Phone");
        speaker.playMusic("Song A");
        speaker.unpairDevice();
        speaker.disconnectWiFi();
    }
}

interface WiFiEnabled {
    void connectToWiFi(String network);
    void disconnectWiFi();
}

interface BluetoothEnabled {
    void pairDevice(String deviceName);
    void unpairDevice();
}

class SmartSpeaker implements WiFiEnabled, BluetoothEnabled {
    public void connectToWiFi(String network) {
        System.out.println("Connected to WiFi network: " + network);
    }

    public void disconnectWiFi() {
        System.out.println("Disconnected from WiFi");
    }

    public void pairDevice(String deviceName) {
        System.out.println("Paired with Bluetooth device: " + deviceName);
    }

    public void unpairDevice() {
        System.out.println("Unpaired from Bluetooth device");
    }

    public void playMusic(String songName) {
        System.out.println("Playing music: " + songName);
    }
}

