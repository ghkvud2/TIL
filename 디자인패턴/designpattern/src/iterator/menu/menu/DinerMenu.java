package iterator.menu;

import java.util.Iterator;

public class DinerMenu implements Menu {

	private int numberOfItems = 0;
	static final int MAX_ITEMS = 6;
	MenuItem[] items;

	public DinerMenu() {
		items = new MenuItem[MAX_ITEMS];
		init();
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS)
			System.out.println("¡Àº€«’¥œ¥Ÿ. ∏ﬁ¥∫∞° ≤À √°Ω¿¥œ¥Ÿ.");
		else {
			items[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}

	private void init() {
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
		addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(items);
	}
}
