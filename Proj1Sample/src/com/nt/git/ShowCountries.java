package com.nt.git;

import java.util.Locale;

public class ShowCountries {
      
	public void showCountry() {
		Locale locale[]=Locale.getAvailableLocales();
		for (Locale l:locale) {
			System.out.println(l);
		}
	}
}
