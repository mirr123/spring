package com.mirr.demo.test;

import java.util.ArrayList;
import java.util.List;

public class ThemesServices {

	private List<Theme> themes= new ArrayList<Theme>();
	
	
	public void addTheme(Theme theme) {
		themes.add(theme);
	}
	
	public void removeTheme(Theme theme) {
		themes.remove(theme);
	}
	
	public boolean SearchTheme(Theme theme) {
		
	}
}
