package com.example.University.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.University.Repository.UniversityRepository;
import com.example.University.entity.University;



@RestController
public class UniversityController {
	@Autowired
	private UniversityRepository unirepo;
	
	@GetMapping("/university")
	public List<University> getUniversities()
	{
		return unirepo.findAll();
	}
	
	@GetMapping("/university /{id}")
	public University getUniversitie(@PathVariable("id") int id) throws Exception
	{
		Optional<University> user=unirepo.findById(id);
		if(!user.isPresent())
		{
			throw new Exception("user not found");
			
		}
		return user.get();
	}

	@PutMapping("/univerity")
	public void getSaveUser(@RequestBody University university) 
	{
		unirepo.save(university);	
	}
	
	
}
