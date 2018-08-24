package com.practice.set;

import java.util.TreeSet;

public class CinemaBookingTest {
	public static void main(String[] args) {
		CinemaBooking cinemaBooking1 = new CinemaBooking("LX12", "Laxmikala", "Moosapet", "Naa peru Shiva", "100",
				"11:00AM");
		CinemaBooking cinemaBooking2 = new CinemaBooking("B15", "Big Cinemas", "Ameerpet", "Bharath Ane Nenu", "150",
				"02:00AM");
		CinemaBooking cinemaBooking3 = new CinemaBooking("G15", "Gokul", "ESI", "Rangasthalam", "100", "11:00AM");
		CinemaBooking cinemaBooking4 = new CinemaBooking("SRT45", "Sri Ramulu", "Moosapet", "Naa Peru Surya", "100",
				"06:00AM");
		CinemaBooking cinemaBooking5 = new CinemaBooking("LX12", "Laxmikala", "Moosapet", "Rangasthalam", "100",
				"11:00AM");
		CinemaBooking cinemaBooking6 = new CinemaBooking("B15", "Big Cinemas", "Ameerpet", "Bharath Ane Nenu", "100",
				"02:00AM");

		TreeSet<CinemaBooking> ts = new TreeSet<>(new SortWithMovieName());
		ts.add(cinemaBooking1);
		ts.add(cinemaBooking2);
		ts.add(cinemaBooking3);
		ts.add(cinemaBooking4);
		ts.add(cinemaBooking5);
		ts.add(cinemaBooking6);

		System.out.println(ts.size());
		for (CinemaBooking cinemaBooking : ts) {
			System.out.println(cinemaBooking);
			System.out.println("======================");
		}
	}

}
