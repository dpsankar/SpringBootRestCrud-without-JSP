package com.shankar.first.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shankar.first.dao.AlienRepo;
import com.shankar.first.module.Alien;

@RestController
public class TheController {

	@Autowired
	AlienRepo repo;
	
	@GetMapping("/aliens")
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
	
	@GetMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);
	}
	
	@PostMapping("/alien")
	public Alien postAlien(@RequestBody Alien a)
	{
		 repo.save(a);
		return a;
	}
	
	@DeleteMapping("/alien")
	public String deleteAlien(@RequestBody Alien a)
	{
		repo.delete(a);
		
		return "Deleted";
	}
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlienByID(@PathVariable("aid") int aid)
	{
		
		repo.deleteById(aid);
		
		return "Deleted";
	}
	

	@PutMapping("/alien")
	public Alien updateAlien(@RequestBody Alien a)
	{
		
		repo.save(a);
		return a;
	}
}
