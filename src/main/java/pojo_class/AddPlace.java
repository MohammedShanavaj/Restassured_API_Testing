package pojo_class;

import java.util.List;

public class AddPlace {
	
	    
	    private Location location;
	    private int accuracy;
	    private String name;
	    private String phone_number;
	    private String address;
	    private List<String> types;
	    private String website;
	    private String language;

	    // Getter and  Setter for location
	    public Location getLocation() {
	        return location;
	    }

	    public void setLocation(Location location) {
	        this.location = location;
	    }

	    // Getter and Setter for accuracy
	    public int getAccuracy() {
	        return accuracy;
	    }

	    public void setAccuracy(int accuracy) {
	        this.accuracy = accuracy;
	    }

	    // Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for phone_number
	    public String getPhone_number() {
	        return phone_number;
	    }

	    public void setPhone_number(String phone_number) {
	        this.phone_number = phone_number;
	    }

	    // Getter and Setter for address
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    // Getter and Setter for types
	    public List<String> getTypes() {
	        return types;
	    }

	    public void setTypes(List<String> types) {
	        this.types = types;
	    }

	    // Getter and Setter for website
	    public String getWebsite() {
	        return website;
	    }
	    
	    public void setWebsite(String website) {
	        this.website = website;
	    }

	    // Getter and Setter for language
	    public String getLanguage() {
	        return language;
	    }

	    public void setLanguage(String language) {
	        this.language = language;
	    }

}
