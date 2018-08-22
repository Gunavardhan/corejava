package com.main;

import java.net.URL;
import java.net.URLConnection;

public class CheckInternetConnection {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://myservant.com/about.php");
			URLConnection openConnection = url.openConnection();
			openConnection.connect();
			System.out.println("Intenet Connected");
		} catch (Exception e) {
			System.out.println("Sorry, No Internet Connection");
		}
	}
}
