<%@ page import="Country" %>
<%@ page import="City" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'country.label', default: 'Country')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	<g:javascript library="jquery"/>
		<g:javascript library="jquery-ui"/>

	</head>
	<body>


 
<style type="text/css">
.ui-autocomplete-loading {
        background: white       url(${ resource(dir :       'images', file : 'ajax-loader.gif')}) right center no-repeat }
</style>


      <g:form action="example3" method="post" >



<label>Country:</label>
<g:autoCompleteCountry id="countrySearch"
                action='autocompleteCountry'
                controller='any'
                domain='Country'
                searchField='name'
                collectField='id'
                value=''
               
   
/>


<g:textField id="hiddenField"  name="hiddenField" value=""/>


<label>City:</label>
<g:autoComplete id="citySearch" name="citySearch"
                action='autocompleteCityAction'
                controller='any'
                domain='City'
                searchField='name'
                value=''
/>
<div class="buttons">
                     <span class="formButton">
                        <input type="submit" value="submit"></input>
                     </span>
               </div>
            </g:form>


</body>
</html>
