package iterator.menu.iterator;

import iterator.menu.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	private int position = 0;
	MenuItem[] items;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position == items.length || items[position] == null)
			return false;
		return true;
	}

	@Override
	public MenuItem next() {
		position += 1;
		return items[position - 1];
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("next()�� �� ���� ȣ������ ���� ���¿����� ������ �� �����ϴ�.");
		}

		if (items[position - 1] != null) {
			for (int i = position - 1; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}

}
