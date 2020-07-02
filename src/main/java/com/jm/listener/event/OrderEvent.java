package com.jm.listener.event;

import org.springframework.context.ApplicationEvent;

public class OrderEvent extends ApplicationEvent {


	public OrderEvent(Object source) {
		super(source);
		System.out.println("Event work.");
		// TODO Auto-generated constructor stub
	}

}
