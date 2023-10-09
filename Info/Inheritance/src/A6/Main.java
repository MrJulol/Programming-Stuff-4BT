package A6;

public class Main {
    public static void main( String[] args ) {
        Radio radio = new Radio();
        System.out.println(radio);
        radio.on();
        System.out.println(radio);
        IceMachine iceMachine = new IceMachine();
        iceMachine .on();
        iceMachine .on(); // test
        radio. off () ;
        System.out.println("Devices: " + ElectronicDevice.numberOfElectronicDevices); // 2
        System.out.println("SwitchedOn: " + ElectronicDevice.numberOfElectronicDevicesSwitchedOn); // 1
    }
}
