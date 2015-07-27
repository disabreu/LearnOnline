import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_learnOnline_loginform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_loginform.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
if(true && (!session.user)) {
printHtmlPart(0)
createTagBody(2, {->
printHtmlPart(1)
invokeTag('field','g',3,['class':("form-control"),'type':("text"),'name':("username"),'placeholder':("Enter username")],-1)
printHtmlPart(2)
invokeTag('field','g',4,['class':("form-control"),'type':("password"),'name':("password"),'placeholder':("Enter password")],-1)
printHtmlPart(3)
invokeTag('submitButton','g',5,['class':("btn btn-default"),'name':("submit"),'value':("Login")],-1)
printHtmlPart(0)
})
invokeTag('form','g',6,['class':("form-inline"),'role':("form"),'controller':("User"),'action':("login")],2)
printHtmlPart(4)
}
else {
printHtmlPart(0)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(session.user.name)
printHtmlPart(6)
expressionOut.print(session.user.lastName)
printHtmlPart(7)
expressionOut.print(session.user.role)
printHtmlPart(8)
invokeTag('submitButton','g',11,['class':("btn btn-default"),'name':("submit"),'value':("Logout")],-1)
printHtmlPart(0)
})
invokeTag('form','g',12,['class':("form-inline"),'role':("form"),'controller':("User"),'action':("logout")],2)
printHtmlPart(4)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435174995000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
