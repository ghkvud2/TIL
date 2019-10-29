package iterator.menu;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CaffeMenu implements Menu {


	Map<String, MenuItem> items;

	public CaffeMenu() {
		this.items = new Hashtable<>();
		init();
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return items.values().iterator();
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		items.put(name, new MenuItem(name, description, vegetarian, price));
	}

	private void init() {
		addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true,
				3.99);
		addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
		addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
	}

}
