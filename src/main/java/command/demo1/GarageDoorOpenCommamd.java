package main.java.command.demo1;

public class GarageDoorOpenCommamd implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommamd(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
