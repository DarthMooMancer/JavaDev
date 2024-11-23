public class Chicken {
	private double weight;
	private String breed;
	private int eggs;
	private boolean mean;

	public Chicken() {
		breed = "Easter Egger";
		eggs = 1;
		mean = false; // is not mean
		weight = 5.7; // pounds
	}

	public Chicken(String breed, int eggsPerDay, boolean isMean, double chickenWeight) {
		breed = breed;
		eggs = eggsPerDay;
		mean = isMean;
		weight = chickenWeight;
	}

	public String makeNoise() {
		return "Cluck Cluck Cluck!";
	}

	public void eatFood(double amount) {
		this.weight += amount;
		//return weight; 
	}

	// public void displayChicken() {
	// 	return "";
	// }
}
