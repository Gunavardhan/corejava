package com.inclass.redbus;

import java.util.Comparator;

public class RedBusServiceNameSort implements Comparator<RedBus>{

	@Override
	public int compare(RedBus r1, RedBus r2) {
		int serviceSort = -r1.getServiceName().compareTo(r2.getServiceName());
		if(serviceSort==0){
			return -r1.getServiceId().compareTo(r2.getServiceId());
		}else{
			return serviceSort;
		}
	}
	

}
