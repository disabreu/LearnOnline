import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_learnOnline_userlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(1)
if(true && (session.user)) {
printHtmlPart(4)
if(true && (users)) {
printHtmlPart(5)
for( user in (users) ) {
printHtmlPart(6)
createTagBody(5, {->
expressionOut.print(user.name)
printHtmlPart(7)
expressionOut.print(user.lastName)
printHtmlPart(8)
expressionOut.print(user.role)
printHtmlPart(9)
})
invokeTag('link','g',13,['controller':("User"),'action':("detail"),'id':(user.id)],5)
printHtmlPart(10)
expressionOut.print(user.username)
printHtmlPart(11)
expressionOut.print(user.email)
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',20,['uri':("/")],3)
printHtmlPart(16)
}
else {
printHtmlPart(17)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',25,['controller':("User"),'action':("register")],3)
printHtmlPart(19)
}
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',29,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435266761000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
