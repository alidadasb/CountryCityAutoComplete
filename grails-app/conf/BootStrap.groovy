class BootStrap {

    def init = { servletContext ->
		
		final String COUNTRY1 = 'United Kingdom'
		final String COUNTRY2 = 'United States'
		final String CITY1='London'
		final String CITY2='Manchester'
		final String CITY3='Manhatten'
		final String CITY4='Chicago'
		if (!Country.findByName(COUNTRY1)) {
			new Country(name:COUNTRY1,ccode:'GB',language:'').save()
		}
		if (!Country.findByName(COUNTRY2)) {
			new Country(name:COUNTRY2,ccode:'US',language:'').save()
		}
		//if (!City.findByName(CITY1)) {
		//	new City(country:'1', name:CITY1,ccode:'GB').save()
		//}
		if (!City.findByName(CITY2)) {
			new City(country:COUNTRY1, name:CITY2,ccode:'GB').save()
		}
		//if (!City.findByName(CITY3)) {
		//	new City(country_Id:'2', name:CITY3,ccode:'US').save()
		//}
		//if (!City.findByName(CITY4)) {
		//	new City(country_id:'2', name:CITY4,ccode:'US').save()
		//}
    }
    def destroy = {
    }
}
