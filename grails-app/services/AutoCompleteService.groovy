/**
 * This service enables autoComplete using jQuery
 * dynamically find the domain and return the results
 * @author Alidad Soleimani
 */
 
import grails.converters.JSON

class AutoCompleteService {
	def grailsApplication
	def autocompleteAction (params) {
		def domainClass = grailsApplication.getDomainClass(params.domain).clazz
		def results = domainClass.createCriteria().list {
			ilike params.searchField, params.term + '%'
			maxResults(Integer.parseInt(params.max,10))
			order(params.searchField, params.order)
		}
		if (results.size()< 5){
			results = domainClass.createCriteria().list {
				ilike params.searchField, "%${params.term}%"
				maxResults(Integer.parseInt(params.max,10))
				order(params.searchField, params.order)
			}
		}
		results = results.collect {	[label:it."${params.collectField}"] }.unique()
		return results as JSON
	}

	def autocompleteCityAction (params) {	
		
		def results = City.createCriteria().list {
			country {
				eq('id',params.countryid as Long)
			}
			ilike params.searchField, params.term + '%'
			order(params.searchField, params.order)
		}
		
		results = results.collect {	[label:it."${params.collectField}"] }.unique()
		return results as JSON
	}
	
	def autocompleteCountry (params) {

		def domainClass = grailsApplication.getDomainClass(params.domain).clazz
		def query = { 
			or{
			ilike params.searchField, params.term + '%'
			
			}
			projections { // good to select only the required columns.
				property(params.collectField)
				property(params.searchField)
			}	
			maxResults(Integer.parseInt(params.max,10))
			order(params.searchField, params.order)
		}
		def query1 = {
			or{
				ilike params.searchField, "%${params.term}%"
			}
			
			projections { // good to select only the required columns.##
				property(params.collectField)
				property(params.searchField)
				
			}
			maxResults(Integer.parseInt(params.max,10))
			order(params.searchField, params.order)
		}
		
		def results =domainClass.createCriteria().list(query)
		if (results.size()< 5){
			results = domainClass.createCriteria().list(query1)
		}
		
		def countrySelectList = []
		results.each {
			def countryMap = [:]
			//countryMap.put(params.collectField, it[0])
			
		//	countryMap.put(params.searchField, it[1])
			countryMap.put('id', it[0])
			countryMap.put('label', it[1])
			countrySelectList.add(countryMap)
		}
		//return countrySelectList
		//results = results.collect {	[label:it."${params.collectField}"] }.unique()
		return countrySelectList as JSON
	}
}