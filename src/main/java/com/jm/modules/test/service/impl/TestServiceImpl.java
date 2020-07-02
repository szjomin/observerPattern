package com.jm.modules.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.jm.listener.event.OrderEvent;
import com.jm.listener.publisher.MyPublisher;
import com.jm.modules.test.service.TestService;


@Service
public class TestServiceImpl implements TestService {

	@Autowired
    private MyPublisher myPublisher;
	
	@Override
	public boolean test() {

		System.out.println("============send message test=============");
		OrderEvent orderEvent = new OrderEvent("参数");
		myPublisher.publisherEvent(orderEvent);
		return true;
	}

}
