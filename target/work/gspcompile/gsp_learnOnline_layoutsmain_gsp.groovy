import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_learnOnline_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Blackboard")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(3)
expressionOut.print(assetPath(src: 'apple-touch-icon.png'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'apple-touch-icon-retina.png'))
printHtmlPart(5)
invokeTag('javascript','asset',16,['src':("application.js")],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',17,[:],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',18,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
invokeTag('image','asset',20,['src':("Blackboard_logo.png"),'alt':("Grails")],-1)
printHtmlPart(8)
invokeTag('layoutBody','g',22,[:],-1)
printHtmlPart(9)
invokeTag('render','g',25,['template':("loginform")],-1)
printHtmlPart(10)
if(true && (!session.user)) {
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',27,['controller':("User"),'action':("register")],3)
printHtmlPart(13)
}
printHtmlPart(1)
if(true && (session.user)) {
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',32,['controller':("Course"),'action':("list")],3)
printHtmlPart(16)
if(true && (session.user.role == 'professor')) {
printHtmlPart(17)
createClosureForHtmlPart(18, 4)
invokeTag('link','g',34,['controller':("User"),'action':("list")],4)
printHtmlPart(19)
}
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',36,['controller':("Course"),'action':("enrol")],3)
printHtmlPart(22)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',37,['controller':("Course"),'action':("drop"),'id':(session.user.id)],3)
printHtmlPart(22)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',38,['controller':("User"),'action':("detail"),'id':(session.user.id)],3)
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('message','g',45,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435588322000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
