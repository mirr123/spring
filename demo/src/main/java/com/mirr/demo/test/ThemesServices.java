package com.mirr.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirr.demo.repository.ThemeRepository;

@Service
public class ThemesServices {
	
	@Autowired ThemeRepository repository;
	//private List<Theme> themes= new ArrayList<Theme>();
	
	public List<Theme> addTheme(Theme theme) {
		repository.save(theme);
		return repository.findAll();
	}
	
	public List<Theme> removeTheme(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}	
	
	public List<Theme> getValues() {
        return repository.findAll();

    }
	
	public List<Theme> updateTheme(int id, String new_name, String new_description){
		for (Theme theme : themes) {
			if (theme.getId() == id) {
				if (new_name != null)
					theme.setName(new_name);
				if (new_description != null)
					theme.setDescription(new_description);
			}
		}
		return null;
	}

	@Override 
	public String toString() {
		return "ThemesServices [themes=" + themes + "]";
	}

}
