//RECEIVER
public class SmartHouseLight {
    private boolean isOn = false;
    private int intensity = 0;
    private String name;

    public SmartHouseLight(String name) {
        this.name = name;
    }

    public String getPowerStatus() {
        return isOn ? "ON" : "OFF";
    }

    public String getName() {
        return name;
    }

    public boolean on() {
        isOn = true;
        System.out.println(name + " agora está " + getPowerStatus());
        return isOn;
    }

    public boolean off() {
        isOn = false;
        System.out.println(name + " agora está " + getPowerStatus());
        return isOn;
    }

    public int increaseIntensity() {
        if (intensity >= 100) return intensity;
        intensity += 1;
        return intensity;
    }

    public int decreaseIntensity() {
        if (intensity <= 0) return intensity;
        intensity -= 1;
        return intensity;
    }
}
