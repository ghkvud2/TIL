package iterator.menu;

public class MenuMain {
	public static void main(String[] args) {

		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CaffeMenu caffeMenu = new CaffeMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, caffeMenu);
		waitress.printMenu();
	}
}
