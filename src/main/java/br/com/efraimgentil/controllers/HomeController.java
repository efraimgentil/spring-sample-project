package br.com.efraimgentil.controllers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.efraimgentil.models.repositories.UserRepository;

@Controller
public class HomeController {
	
	@PersistenceContext
	EntityManager em;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/hello")
	public String hello( ) {
		
		System.out.println( em );
		
		System.out.println(
		userRepository.findAll()
				);
		
		return "hello";
	}

}
