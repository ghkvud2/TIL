package iterator.menu;

import iterator.menu.menu.Menu;

import java.util.Iterator;

public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu caffeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu caffeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.caffeMenu = caffeMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> caffeIterator = caffeMenu.createIterator();

		System.out.println("[��ħ�Ļ� �޴�]");
		printMenu(pancakeIterator);
		System.out.println("\n[����Ļ� �޴�]");
		printMenu(dinerIterator);
		System.out.println("\n[ī�� �޴�]");
		printMenu(caffeIterator);
	}

	private void printMenu(Iterator<MenuItem> iter) {
		while (iter.hasNext()) {
			MenuItem menuItem = iter.next();
			System.out.println(menuItem.name + ", " + menuItem.description + ", " + menuItem.price);
		}
	}

}
