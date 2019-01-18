package ch.bbw.zork;

import java.util.ArrayList;

public class Backpack { 
	private ArrayList<Item> items;

	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
