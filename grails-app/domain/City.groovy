

class City {
	//static belongsTo = [country:Country]
	static belogsTo = Country
	
	Country  country
	
	String name
	String ccode
    static constraints = {
    }
	
}
