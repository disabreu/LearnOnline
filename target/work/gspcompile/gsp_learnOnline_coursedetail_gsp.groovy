import learnonline.Course
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_learnOnline_coursedetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/course/detail.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(2)
if(true && (session.user)) {
printHtmlPart(5)
if(true && (course)) {
printHtmlPart(6)
expressionOut.print(course.id)
printHtmlPart(7)
expressionOut.print(course.name)
printHtmlPart(8)
expressionOut.print(course.creditHours)
printHtmlPart(9)
expressionOut.print(course.professor)
printHtmlPart(10)
expressionOut.print(course.description)
printHtmlPart(11)
}
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',21,['controller':("Course"),'action':("list")],3)
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',22,['uri':("/")],3)
printHtmlPart(16)
}
else {
printHtmlPart(17)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',27,['controller':("User"),'action':("register")],3)
printHtmlPart(19)
}
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',31,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435265692000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
