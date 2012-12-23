



<div class="fieldcontain ${hasErrors(bean: cityInstance, field: 'ccode', 'error')} ">
	<label for="ccode">
		<g:message code="city.ccode.label" default="Ccode" />
		
	</label>
	<g:textField name="ccode" value="${cityInstance?.ccode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: cityInstance, field: 'country', 'error')} required">
	<label for="country">
		<g:message code="city.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="country" name="country.id" from="${Country.list()}" optionKey="id" required="" value="${cityInstance?.country?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: cityInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="city.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${cityInstance?.name}"/>
</div>

