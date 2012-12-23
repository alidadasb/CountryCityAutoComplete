

/**
 * @author Alidad Soleimani
 */
	
class AnyController {
	def autoCompleteService
	//AutoCompleteService autoCompleteService
	def autocompleteAction= {
		render autoCompleteService.autocompleteAction(params)
	}
	def autocompleteCountry= {
		render autoCompleteService.autocompleteCountry(params)
	}
	def autocompleteCityAction= {
		render autoCompleteService.autocompleteCityAction(params)
	}
}
