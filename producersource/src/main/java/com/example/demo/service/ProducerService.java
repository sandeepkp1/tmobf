package com.example.demo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.bean.Employee;

@Component
public class ProducerService {

	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${rabbitmq.exchange}")
	private String exchange;
	
	@Value("${rabbitmq.routingkey}")
	private String routingKey;
	
	public void add(Employee emp) {
		amqpTemplate.convertAndSend(exchange, routingKey, emp);
		System.out.println("Send msg = " + emp);
	}
	
}
