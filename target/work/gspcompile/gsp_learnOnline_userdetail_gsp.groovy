import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_learnOnline_userdetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/detail.gsp" }
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
if(true && (session.user)) {
printHtmlPart(5)
if(true && (user)) {
printHtmlPart(6)
expressionOut.print(user.name)
printHtmlPart(7)
expressionOut.print(user.lastName)
printHtmlPart(8)
expressionOut.print(user.role)
printHtmlPart(9)
expressionOut.print(user.id)
printHtmlPart(10)
expressionOut.print(user.username)
printHtmlPart(11)
expressionOut.print(user.email)
printHtmlPart(12)
if(true && (user.courses)) {
printHtmlPart(13)
for( course in (user.courses) ) {
printHtmlPart(14)
expressionOut.print(course.id)
printHtmlPart(15)
expressionOut.print(course.name)
printHtmlPart(16)
}
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (session.user.role == 'professor')) {
printHtmlPart(20)
createClosureForHtmlPart(21, 4)
invokeTag('link','g',31,['controller':("User"),'action':("list")],4)
printHtmlPart(22)
}
printHtmlPart(20)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',33,['uri':("/")],3)
printHtmlPart(24)
}
else {
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',38,['controller':("User"),'action':("register")],3)
printHtmlPart(27)
}
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',42,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435589687000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
