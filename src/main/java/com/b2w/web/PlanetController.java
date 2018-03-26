package com.b2w.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.b2w.domain.Planet;

@RestController
public class PlanetController {
	
	
	@GetMapping("/planets")
	public ResponseEntity<List<Planet>> list() {
		Planet a = new Planet();
		a.setId(3L);
		a.setName("name");
		a.setTerrain("terrain");
		a.setClimate("climate");
		return new ResponseEntity(Arrays.asList(a), HttpStatus.OK);
	}
	
	@GetMapping("/planets/{id}")
	public ResponseEntity<Planet> get(@PathVariable("id") Long id) {
		Planet a = new Planet();
		a.setId(1L);
		a.setName("name1");
		a.setTerrain("terrain1");
		a.setClimate("climate1");
		
		return new ResponseEntity<Planet>(a, HttpStatus.OK);
	}
	
	@GetMapping("/planets/{name}")
	public ResponseEntity<Planet> getByName(@RequestParam("name") String name) {
		Planet a = new Planet();
		a.setId(2L);
		a.setName("name3");
		a.setTerrain("terrain3");
		a.setClimate("climate3");
		
		return new ResponseEntity<Planet>(a, HttpStatus.OK);
	}
	
	
	@PostMapping("/planets")
	public ResponseEntity<String> create(@RequestBody Planet planet) {
		return new ResponseEntity<String>("Planet Created", HttpStatus.OK);
	}


}
