package A6;

public class ElectronicDevice{

    static int numberOfElectronicDevices;
    static int numberOfElectronicDevicesSwitchedOn;

    public boolean isOn() {
        return isOn;
    }

    private boolean isOn;

    public void setOn(boolean on) {
        isOn = on;
    }

    public ElectronicDevice() {
        this.off();
        numberOfElectronicDevices++;
    }

    public void on(){
        this.setOn(true);
        numberOfElectronicDevicesSwitchedOn++;
    }
    public void off(){
        this.setOn(false);
        if(numberOfElectronicDevicesSwitchedOn > 0){
            numberOfElectronicDevicesSwitchedOn--;
        }
    }

    @Override
    public String toString(){
        return "Device is " + (this.isOn() ? "on" : "off");
    }

}
