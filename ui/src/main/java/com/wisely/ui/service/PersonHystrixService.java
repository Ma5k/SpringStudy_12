package com.wisely.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wisely.ui.domain.Person;

@Service
public class PersonHystrixService {
	@Autowired
	PersonService personService;
	
	@HystrixCommand(fallbackMethod = "fallbackSave")	//1、使用@HystrixCommand的fallbackMethod参数指定，当本方法调用失败时，调用后备方法fallbackSave。
	public List<Person> save(String name) {
		return personService.save(name);
	}
	
	public List<Person> fallbackSave() {
		List<Person> list = new ArrayList<>();
		Person p = new Person("Person Service 故障");
		list.add(p);
		return list;
	}
}
