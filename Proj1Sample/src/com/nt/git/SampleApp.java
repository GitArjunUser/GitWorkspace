package com.nt.git;

public class SampleApp {

	public static void main(String[] args) {
         System.out.println("Hi devloper");
         ShowCountries sh=new ShowCountries();
         sh.showCountry();
        System.out.println("Msg::"+new WishGenerator().generateWishMsg("raja12345"));
	}

}
