package com.mirr.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ThemesServices {

	private List<Theme> themes= new ArrayList<Theme>();
	
	public List<Theme> addTheme(Theme theme) {
		themes.add(theme);
		return themes;
	}
	
	public List<Theme> removeTheme(int id) {
		themes.removeIf(theme -> theme.getId() == id );
		return themes;
	}	
	
	public List<Theme> getValues() {
        System.out.println("Getting all themes:");
        for (Theme theme : themes) {
            System.out.println(theme);
        }
        return themes;
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
		return themes;
	}

	@Override 
	public String toString() {
		return "ThemesServices [themes=" + themes + "]";
	}

}
