package com.practice.set;

public class CinemaBooking implements Comparable<CinemaBooking>{

	private String theaterId;
	private String theaterName;
	private String location;
	private String movieTitle;
	private String ticketPrice;
	private String showTime;

	public CinemaBooking(String theaterId, String theaterName, String location, String movieTitle, String ticketPrice,
			String showTime) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.location = location;
		this.movieTitle = movieTitle;
		this.ticketPrice = ticketPrice;
		this.showTime = showTime;
	}

	public String getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	@Override
	public String toString() {
		String result = "Theater ID " + theaterId +"\n" + "Theater Name : " + theaterName + "\n"+  "Movie Name : " + movieTitle
				+ "\n" + "Ticket price: " + ticketPrice +"\n"  + "Show Time : " + showTime;
		return result;
	}

	@Override
	public int compareTo(CinemaBooking co) {
		int sortPrice = this.ticketPrice.compareTo(co.getTicketPrice());
		if(sortPrice == 0){
			int showTimeSort = this.showTime.compareTo(co.getShowTime());
			if(showTimeSort == 0){
				return this.theaterName.compareTo(co.theaterName);
			}else{
				return showTimeSort;
			}
		}
		return sortPrice;
	}

}
