package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.bean.Employee;

@Service
public class ConsumerService {
	
	@Autowired
	EmployeeRepo employeeRepo;

	@RabbitListener(queues = "${rabbitmq.queuename}")
	public void queue2(Employee emp) {
		System.out.println(emp);
		employeeRepo.save(emp);

	}

}
