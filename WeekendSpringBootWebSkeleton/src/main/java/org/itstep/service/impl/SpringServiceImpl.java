package org.itstep.service.impl;

import org.itstep.service.SpringService;
import org.springframework.stereotype.Service;

@Service
public class SpringServiceImpl implements SpringService{
	
	public String getMethod1() {
		  return "It was GET1 method!";
		 }
		 
		 public String getMethod2() {
		  return "It was GET2 method!";
		 }

		 public String putMethod() {
		  return "It was PUT method!";
		 }

		 public String postMethod() {
		  return "It was POST method!";
		 }

		 public String deleteMethod() {
		  return "It was DELETE method!";
		 }
}
