/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.98
 * Generated at: 2024-12-19 00:20:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <link href=\"/css/layout.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"/css/index.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- header 부분 -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- --------------------------- <body> --------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("    <!-- content 부분 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"visual\" class=\"\">\r\n");
      out.write("        <div class=\"content-container\">\r\n");
      out.write("            <h2 class=\"hidden\">신규 강좌목록</h2>\r\n");
      out.write("            <!-- <ul class=\"mov-button\">\r\n");
      out.write("			<li class=\"prev-button\">이전</li>\r\n");
      out.write("			<li class=\"next-button\">다음</li>\r\n");
      out.write("		</ul> -->\r\n");
      out.write("            <ul class=\"banner\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <li class=\"banner1\">\r\n");
      out.write("                    <a href=\"customer/event/1\">\r\n");
      out.write("                        <img src=\"admin/board/event/1/banner-java.png\" data-id=\"1\" style=\"cursor: pointer;\" />\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"banner-button-list\" style=\"color:#ffff00; font-size:20px;position:absolute; left:10px; bottom:5px; z-index: 100px; display: flex; flex-direction: row;\">\r\n");
      out.write("                <li></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"notice\">\r\n");
      out.write("        <div class=\"content-container\">\r\n");
      out.write("            <span class=\"title\">제대로된 전문가들이 만들어가는 <span style=\"color:yellow;font-size:15px;\">IT PROFESSIONAL <span style=\"color:#00ffff;\">NEW</span>\r\n");
      out.write("                    ONLINE <span style=\"color:#00ffff;\">LECTURE</span> MARKET</span></span>\r\n");
      out.write("            <!--<a class=\"detail-button\">자세히</a>-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ----- 공지사항 줄 ------------------------------------------------------------------------------ -->\r\n");
      out.write("    <div id=\"information\">\r\n");
      out.write("        <div class=\"content-container\">\r\n");
      out.write("            <section class=\"guide\">\r\n");
      out.write("                <h1 class=\"title\">강의 플레이어 사용방법 안내</h1>\r\n");
      out.write("                <div class=\"margin-top\">\r\n");
      out.write("                    <a href=\"customer/faq/1\"><img src=\"images/customer/installInfo.png\" /></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- <div>\r\n");
      out.write("            2\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("            3\r\n");
      out.write("            </div> -->\r\n");
      out.write("            </section>\r\n");
      out.write("            <section class=\"course-info\">\r\n");
      out.write("                <h1 class=\"title text-center\">뉴렉처 하이브리드 과정 모집</h1>\r\n");
      out.write("                <ul class=\"list\">\r\n");
      out.write("                    <li>현재 모집 과정이 없습니다.</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </section>\r\n");
      out.write("            <section class=\"notice\">\r\n");
      out.write("                <h1 class=\"title\">공지사항</h1>\r\n");
      out.write("                <ul class=\"list margin-top\">\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span class=\"notice-title\">\r\n");
      out.write("                            <a href=\"notice/detail.html\">스프링 8강까지의 예제 코드</a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>2019-08-18</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span class=\"notice-title\">\r\n");
      out.write("                            <a href=\"notice/detail.html\">스프링 DI 예제 코드</a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>2019-08-15</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span class=\"notice-title\">\r\n");
      out.write("                            <a href=\"notice/detail.html\">뉴렉쌤 9월 초 국기과정 모집 안내</a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>2019-06-11</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span class=\"notice-title\">\r\n");
      out.write("                            <a href=\"notice/detail.html\">뉴렉처 강의 수강 방식 안내</a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>2019-05-24</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span class=\"notice-title\">\r\n");
      out.write("                            <a href=\"notice/detail.html\">자바 구조적인 프로그래밍 강의 예제 파일</a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>2019-04-24</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- ----- 커뮤니티 시작 줄 -------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- ----- 커뮤니티 시작 줄 -------------------------------------------------------------------------------------------- -->\r\n");
      out.write("    <!-- <div class=\"margin-top\">\r\n");
      out.write("	<div style=\"height: 170px; margin-top:10px;\" class=\"content-container border\">\r\n");
      out.write("	</div>\r\n");
      out.write("</div> -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ----- 강좌 목록 시작 줄 --------------------------------------------------------------------------------------------------------- -->\r\n");
      out.write("    <main id=\"course\">\r\n");
      out.write("        <section class=\"content-container list list-horizontal list-course list-course-index\">\r\n");
      out.write("            <h1>온라인 <span class=\"color-orange\">단과 과정</span></h1>\r\n");
      out.write("            <div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul>\r\n");
      out.write("                <!-- <li class=\"item-course normal new\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"course/16\"><img src=\"images/course/landing page.png\" /></a>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a href=\"course/16\"><span class=\"text-strong text-ellipsis\">멋진 프로그래머가 되기 위한 사전지식</span></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"price\">\r\n");
      out.write("                            <span class=\"normal \">\r\n");
      out.write("                                <span class=\"text-orange text-strong\">\r\n");
      out.write("                                    0\r\n");
      out.write("                                </span> 원\r\n");
      out.write("                            </span> <span class=\"event\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"footer text-strong\">\r\n");
      out.write("                            <span class=\"writer\">선생님 : newlec </span>\r\n");
      out.write("                            <span class=\"update\">개설일 : 2019-09-07\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"item-course normal new\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"course/10\"><img src=\"images/course/html5.png\" /></a>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a href=\"course/10\"><span class=\"text-strong text-ellipsis\">웹 표준기반의 웹 퍼블리싱 HTML5 편</span></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"price\">\r\n");
      out.write("                            <span class=\"normal \">\r\n");
      out.write("                                <span class=\"text-orange text-strong\">\r\n");
      out.write("                                    45,000\r\n");
      out.write("                                </span> 원\r\n");
      out.write("                            </span> <span class=\"event\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"footer text-strong\">\r\n");
      out.write("                            <span class=\"writer\">선생님 : newlec </span>\r\n");
      out.write("                            <span class=\"update\">개설일 : 2019-09-07\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <li class=\"item-course normal event\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"course/8\"><img src=\"images/course/oracle.png\" /></a>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a href=\"course/8\"><span class=\"text-strong text-ellipsis\">Oracle SQL 프로그래밍</span></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"price\">\r\n");
      out.write("                            <span class=\"normal deprecated\">\r\n");
      out.write("                                <span class=\"text-gray\">\r\n");
      out.write("                                    44,000\r\n");
      out.write("                                </span> 원\r\n");
      out.write("                            </span> <span class=\"event\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <span class=\"color-red text-strong\">\r\n");
      out.write("                                    0\r\n");
      out.write("                                </span>원\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"footer text-strong\">\r\n");
      out.write("                            <span class=\"writer\">선생님 : newlec </span>\r\n");
      out.write("                            <span class=\"update\">개설일 : 2019-09-07\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"item-course normal normal\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"course/7\"><img src=images/course/spring.png\" /></a>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a href=\"course/7\"><span class=\"text-strong text-ellipsis\">스프링 3.x MVC 웹 프로그래밍</span></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"price\">\r\n");
      out.write("                            <span class=\"normal \">\r\n");
      out.write("                                <span class=\"text-orange text-strong\">\r\n");
      out.write("                                    33,600\r\n");
      out.write("                                </span> 원\r\n");
      out.write("                            </span> <span class=\"event\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"footer text-strong\">\r\n");
      out.write("                            <span class=\"writer\">선생님 : newlec </span>\r\n");
      out.write("                            <span class=\"update\">개설일 : 2019-09-07\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li> -->\r\n");
      out.write("                <li class=\"item-course normal event\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"course/2\"><img src=\"images/course/java.png\" /></a>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a href=\"course/2\"><span class=\"text-strong text-ellipsis\">자바 프로그래밍</span></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"price\">\r\n");
      out.write("                            <span class=\"normal deprecated\">\r\n");
      out.write("                                <span class=\"text-gray\">\r\n");
      out.write("                                    22,000\r\n");
      out.write("                                </span> 원\r\n");
      out.write("                            </span> <span class=\"event\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <span class=\"color-red text-strong\">\r\n");
      out.write("                                    0\r\n");
      out.write("                                </span>원\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"footer text-strong\">\r\n");
      out.write("                            <span class=\"writer\">선생님 : newlec </span>\r\n");
      out.write("                            <span class=\"update\">개설일 : 2019-09-07\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"more\">\r\n");
      out.write("                <!-- <span class=\"border padding\">단과 과정 목록 더보기</span> -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- ------- 온라인 패키지 과정 ------------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content-container\">\r\n");
      out.write("            <h3 class=\"-text- center green bold -margin- top\">협력업체</h3>\r\n");
      out.write("            <ul class=\"-list- horizontal center -margin- bottom top b20\">\r\n");
      out.write("                <li><a target=\"_blank\" href=\"http://www.notepubs.com\"><img src=\"images/notepubs.png\" alt=\"노트펍스\" /></a></li>\r\n");
      out.write("                <li><a target=\"_blank\" href=\"http://www.namoolab.com\"><img src=\"images/namoolab.png\" alt=\"나무랩연구소\" /></a></li>                \r\n");
      out.write("               \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- ------------------- <footer> --------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
