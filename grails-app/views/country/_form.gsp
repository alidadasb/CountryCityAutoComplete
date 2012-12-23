



<div class="fieldcontain ${hasErrors(bean: countryInstance, field: 'ccode', 'error')} ">
	<label for="ccode">
		<g:message code="country.ccode.label" default="Ccode" />
		
	</label>
	<g:textField name="ccode" value="${countryInstance?.ccode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: countryInstance, field: 'cities', 'error')} ">
	<label for="cities">
		<g:message code="country.cities.label" default="Cities" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${countryInstance?.cities?}" var="c">
    <li><g:link controller="city" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="city" action="create" params="['country.id': countryInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'city.label', default: 'City')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: countryInstance, field: 'language', 'error')} ">
	<label for="language">
		<g:message code="country.language.label" default="Language" />
		
	</label>
	<g:textField name="language" value="${countryInstance?.language}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: countryInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="country.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${countryInstance?.name}"/>
</div>

