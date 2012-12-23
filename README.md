This is a grails project where I have been testing auto complete functionality, I am trying to combine two auto completes, so when a user selects a country, the country ID is passed on to citySearch and then city names are only shown that match the selected country(first auto complete)

It is very close but for some strange reason I can not actually get it to recognise the countryID within citySearch, the value is for sure returned since I have used java script alerts to display the values both in the modified autoCompleteTagLib for country within select: function as well as the top of the gsp page in example2.gsp at the top within $('#citySearch').focus(function() {



http://alidadasb.blogspot.co.uk/2011/12/enabling-jquery-autocomplete-with.html?

http://stackoverflow.com/questions/13936216/grails-jquery-auto-complete-selected-id-for-another-secondary-auto-complete-func

if anyone can help answer what is going wrong I would very much appreciate

Provided is both the war file and entire test project simply download all files and within the folder run

grails run-app

You will need to create a few cities since it fails to generate test cities.... its my lack of grails knowlege.


