/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.98
 * Generated at: 2024-12-19 00:21:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>코딩 전문가를 만들기 위한 온라인 강의 시스템</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>공지사항목록</title>\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"/css/customer/layout.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("    <style>\r\n");
      out.write("    \r\n");
      out.write("        #visual .content-container{	\r\n");
      out.write("            height:inherit;\r\n");
      out.write("            display:flex; \r\n");
      out.write("            align-items: center;\r\n");
      out.write("            \r\n");
      out.write("            background: url(\"../../images/customer/visual.png\") no-repeat center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- header 부분 -->\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<!-- --------------------------- <visual> --------------------------------------- -->\r\n");
      out.write("	<!-- visual 부분 -->\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"visual\">\r\n");
      out.write("		<div class=\"content-container\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- --------------------------- <body> --------------------------------------- -->\r\n");
      out.write("	<div id=\"body\">\r\n");
      out.write("		<div class=\"content-container clearfix\">\r\n");
      out.write("\r\n");
      out.write("			<!-- --------------------------- aside --------------------------------------- -->\r\n");
      out.write("			<!-- aside 부분 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<aside class=\"aside\">\r\n");
      out.write("				<h1>고객센터</h1>\r\n");
      out.write("\r\n");
      out.write("				<nav class=\"menu text-menu first margin-top\">\r\n");
      out.write("					<h1>고객센터메뉴</h1>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a class=\"current\"  href=\"/customer/notice\">공지사항</a></li>\r\n");
      out.write("						<li><a class=\"\"  href=\"/customer/faq\">자주하는 질문</a></li>\r\n");
      out.write("						<li><a class=\"\" href=\"/customer/question\">수강문의</a></li>\r\n");
      out.write("						<li><a class=\"\" href=\"/customer/event\">이벤트</a></li>\r\n");
      out.write("						\r\n");
      out.write("					</ul>\r\n");
      out.write("				</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<nav class=\"menu\">\r\n");
      out.write("		<h1>협력업체</h1>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a target=\"_blank\" href=\"http://www.notepubs.com\"><img src=\"/images/notepubs.png\" alt=\"노트펍스\" /></a></li>\r\n");
      out.write("			<li><a target=\"_blank\" href=\"http://www.namoolab.com\"><img src=\"/images/namoolab.png\" alt=\"나무랩연구소\" /></a></li>\r\n");
      out.write("						\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("					\r\n");
      out.write("			</aside>\r\n");
      out.write("			<!-- --------------------------- main --------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<main>\r\n");
      out.write("				<h2 class=\"main title\">공지사항</h2>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"breadcrumb\">\r\n");
      out.write("					<h3 class=\"hidden\">breadlet</h3>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li>home</li>\r\n");
      out.write("						<li>고객센터</li>\r\n");
      out.write("						<li>공지사항</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"margin-top first\">\r\n");
      out.write("						<h3 class=\"hidden\">공지사항 내용</h3>\r\n");
      out.write("						<table class=\"table\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>제목</th>\r\n");
      out.write("									<td class=\"text-align-left text-indent text-strong text-orange\" colspan=\"3\">스프링 8강까지의 예제 코드</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>작성일</th>\r\n");
      out.write("									<td class=\"text-align-left text-indent\" colspan=\"3\">2019-08-18	</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>작성자</th>\r\n");
      out.write("									<td>newlec</td>\r\n");
      out.write("									<th>조회수</th>\r\n");
      out.write("									<td>148</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>첨부파일</th>\r\n");
      out.write("									<td colspan=\"3\"></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr class=\"content\">\r\n");
      out.write("									<td colspan=\"4\">안녕하세요. 뉴렉처입니다.<div><br></div><div>현재 진행중인 스프링 DI 8강까지의 예제입니다.</div><div><br></div><div><a href=\"http://www.newlecture.com/resource/spring2.zip\"><b><u><font size=\"5\" color=\"#dd8a00\">예제 다운로드하기</font></u></b></a></div><div><br></div><div><br></div></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"margin-top text-align-center\">\r\n");
      out.write("						<a class=\"btn btn-list\" href=\"list.html\">목록</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"margin-top\">\r\n");
      out.write("						<table class=\"table border-top-default\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>다음글</th>\r\n");
      out.write("									<td colspan=\"3\"  class=\"text-align-left text-indent\">다음글이 없습니다.</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								\r\n");
      out.write("									\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>이전글</th>\r\n");
      out.write("									<td colspan=\"3\"  class=\"text-align-left text-indent\"><a class=\"text-blue text-strong\" href=\"\">스프링 DI 예제 코드</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>			\r\n");
      out.write("					\r\n");
      out.write("			</main>		\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("    <!-- ------------------- <footer> --------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
