package com.inclass.redbus;

import java.util.Set;
import java.util.TreeSet;

public class SortingOfRedBus {

	public static void main(String[] args) {
		
		RedBus bus1=new RedBus(1003, "kesineni", "8pm", "6am", "950");
		RedBus bus2=new RedBus(1051, "jabbar", "9pm", "6am", "850");
		RedBus bus3=new RedBus(963, "jabbar", "10pm", "7am", "950");
		RedBus bus4=new RedBus(1765, "orange", "8pm", "6am", "850");
		
		Set<RedBus> set=new TreeSet<>(new RedBusServiceNameSort());
		set.add(bus1);
		set.add(bus2);
		set.add(bus3);
		set.add(bus4);
		
		
		System.out.println(set);
		
		/*
		for (RedBus redBus : set) {
			System.out.print(redBus.getServiceId()+" "+redBus.getServiceName());
		}*/
		
	}
}

