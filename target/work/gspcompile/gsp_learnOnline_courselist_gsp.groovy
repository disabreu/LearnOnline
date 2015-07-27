import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_learnOnline_courselist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/course/list.gsp" }
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
if(true && (courses)) {
printHtmlPart(6)
for( course in (courses) ) {
printHtmlPart(7)
createTagBody(5, {->
printHtmlPart(8)
expressionOut.print(course.id)
printHtmlPart(9)
expressionOut.print(course.name)
printHtmlPart(10)
expressionOut.print(course.creditHours)
printHtmlPart(11)
})
invokeTag('link','g',14,['controller':("Course"),'action':("detail"),'id':(course.id)],5)
printHtmlPart(12)
expressionOut.print(course.professor)
printHtmlPart(13)
}
printHtmlPart(14)
}
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',20,['uri':("/")],3)
printHtmlPart(17)
}
else {
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',25,['controller':("User"),'action':("register")],3)
printHtmlPart(20)
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',29,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435264476000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
