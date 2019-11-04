package iterator.menu;

import iterator.menu.menu.CaffeMenu;
import iterator.menu.menu.DinerMenu;
import iterator.menu.menu.PancakeHouseMenu;

public class MenuMain {
	public static void main(String[] args) {

		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CaffeMenu caffeMenu = new CaffeMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, caffeMenu);
		waitress.printMenu();
	}
}
