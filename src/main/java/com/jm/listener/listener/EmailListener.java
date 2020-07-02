package com.jm.listener.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.jm.listener.event.OrderEvent;

@Component 
public class EmailListener implements ApplicationListener<OrderEvent> {

	@Override
	public void onApplicationEvent(OrderEvent event) {
		// 发送微信
		System.out.println("2. send email success.");
		
	}

}
