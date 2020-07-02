package com.jm.listener.publisher;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.jm.listener.event.OrderEvent;

@Component
public class MyPublisher implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void publisherEvent(OrderEvent orderEvent) {
		System.out.println("---开始发布 orderEvent 事件---");
		applicationContext.publishEvent(orderEvent);
	}

}
