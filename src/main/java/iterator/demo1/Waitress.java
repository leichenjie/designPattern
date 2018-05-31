package iterator.demo1;

import java.util.Iterator;

public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    Dinermenu dinermenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, Dinermenu dinermenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinermenu = dinermenu;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinermenuIterator = dinermenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\nLINCH");
        printMenu(dinermenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ",");
            System.out.print(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDescription());
        }
    }
}
