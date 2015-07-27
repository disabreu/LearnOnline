import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_learnOnline_courseenrol_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/course/enrol.gsp" }
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
if(true && (message)) {
printHtmlPart(6)
expressionOut.print(message)
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (courses)) {
printHtmlPart(9)
for( course in (courses) ) {
printHtmlPart(10)
createTagBody(5, {->
printHtmlPart(11)
expressionOut.print(course.id)
printHtmlPart(12)
expressionOut.print(course.name)
printHtmlPart(13)
expressionOut.print(course.creditHours)
printHtmlPart(14)
})
invokeTag('link','g',18,['controller':("Course"),'action':("putCourseOnUser"),'id':(course.id)],5)
printHtmlPart(15)
expressionOut.print(course.professor)
printHtmlPart(16)
}
printHtmlPart(17)
}
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',25,['uri':("/")],3)
printHtmlPart(20)
}
else {
printHtmlPart(21)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',32,['uri':("/")],3)
printHtmlPart(20)
}
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',35,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435585314000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
