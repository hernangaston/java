package Ejercicio4;

public class SmartDeviceMain {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(10.5,20.3, true,"no me lo se", true, 32);
        SmartWatch mySmartWatch = new SmartWatch(5,5,false,"no me lo se watch", true);

        System.out.println(mySmartPhone);
        System.out.println(mySmartWatch);

    }
}
