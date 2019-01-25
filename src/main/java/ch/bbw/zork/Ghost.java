package ch.bbw.zork;

public class Ghost {
	private Room room;
	private boolean isFriendly;
	
	public Ghost(boolean isFriendly, Room room) {
		this.isFriendly = isFriendly;
		this.room = room;
	}
	
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public boolean isFriendly() {
		return isFriendly;
	}
	public void setFriendly(boolean isFriendly) {
		this.isFriendly = isFriendly;
	}
	
	
}
