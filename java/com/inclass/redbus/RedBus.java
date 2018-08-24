package com.inclass.redbus;

public class RedBus implements Comparable<RedBus>{
	
	
	@Override
	public int compareTo(RedBus rb) {
		// TODO Auto-generated method stub

		int fareSort = this.fare.compareTo(rb.fare);

		if (fareSort == 0) {
			int arrivalSort = this.arrivalTime.compareTo(rb.arrivalTime);
			if (arrivalSort == 0) {
				return this.serviceName.compareTo(rb.serviceName);
			} else {
				return arrivalSort;
			}
		} else {
			return fareSort;
		}
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return serviceId+" "+serviceName+" "+departureTime+" "+arrivalTime+" "+fare+" \n";
	}
	
	
	public RedBus(Integer serviceId, String serviceName, String departureTime, String arrivalTime, String fare) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}


	private Integer serviceId;
	private String serviceName;
	private String departureTime;
	private String arrivalTime;
	private String fare;
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}


	
	
	

}
