

    /**
     * This tag enables autoComplete using jQuery
     * @author Alidad Soleimani
     */
     
    class AutoCompleteTagLib {
            def autoComplete = {attrs ->
                    if (attrs.id == null)
                            throwTagError("Tag [autoComplete] is missing required attribute [id]")
     
                    if (attrs.controller == null)
                            throwTagError("Tag [autoComplete] is missing required attribute [controller]")
     
                    if (attrs.action == null)
                            throwTagError("Tag [autoComplete] is missing required attribute [action]")
     
                    if (attrs.domain == null)
                            throwTagError("Tag [autoComplete] is missing required attribute [domain]")
     
                    if (attrs.searchField == null)
                            throwTagError("Tag [autoComplete] is missing required attribute [searchField]")
     
                    def clazz = ""
                    def name = ""
					def cid=""
                    def styles = ""
					def var1="";
                    if (!attrs.max) attrs.max = 10
                    if (!attrs.value) attrs.value =""
					if (!attrs.countryUid) attrs.countryUid =""
			
					if (attrs.cid ==null ) attrs.cid =""
                    if (!attrs.order) attrs.order = "asc"
                    if (!attrs.collectField) attrs.collectField = attrs.searchField
                    if (attrs.class) clazz = " class='${attrs.class}'"
                    if (attrs.style) styles = " styles='${attrs.style}'"
                    if (attrs.name)
                            name = " name ='${attrs.name}'"
                    else
                            name = " name ='${attrs.id}'"
     
                    def link = ['action': attrs.action , 'controller': attrs.controller ]
                    out << " <input type='text' ${clazz} id='${attrs.id}' value = '${attrs.value}' ${styles} ${name} />"
                    out << "<script type='text/javascript'>"
					
                    out << " \$(document).ready(function() {"
					
		
                    out << "\$('#" + attrs.id+"').autocomplete({ "
                    out << " source: "
                    out << " function(request, response) { "
                    out << " \$.getJSON(' "
                    out << createLink(link)
                    out << "?"
                    out << "term=' + request.term + '"
					out << "&domain="+ attrs.domain
                    out << "&searchField="+attrs.searchField
                    out << "&max="+attrs.max
                    out << "&order="+attrs.order
                    out << "&collectField="+attrs.collectField
                    out << "', { countryid: \$('#hiddenField').val() },  "
                    out << " response);  } "
                    out << ", dataType: 'json'"
                    out << "});});"
                    out << "</script>"
            }
     
            def autoCompleteHeader = {
                    out << "<style>"
                    out <<  ".ui-autocomplete-loading"
                    out << "        { background: white url(${resource(dir:'images',file:'ajax-loader.gif')}) right center no-repeat   }"
                    out << " </style>"
            }
    }