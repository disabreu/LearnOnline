import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_learnOnline_courseregister_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/course/register.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
if(true && (!session.user)) {
printHtmlPart(5)
createTagBody(3, {->
printHtmlPart(6)
invokeTag('field','g',17,['class':("form-control"),'type':("text"),'name':("name")],-1)
printHtmlPart(7)
invokeTag('field','g',23,['class':("form-control"),'type':("text"),'name':("lastname")],-1)
printHtmlPart(8)
invokeTag('field','g',29,['class':("form-control"),'type':("text"),'name':("email")],-1)
printHtmlPart(9)
invokeTag('field','g',35,['class':("form-control"),'type':("text"),'name':("username")],-1)
printHtmlPart(10)
invokeTag('field','g',41,['class':("form-control"),'type':("password"),'name':("password")],-1)
printHtmlPart(11)
invokeTag('select','g',47,['class':("form-control"),'name':("role"),'from':(roles)],-1)
printHtmlPart(12)
invokeTag('submitButton','g',52,['class':("btn btn-primary"),'name':("submit"),'value':("Register")],-1)
printHtmlPart(13)
})
invokeTag('form','g',55,['class':("form-horizontal"),'role':("form"),'controller':("User"),'action':("createUser")],3)
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',61,['uri':("/")],3)
printHtmlPart(16)
}
else {
printHtmlPart(17)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',68,['uri':("/")],3)
printHtmlPart(16)
}
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435182520000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
