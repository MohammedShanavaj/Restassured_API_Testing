package resources;

import java.util.ArrayList;
import java.util.List;

import pojo_class.AddPlace;
import pojo_class.Location;

public class TestDataBuild {
	
	
	public AddPlace addPlacePayload(String name,String language,String address)
	
	{
		AddPlace ap = new AddPlace();
		
		ap.setAccuracy(100);
		ap.setAddress(address);
		
		ap.setName(name);
		ap.setPhone_number("+91 909 990 8888");
		
		List<String> mylist= new ArrayList<String>();
		
		mylist.add("Food Parasice");
		mylist.add("Resturent");
		ap.setTypes(mylist);
		
		Location l = new Location();
		
		l.setlat(-25.342233);
		
		l.setlng(-20.384234);
		
		ap.setLocation(l);
		
		ap.setLanguage(language);
		
		ap.setWebsite("htpps://resturent_booking.com");
		return ap;
		
		
	
		
	}
	
	
	
	
	

}
