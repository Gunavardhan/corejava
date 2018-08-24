package com.practice.set;

import java.util.HashSet;

public class UserTest {
	public static void main(String[] args) {
			User user1 = new User(10, "Guna", "9949026410");
			User user2 = new User(10, "Guna", "9949026410");
			User user3 = new User(10, "Vamshi", "9449026410");
			User user4 = new User(11, "Vamshi", "9449026410");
			HashSet<User> hs = new HashSet<>();
			hs.add(user1);
			hs.add(user2);
			hs.add(user3);
			hs.add(user4);
			System.out.println("User List SIZE :" + hs.size());
			System.out.println("User ID  " + "User Name " + " Phone");
			for (User user : hs) {
				System.out.println(user.getuId() + "      - " +user.getUserName() + "    - " +user.getPhNo());
			}
			
	}
}
