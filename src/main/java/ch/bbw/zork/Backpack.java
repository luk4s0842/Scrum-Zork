package ch.bbw.zork;

import java.util.ArrayList;

public class Backpack { 
	private ArrayList<Item> items = new ArrayList<Item>();

	
	public void addItem(Item item) {
		items.add(item);
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public Item getItem(String name) {
		for (Item item : items) {
			if (item.getName().equals(name)) {
				items.remove(item);
				return item;
			}
		}
		return null;
	}
}
