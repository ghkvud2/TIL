package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

	List<MenuComponent> menuComponents;
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		menuComponents = new ArrayList<>();
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void print() {

		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
		}
	}

}
