package main.java.command.demo1;

public class SimpleRemoteControl {
    Command solt;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command cmd) {
        this.solt = cmd;
    }

    public void buttonWasPressed() {
        solt.execute();
    }
}
