package hw_day9_OOP;

public abstract class User {
	private String level;
	private double discountRate;

	public User(String level, double discountRate) {
		this.level = level;
		this.discountRate = discountRate;
	}

	public void displayUserInfo() {
		System.out.println("Level: " + level);
		System.out.println("Discount Rate: " + discountRate + "%");
	}
}
