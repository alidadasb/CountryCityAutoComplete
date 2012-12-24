class BootStrap {

    def init = { servletContext ->
    	def c1 = Country.findOrSaveWhere(name:'United Kingdom',ccode:'GB',language:'')
    	def c2 = Country.findOrSaveWhere(name:'United States',ccode:'US',language:'')
		
		City.findOrSaveWhere(country:c1,name:'Manchester',ccode:'GB')
		City.findOrSaveWhere(country:c1,name:'London',ccode:'GB')
		City.findOrSaveWhere(country:c1,name:'Charlton',ccode:'GB')

		City.findOrSaveWhere(country:c2,name:'Manhatten',ccode:'GB')
		City.findOrSaveWhere(country:c2,name:'Chicago',ccode:'GB')
		City.findOrSaveWhere(country:c2,name:'Los Angeles',ccode:'GB')
    }
    def destroy = {
    }
}
