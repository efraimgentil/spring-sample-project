package br.com.efraimgentil.controllers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@PersistenceContext
	EntityManager em;
	
	@RequestMapping("/hello")
	public String hello( ) {
		
		System.out.println( em );
		
		return "hello";
	}

}
