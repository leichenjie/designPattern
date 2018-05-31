package main.java.command.demo1;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand cmd = new LightOnCommand(light);
        GarageDoorOpenCommamd garageDoorOpenCommamd = new GarageDoorOpenCommamd(garageDoor);

        control.setCommand(cmd);
        control.buttonWasPressed();

        control.setCommand(garageDoorOpenCommamd);
        control.buttonWasPressed();
    }
}
