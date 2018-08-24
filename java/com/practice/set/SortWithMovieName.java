package com.practice.set;

import java.util.Comparator;

public class SortWithMovieName implements Comparator<CinemaBooking>{

	@Override
	public int compare(CinemaBooking cb1, CinemaBooking cb2) {
		int sortWithMovieName = cb1.getMovieTitle().compareTo(cb2.getMovieTitle());
		int sortWithPrice = cb1.getTicketPrice().compareTo(cb2.getTicketPrice());
		if(sortWithMovieName == 0 || sortWithPrice == 0){
			int thId = cb1.getTheaterId().compareTo(cb2.getTheaterId());
			if(thId == 0){
				return cb1.getTicketPrice().compareTo(cb2.getTicketPrice());
			}else{
				return thId;
			}
		}else{
			return sortWithMovieName;
		}
	}
}
