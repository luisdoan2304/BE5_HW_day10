package hw_day9_OOP;

public class Main {

	public static void main(String[] args) {
		User user1 = new SilverUser();
        user1.displayUserInfo(); 

        User user2 = new GoldUser();
        user2.displayUserInfo(); 

        User user3 = new DiamondUser();
        user3.displayUserInfo(); 

        User user4 = new PlatinumUser();
        user4.displayUserInfo(); 
    }

	}


