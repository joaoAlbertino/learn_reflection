package br.com.java_reflection.controller;

import java.lang.reflect.Field;

import br.com.java_reflection.model.Ticket;

public class TicketController {

	
	
	public static void main(String args []) {
		

		
		
		//I Want to use reflection  to discover those methods 
		
		
		Class genericClass = Ticket.class;
		
		for(Field field : genericClass.getDeclaredFields()) {
			
			
			System.out.println(field.getName());
		}
	}
}
