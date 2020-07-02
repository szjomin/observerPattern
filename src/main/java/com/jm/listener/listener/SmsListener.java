package com.jm.listener.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.jm.listener.event.OrderEvent;

@Component
public class SmsListener implements ApplicationListener<OrderEvent> {
	
	@Override
	public void onApplicationEvent(OrderEvent event) {
		// 2 --- 发送短信 --- TODO 此处省略短信接口调用的N行代码
		System.out.println("1、 send textMessage success.");
	}
}
