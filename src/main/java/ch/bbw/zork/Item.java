package ch.bbw.zork;

public class Item {
	
	private String name;
	private String description;
	private double weightKg;
	private double maxCarryWeight;

	public double getMaxCarryWeight() {
		return maxCarryWeight;
	}
	public void setMaxCarryWeight(double maxCarryWeight) {
		this.maxCarryWeight = maxCarryWeight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(double weightKg) {
		this.weightKg = weightKg;
	}
	
}
