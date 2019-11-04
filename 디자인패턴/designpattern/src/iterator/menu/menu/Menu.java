package iterator.menu.menu;

import iterator.menu.MenuItem;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
