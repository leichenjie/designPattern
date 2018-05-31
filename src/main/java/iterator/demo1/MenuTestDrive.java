package iterator.demo1;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Dinermenu dinermenu = new Dinermenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinermenu);
        waitress.printMenu();
    }
}
