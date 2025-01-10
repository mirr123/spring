package com.mirr.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mirr.demo.test.Theme;
import com.mirr.demo.test.ThemesServices;

@RestController
@RequestMapping("themes")
public class ThemeController {
		
	@Autowired
	ThemesServices themeService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Theme Controller";
	}

	@GetMapping("/allthemes")
	public List<Theme> getThemesAll() {
		return themeService.getValues();
	}
	
	@PostMapping("/add")
	public List<Theme> addTheme(@RequestBody Theme theme){
		return themeService.addTheme(theme);
	}
	
	
	@DeleteMapping("/delete")
	public List<Theme> deleteTheme(@RequestParam Integer id){
		return themeService.removeTheme(id);
	}
	
	@PutMapping("/update")
	public List<Theme> updateTheme(@RequestParam int id, String new_name, String new_description){
		return themeService.updateTheme(id,new_name, new_description);
	} 
}
