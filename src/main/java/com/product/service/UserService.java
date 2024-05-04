package com.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.product.models.User;

@Service
public class UserService {
	
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		System.out.println("in userservice constructor..");
		store.add(new User(UUID.randomUUID().toString(),"Rajat Singh","rajat@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ashish Sahu","ashish@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Virat Singh","virat@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Rishabh Singh","rishabh@gmail.com"));		
	}
	
	public List<User> getUser(){
		System.out.println("in getUser method..");
		return this.store;
	}
}
